package collarrayprac;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import jsonBindings3.Util;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class looping {

    public static void main (String[] args) throws JsonProcessingException, JSONException {

        Double d1 = 0.0024;
        Double d2 = 0.00;

        if (d1.compareTo(d2) > 0){
            System.out.println("d1 is greater");
            System.out.println(d1.compareTo(d2));
        } else {
            System.out.println("d1 is smaller");

        }



        employee emp1 = new employee();
        emp1.setFirstname("mark");
        emp1.setLastname("james");
        emp1.setAge(20);
        emp1.setEmail("mark@gmail.com");

        employee emp2 = new employee();
        emp2.setFirstname("luke");
        emp2.setLastname("andrew");
        emp2.setAge(30);
        emp2.setEmail("luke@gmail.com");

        employee emp3 = new employee();
        emp3.setFirstname("Tony");
        emp3.setLastname("John");
        emp3.setAge(25);
        emp3.setEmail("tony@gmail.com");

        List<employee> empout = new ArrayList<>();

        empout.add(emp1);
        empout.add(emp2);
        empout.add(emp3);


        //////////////////////////////list//////////////
        List<employee> listemp = empout.stream().filter(s -> s.getAge() > 20 && s.getFirstname()
                .contains("T")).collect(Collectors.toList());
        System.out.println("*****" + listemp);

        List<Integer> listage = empout.stream().map(employee::getAge).collect(Collectors.toList());

        System.out.println("===== age ==== " + listage);

        ///////////////////////////////////////////////

        ObjectMapper mapper = new ObjectMapper();

            String str = mapper.writeValueAsString(empout);
            System.out.println(empout);
            System.out.println(str);


        //mapping mapemployee to employee

        JSONArray jarray = new JSONArray(str);

        Collection<mapemployee> emp = new ArrayList<>();

        for (int i = 0; i < jarray.length(); i++) {

            mapemployee mapemp = new mapemployee();
            JSONObject entry = jarray.getJSONObject(i);
           // Map<String, Object> entry = reqlist.get(i);

            mapemp.setName(entry.getString("firstname"));
            mapemp.setMail(entry.getString("email"));

            emp.add(mapemp);

        }

        System.out.println("usingcollection==========" + emp);

        empout.forEach((ss) -> {

            mapemployee mapemps = new mapemployee();
            mapemps.setName(ss.getFirstname());

            emp.add(mapemps);
        });
        System.out.println("====***======" + emp);

    }


}
