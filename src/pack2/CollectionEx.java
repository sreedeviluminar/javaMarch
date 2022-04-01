package pack2;

import java.util.*;
public class CollectionEx {

    public static void main(String[] args) {

        TreeMap<Integer,String> obj = new TreeMap<>();
        obj.put(6,"add");
        obj.put(7,"last");
        obj.put(1,"Hello");
        obj.put(4,"you");
        obj.put(5,"welcome");
        obj.put(2,"welcome");
        obj.put(3,"java");

        for(Map.Entry<Integer,String> map : obj.entrySet()){
            System.out.println(map.getKey() +" : "+map.getValue());
        }
    }
}

