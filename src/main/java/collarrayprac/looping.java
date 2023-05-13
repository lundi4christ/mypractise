package collarrayprac;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class looping {

    public static void main (String[] args){

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


        ObjectMapper mapper = new ObjectMapper();

        try {
            String str = mapper.writeValueAsString(empout);
            System.out.println(str);
        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
