package collarrayprac;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

public class dlist {

    public static void main (String[] args) throws JsonProcessingException {

        List<String> str = new ArrayList<>();
        str.add("mark");
        str.add("luke");
        str.add("mary");
        str.add("mark");

        Collections.addAll(str,"romans", "james");
        Collections.sort(str);

        System.out.println(str);

        for(String strs : str){

            System.out.println("rrrrrrrrrrrrrrrrr" +strs);
        }

        Iterator iter = str.listIterator();

        while(iter.hasNext()){

            String dstr = (String) iter.next();

            if(dstr.contains("s")){
                System.out.println("aaaaa aaaa " + dstr);
            }
        }

        List<employee> emplist = new ArrayList<>();
        employee emp2 = new employee();
        emp2.setFirstname("luke");
        emp2.setLastname("andrew");
        emp2.setAge(30);
        emp2.setEmail("luke@gmail.com");

        emplist.add(emp2);

        ObjectMapper mapper = new ObjectMapper();
        String jsonmap = mapper.writeValueAsString(emplist);
        System.out.println(jsonmap);

       List<String> ss =  str.stream().filter(s -> s.contains("s")).collect(Collectors.toList());
       ss.forEach(System.out::println);
      // System.out.println(ss);
      // List<String> sss = str.stream().filter(a -> a.contains("k")).forEach(System.out::println);


        Map<String, Integer> map = new HashMap<>();
        map.put("jane", 2);
        map.put("mark", 3);
        map.put("luke", 1 + map.getOrDefault("luke", 5));

        if(map.containsKey("jane")){
            System.out.println(map.entrySet());
        }

        map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));


                // Example JSON array
                String jsonArrayString = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";

                try {
                    // Parse the JSON array
                    JSONArray jsonArray = new JSONArray(jsonArrayString);

                    // Create a List to store the converted maps
                    List<Map<String, Object>> list = new ArrayList<>();

                    // Iterate over the elements of the JSONArray
                    for (int i = 0; i < jsonArray.length(); i++) {
                        // Convert each JSON object to a Map
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        Map<String, Object> maps = new HashMap<>();

                        // Extract key-value pairs from the JSON object
                        Iterator<String> keys = jsonObject.keys();
                        /*while (keys.hasNext()) {
                            String key = keys.next();
                            Object value = jsonObject.get(key);
                            map.put(key, value);
                        }*/

                        // Add the map to the list
                        list.add(maps);
                    }

                    // Print the list of maps
                    for (Map<String, Object> maps : list) {
                        System.out.println(map);
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }



    }
}
