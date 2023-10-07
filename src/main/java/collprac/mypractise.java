package collprac;

import collarrayprac.Assessment;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import jsonBindings3.Dclient;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mypractise {

   public static void main (String[] args) throws IOException {

       String jsonData = "[{ASSESSMENTID=1855182, TAXID=1855333, ASSTYPE=MANUAL_DUTY, ASSNO=627733, ASSYEAR=2023, ASSSTATUS=Activated, COMPANYNAME=CHEKOR BLESSING ENERI, NCSPAID=1, ASSSERIAL=M, AMOUNT=15000, TAXCODE=FEE, NARRATION=FEES | OTHER/SUNDRY FEES, REFERENCE=MANCSD23159, CBNACCOUNT=3000008059, CUSTOMERACCOUNT=6980542003, CUSTOMERNAME=Walk in Customer, TSANAME=0220011001000-C0039-P00417, TSACODE=FEE, ITEMCODE=C0039, NDCC=0, NDCCAMT=0, TSAREFERENCE=FIB02070000001855333, PORTCODE=01TC, PORTNAME=TINCAN, NOTIFY=1}, {ASSESSMENTID=1888030, TAXID=1888993, ASSTYPE=MANUAL_DUTY, ASSNO=627729, ASSYEAR=2023, ASSSTATUS=Activated, COMPANYNAME=NICHOLAS OLUCHUKWU NJOKU, NCSPAID=1, ASSSERIAL=M, AMOUNT=15000, TAXCODE=FEE, NARRATION=FEES | OTHER/SUNDRY FEES, REFERENCE=MANCSD23174, CBNACCOUNT=3000008059, CUSTOMERACCOUNT=6011897766, CUSTOMERNAME=Walk in Customer, TSANAME=0220011001000-C0039-P00417, TSACODE=FEE, ITEMCODE=C0039, NDCC=0, NDCCAMT=0, TSAREFERENCE=FIB02070000001888993, PORTCODE=01AP, PORTNAME=APAPA, NOTIFY=1}]";

       ObjectMapper objectMapper = new ObjectMapper();
       try {
           JsonNode jsonNode = objectMapper.readTree(jsonData);

           for (JsonNode node : jsonNode) {
               long assessmentId = node.get("ASSESSMENTID").asLong();
               System.out.println("ASSESSMENTID: " + assessmentId);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

       String splitref = "MANUAL DTYCSD23024";
       if (splitref.contains("")) {
         //  System.out.println(splitref.substring(6, 18));
           String[] splitnarr = splitref.split("\\ ");
           System.out.println("=======" + splitnarr[1]);
           splitnarr[1].replaceAll("\\s", "");
           System.out.println(splitnarr[1].replaceAll("\\s", ""));
       } else {
           System.out.println("does not existS");

       }


       String file = "D:\\monday-files\\jsonfile2.json";
       String json = readFileAsString(file);
       System.out.println(json);

       ObjectMapper mapper = new ObjectMapper();
       String strs = "{\n \"postings\": [\n{\n\"UC\":\"OD246\", \n\"CI\":\"OD248\",\n\"CC\":\"OD297\", \n\"CM\":\"OD249\" \n},\n{\n\"UC\":\"OD246\", \n\"CI\":\"OD298\",\n\"CC\":\"OD297\", \n\"CM\":\"OD249\" \n},\n\t{\n\"UC\":\"OD236\", \n\"CI\":\"OD228\",\n\"CC\":\"OD217\", \n\"CM\":\"OD299\" \n}\n\t]\n};";
       String strss = "{\"responseCode\": 49,\"responseMessage\": \"The withdrawal amount cannot exceed the account balance.[  M145963/   2]\",\"transId\": null,\"transDate\": null,\"errorList\": [\"The withdrawal amount cannot exceed the account balance.[  M145963/   2]\",\"Scheme Updates Failed[  M145963/   2]\"]}";
       Map<String, Object> request = new Gson().fromJson(strss, Map.class);

       List<Map<String, Object>> ss = (List<Map<String, Object>>) request.get("errorList");

       //////////////////////////////
       ///JSONObject jsonob = new JSONObject(json);

       String j = ss.toString();

       String responmsg = (String) request.get("responseMessage");
       System.out.println("uuuuuuuuuuuuuuu : " + responmsg + "-" + j);
       try {
           JSONObject jstring = new JSONObject(json);
           /*String acct = jstring.getString("accountNo");
           System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwww " + acct);*/
           //JSONObject lang = jstring.getJSONObject("languages");
           JSONArray jarray = jstring.getJSONArray("languages");

           List<Dclient> dclient = new ArrayList<>();

           //Dclient dc = new Dclient();

           for(int s = 0; s < jarray.length(); s++){

               Dclient dc = new Dclient();
               JSONObject dcarray = jarray.getJSONObject(s);

               dc.setCName(dcarray.getString("French"));
               dc.setCCodes(dcarray.getString("Spanish"));

               dclient.add(dc);
           }

           String clientstr = mapper.writeValueAsString(dclient);

           System.out.println(clientstr);

           Map<String, List<Dclient>> result = dclient.stream().collect(Collectors.groupingBy(Dclient::getCName));
            System.out.println("ttttttttttttttt" + result);


           // result.values().forEach(x -> x.stream().sorted(Comparator.comparing(Dclient::getCCodes)).forEach());

       } catch (Exception e){
           e.printStackTrace();
       }

   }

   //READ JSON FILE
    public static String readFileAsString(String file) throws IOException {
            return new String(Files.readAllBytes(Paths.get(file)));
       }

}
