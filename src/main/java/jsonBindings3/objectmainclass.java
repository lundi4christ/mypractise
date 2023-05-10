package jsonBindings3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.util.Assert;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class objectmainclass {

    public static void main (String[] args) throws IOException, JSONException {

        Obsini obs = new Obsini();
        obs.setBankName("National Bank");
        obs.setBankBranch("VI");
        obs.setCountryName("Nigeria");

        List<String> countrycode = new ArrayList<>();
        countrycode.add("202020");
        countrycode.add("203020");
        countrycode.add("30303030");
        obs.setCountryCodes(countrycode);

        List<String> bankcode = new ArrayList<>();
        bankcode.add("NB20203");
        bankcode.add("NB303020");
        bankcode.add("NB300202");
        obs.setBankCodes(bankcode);

        Client client = new Client();
        client.setClientName("Mr. James");
        client.setClientID(2020);
        client.setClientCodes("MJ2020");
        client.setCity("LG");
        client.setLocation("LG");

        Client client2 = new Client();
        client2.setClientName("Mr. Mark");
        client2.setClientID(2020);
        client2.setClientCodes("MJ2020");
        client2.setCity("LG");
        client2.setLocation("LG");

        List<Client> dclient = new ArrayList<>();
        dclient.add(client);
        dclient.add(client2);

        obs.setClient(dclient);

        Operations op1 = new Operations();
        op1.setOpsID("2020");
        op1.setOpsCode("OP2020");
        op1.setOpsLocs("SOEOW");
        op1.setOpsTT("OPTT");
        op1.setOpsName("Operations");

        Operations op2 = new Operations();
        op2.setOpsID("2020");
        op2.setOpsCode("OP2020");
        op2.setOpsLocs("SYEOW");
        op2.setOpsTT("OPOT");
        op2.setOpsName("Operations");

        List<Operations> operations = new ArrayList<>();
        operations.add(op1);
        operations.add(op2);

        obs.setOperations(operations);

        ContactDetails contact = new ContactDetails();
        contact.setFirstName("Mr. James");
        contact.setLastName("Mark");
        contact.setPhone("02020302020");
        contact.setEmail("james@gmail.com");

        obs.setContactdetails(contact);

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(obs);

        System.out.println(str);

        JSONObject jobject = new JSONObject(str);

        String s = jobject.getString("countryCodes");

        System.out.println("=======" + s);

        String a = jobject.getString("client");
        System.out.println(a);

        Map<String, Object> request = new Gson().fromJson(str, Map.class);
        List<Map<String, Object>> sclient = (List<Map<String, Object>>) request.get("client");

        List<Dclient> trans = new ArrayList<>();

        for(int i=0; i<sclient.size(); i++){

            Dclient dc = new Dclient();
            Map<String, Object> entry = sclient.get(i);

            dc.setCName(Util.StringValue(Util.findByKeyIgnoreCase("clientName", entry)));

            trans.add(dc);
        }

        String dcreq = mapper.writeValueAsString(trans);

        System.out.println ("--------" + dcreq);

        System.out.println(" ====" + String.format("%.0f", 50.005));

    // Aliter 2 using JSONObject and JSONArray
        String strs = "{\n \"postings\": [\n{\n\"UC\":\"OD246\", \n\"CI\":\"OD248\",\n\"CC\":\"OD297\", \n\"CM\":\"OD249\" \n},\n{\n\"UC\":\"OD266\", \n\"CM\":\"OD249\" \n},\n\t{\n\"UC\":\"OD236\", \n\"CI\":\"OD228\",\n\"CC\":\"OD217\", \n\"CM\":\"OD299\" \n}\n\t]\n};";
        ObjectMapper mappers = new ObjectMapper();
        JSONObject jsobject = new JSONObject(strs);
        /*String ss = jsobject.getString("postings");
        System.out.println("uuuuuuuuuuuuuuuuuuuuuu" + ss);*/
        JSONArray jsonArray = jsobject.getJSONArray("postings");
        System.out.println("ssssssssss" + jsonArray);
        List<String> tdata = new ArrayList<>();

        List<Dclient> tr = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {

            Dclient dcc = new Dclient();
            // store each object in JSONObject
            JSONObject explrObject = jsonArray.getJSONObject(i);
            //System.out.println("wwwwwww " + explrObject.getString("CI"));
            String strsss = explrObject.optString("CI");
            // get field value from JSONObject using get() method
            dcc.setCName((String) explrObject.get("UC"));
            dcc.setCCodes((String) explrObject.get("UC"));

            tdata.add(strsss);

            tr.add(dcc);
        }
        String strrr = mappers.writeValueAsString(tr);

        System.out.println("ttttttttttt " + strrr);

        System.out.println(tdata.get(2));

    }
}
