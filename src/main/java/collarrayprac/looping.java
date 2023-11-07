package collarrayprac;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

public class looping {

    public static void main (String[] args) throws JsonProcessingException, JSONException {

        List<String> datas = new ArrayList<>();
        datas.add("ab");
        datas.add("ba");
        datas.add("cd");
        datas.add("dc");
        System.out.println(datas);

        for(int a = 0; a<datas.size(); a++){

            System.out.println(datas.get(a));
        }

        for(String b : datas){

            System.out.println(b);
        }

        for(Iterator itner = datas.iterator();
            itner.hasNext();){
            String itner2 = itner.next().toString();
            System.out.println("===ggggggggggg===" + itner2);

        }

        Iterator itner = datas.iterator();
        while(itner.hasNext()){

            String str = (String) itner.next();

                System.out.println("wwwwwwwwwwwww " + str);
        }

        datas.forEach(s -> System.out.println("rrrrrrrrrrr " + s));

        List<String> str1 = datas.stream().filter(a -> a.contains("b")).collect(Collectors.toList());
        System.out.println("qqqqqqqqqqqqq " + str1);

        List<employee> emps = new ArrayList<>();
        emps.add(new employee("mark", "luke", 25, "mark@gmail.com"));
        emps.add(new employee("mary", "jimmy", 30, "mary@gmail.com"));
        emps.add(new employee("glory", "james", 35, "glory@gmail.com"));

        System.out.println("emps-emps-emps ==== " + emps);
        //to filter
        List<employee> emps2 = emps.stream().filter(a -> a.getAge() < 35).collect(Collectors.toList());
        System.out.println("new emps===== " + emps2);

        //filter and sort
        List<employee> emps3 = emps.stream().filter(b -> b.getLastname().contains("j")).collect(Collectors.toList());
        System.out.println("new new emps ==== " + emps3);

        Collections.sort(emps3, (o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("this is sorted ======= " + emps3);

        Collections.sort(emps3, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));
        System.out.println("another sorted ********" + emps3);

        //linked list
        LinkedList<employee> linemp = new LinkedList<>();
        linemp.add(new employee("chris", "tony", 50, "chris@gmail.com"));

        LinkedList<String>  data = new LinkedList<>();
        data.add("orange");
        data.add("mango");
        System.out.println("eeeeeee" + data);
        //adding element at specific location
        data.add(1, "gwava");
        System.out.println("after adding gwava =-= " + data);
        //adding element at the begining of the list
        data.addFirst("apple");
        System.out.println("at the begining *** " + data);
        //adding element at the end of the list
        data.addLast("berry");
        System.out.println("at the end of the list == " + data);

        data.forEach(t -> System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqq " + t));

        Iterator<String> iter = data.iterator();
        while(iter.hasNext()){
            String getIter = iter.next();
            System.out.println("000000000000000 " + getIter);
        }

        for(int a = 0; a<data.size(); a++){
            System.out.println("111111111111 " + data.get(a));
        }
        //get element at specific index
        String getlist = data.get(2);
        System.out.println("get at index == " + getlist);
        //get element at first and last
        String getlist2 = data.getFirst();
        String getlist3 = data.getLast();
        System.out.println("first element is == " + getlist2 + " - last elmeent is == " + getlist3);
        //remove first, last and element at specific index
        data.removeFirst();
        data.removeLast();
        data.remove(1);
        System.out.println("removed==== " + data);

        //Set
        Set<employee> strset = new HashSet<>();
        strset.add(new employee("luke", "mark", 30, "luke@gmail.com"));
        strset.add(new employee("lukes", "mark", 30, "luke@gmail.com"));
        strset.add(new employee("tony", "jones", 35, "tony@gmail.com"));
        System.out.println("using set ==== " + strset);

        List<employee> gets = strset.stream().filter(s -> s.getFirstname().contains("ke")).collect(Collectors.toList());
        System.out.println("pppppppppppp " + gets);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Set<Integer> evennumber = new HashSet<>();
        evennumber.add(2);
        evennumber.add(4);

        numbers.removeAll(evennumber);
        System.out.println("wwwwwwwwwwwwwwwwww  " + numbers);

        numbers.forEach(a -> System.out.println("using foreach " + a));

        numbers.stream().forEach(s -> System.out.println(s));

        for(int num : numbers){
            System.out.println("enhance for loop " + num);
        }
//================================================================================================================
        Iterator<Integer> itt = numbers.iterator();
        while(itt.hasNext()){
            int a = itt.next();
            System.out.println("using Iterator " + a);
        }

        useforIteration(numbers.iterator());
        //System.out.println("tryingtrying==== " + sstr);


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

        ///////////////////////form another json without using pojo using JSON///////////////////
        String formj = mapper.writeValueAsString(empout);

        JSONArray inputarray = new JSONArray(formj);

        JSONArray outputarray = new JSONArray();

        for (int i = 0; i < inputarray.length(); i++){

            JSONObject getinputarray = inputarray.getJSONObject(i);

            JSONObject newjson = new JSONObject();
            newjson.put("dname", getinputarray.getString("firstname"));
            newjson.put("notify", getinputarray.getString("email"));
            newjson.put("agess", getinputarray.getInt("age"));
            newjson.put("newone", "new");

            outputarray.put(newjson);
        }

        String output = outputarray.toString();

        System.out.println("yyyyyyyyyyyyyyyyy " + output);

        ////////////////////////////////////////////////////////////////////////////////////////////


        //mapping mapemployee to employee

        JSONArray jarray = new JSONArray(str);

        List<String> strr = new ArrayList<>();
        strr.add(jarray.getString(2));
        strr.add(jarray.getString(1));
        System.out.println("trrrrrr" + strr);

        List<mapemployee> emp = new ArrayList<>();

        empout.forEach((t) -> {

            mapemployee mapemp2 = new mapemployee();

            mapemp2.setMail(t.getEmail());
            //t.setMail(mapemp2.getMail());
           //empout.add(mapemp2);

            System.out.println("ppppppppppppppp " + mapemp2);

        });



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

    //UTIL CLASS
    public static Object useforIteration(Iterator x){

        while(x.hasNext()){
           Object a = x.next();
           // System.out.println("tryingtrying====== " + a);
            return a.toString();
        }
        return null;
    }

}
