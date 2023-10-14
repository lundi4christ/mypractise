package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class utility {

    public static void main (String[] args){

        List<String> myfruits = new ArrayList<>();
        myfruits.add("element1");
        myfruits.add("element2");
        myfruits.add("element3");

        System.out.println(myfruits);

        myfruits.remove("element2");

        System.out.println(myfruits);
        System.out.println(myfruits.get(1));

        myfruits.forEach((x) -> {
            System.out.println(x);
        });

        List<String> myfruits2 = new ArrayList<>(myfruits);
        myfruits2.add("element4");
        myfruits2.add("element5");

        List<String> myfruits3 = new ArrayList<>();
        myfruits3.addAll(myfruits2);
        System.out.println(myfruits3);


    }

    public String nullif(){

        return null;
    }
}
