package collarrayprac;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class jsonbuild {

    public static void main (String[] args) {


        String file = "D:\\monday-files\\JSONFILES\\postjson.txt";
        try {
            String getfile = readFileAsString(file);
            //  System.out.println(getfile);

            JSONObject jsonObject = new JSONObject(getfile);

            JSONArray jsonArray = jsonObject.getJSONArray("postings");

            String date = null;
            String txnCode = null;

            JSONArray jsonArray1 = new JSONArray();

            for (int i = 0; i<jsonArray.length(); i++){

                JSONObject getArray = jsonArray.getJSONObject(i);
                String keyref = getArray.getString("pairKeyRef");
                String creditDebitFlag = getArray.getString("postingAction");

                JSONObject json = new JSONObject();
                json.put("account", getArray.getString("accountNo"));
                json.put("creditDebitFlag", getArray.getString("postingAction"));
                json.put("amount", getArray.getString("amount"));
                json.put("currencyCode", getArray.getString("currency"));
                json.put("rate", getArray.getString("transactionRate"));
                json.put("keyref", getArray.getString("pairKeyRef"));
                json.put("serialNumber", getArray.getString("serialNo"));

                date = getArray.getString("valueDate");
                txnCode = getArray.getString("txnCode");
                jsonArray1.put(json);
            }
            //System.out.println(jsonArray1);
            System.out.println(date);

            JSONObject newobj = new JSONObject();
            newobj.put("reqId", jsonObject.getString("txnRef"));
            newobj.put("tranSubType", txnCode);
            newobj.put("valueDate", date);
            newobj.put("tranEntries", jsonArray1);
            newobj.put("overridePND", false);
            System.out.println(newobj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //READ JSON FILE
    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

}
