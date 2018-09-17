package lesson04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ProgramFourPs {
    public static void main(String[] args) {
        ArrayList <Integer> colList = new ArrayList<>();
        colList.add(1);
        colList.add(2);
        colList.add(3);
        colList.add(4);
        colList.add(5);
        colList.add(6);
        colList.remove(4);
        printEach(colList);
        colList.remove(new Integer(2));
        System.out.println(colList);

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("First".intern(), colList);

        System.out.println(map.get("First"));

        HashSet<String> set = new HashSet<>();
        set.add("fdsfdf");
        set.add("tyy");
        System.out.println(set);
    }

    public static void printEach(ArrayList<Integer> arr) {
        Iterator <Integer> iterator = arr.iterator();
       for (Integer integer: arr){
           System.out.println(integer);
       }
    }



}
