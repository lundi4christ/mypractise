package collprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class arrayPrac {

    public static void main (String[] args){

        String sss = "FB2304030023";
        System.out.println("yyyyyyyyyyyyyy" + sss.substring(2,12));

        List<String> str = new ArrayList<>();
        str.add("mary");
        str.add("james");
        str.add("linux");

        /// Aliter 0
        str.forEach((x) -> System.out.println("=====" + x));
        str.stream().forEach((s) -> System.out.print("*****" + s));

       /// Aliter 1
        for(String s : str){

            System.out.println(s);
        }

        /// Aliter 2
        for (int i=0; i<str.size(); i++){

            System.out.println(str.get(i));
        }

        /// Aliter 3
        Iterator<String> iter = str.iterator();

        while (iter.hasNext()){

                String iterstr = iter.next();

                    System.out.println(iterstr);
        }

        List number = Arrays.asList(2,3,4,5);
        number.stream().forEach(System.out::println);

        List<Integer> s = new ArrayList<>();
        s.add(20);
        s.add(30);
        s.add(40);

        s.stream().forEach(x -> {
            System.out.println("@@@@@@@@ " + x);
        });

        s.stream().forEach(System.out::println);

        s.stream().filter(x -> x < 40).forEach(System.out::println);

        List<String> num = new ArrayList<>();
        num.add("apple");
        num.add("banana");
        num.add("apple");
        num.add("mango");

        num.stream().forEach(a -> System.out.println(a));

      //  num.stream().filter(a -> a < 80).forEach(x -> System.out.println(x));

/*        List<Integer> mystr = num.stream()
                .map(t -> Integer.valueOf(t))
                .filter( x -> x > 50)
                .collect(Collectors.toList());

        mystr.stream().forEach(a -> System.out.println("uuuuuuuu  " + a));*/

//        System.out.println(str.get(1));

         num.stream()
                .filter(a -> a.equalsIgnoreCase("apple"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((x,y) -> System.out.println("uuuuuuu " + x));

num.stream().forEach(ss -> System.out.println("yyyyyyyyyyyyy" + ss));
num.stream()
        .filter(d -> d.equalsIgnoreCase("banana"))
        .forEach(x -> System.out.println("bbbbbbbbbbbb " + x))
        ;
    }


}
