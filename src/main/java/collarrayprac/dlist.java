package collarrayprac;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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


        Map<String, Object> map = new HashMap<>();
        map.put("jane", "jerry");
        map.put("mark", "mary");

    }
}
