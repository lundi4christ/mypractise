package collprac;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class excelToJson {

    public static void main(String[] args) throws IOException, JSONException {
        //Out put JSONArray
        JSONArray data = new JSONArray();

        //Read the File
        FileInputStream fileInputStream = new FileInputStream("D:\\monday-files\\QL.xls");

        //Load the file into workbook using Apache POI
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rows = sheet.iterator();
        int index = 0;
        while(rows.hasNext()) {
            Row row = rows.next();
            if(index!=0) {
                //Add to JSON Array
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("NUMBER", row.getCell(0).getStringCellValue());
                jsonObject.put("NAME", row.getCell(1).getStringCellValue());
                data.put(jsonObject);
            }
            index++;
        }

        //print JsonArray
        System.out.println(data.toString());
    }
}

/// LICENSE GENERATOR
class testit {

    public static void main (String[] args){

        StandardPBEStringEncryptor strdecript = new StandardPBEStringEncryptor();

        strdecript.setPassword("$2a$10$N0kE.nVKhr1k1a.W2Vgn1..GhRMDoJTlnVjLYOQ2ke/BYuAe7dxpa");
        //no of days before warning
        String s = "+3M3Relyl6QvFABntWAsjg==";
        String nodaysbeforewarning = strdecript.decrypt(s);
        //LICENSE_EXPIRY_GRACE_NO_OF_DAYS
        String s2 = "jNBveg8GMgnqnJKt+L57aA==";
        String licencexpirygracedays = strdecript.decrypt(s2);
        //LICENSE_EXPIRY_DATE
        String s3 = "vPn0lmnXSwmmU7t7NFcGbvVVAidkg9nRrA15QxxP/X2kKS/xsNvE2Q==";
        String licenseexpirydate = strdecript.decrypt(s3);
        System.out.println("No of days before warning === " + nodaysbeforewarning);
        System.out.println("LICENSE_EXPIRY_GRACE_NO_OF_DAYS === " + licencexpirygracedays);
        System.out.println("LICENSE_EXPIRY_DATE === " + licenseexpirydate);

        try {
            String pattern = "yyyy-MM-d";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date expirydate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(licenseexpirydate);
            String ss = simpleDateFormat.format(expirydate);
            Date date = simpleDateFormat.parse(ss);
            System.out.println("=== date ==  " + ss);

            int num = 366;
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_MONTH, num);
            Date date2 = cal.getTime();
            System.out.println(date2);

        } catch (Exception e){
            e.printStackTrace();
        }


        LocalDate currentLocalDate = LocalDate.of(2024, 10, 2);
        ZoneId systemTimeZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = currentLocalDate.atStartOfDay(systemTimeZone);
        Date utilDate = Date.from(zonedDateTime.toInstant());
        System.out.println("<<<<<< Date String >>>>>> " + utilDate.toString());

    }
}
