import java.util.*;

public class sortMapByValues {
    public static void main(String[] args) {
        boolean ascending = true; //Write ascending = false to sort in descending order
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"ganpati");
        hm.put(2,"bappa");
        hm.put(3,"morya");
        hm.put(4,"om");
        hm.put(5,"shivamji");
        hm.put(6,"shivamji2");
        hm.put(7,"jai");
        hm.put(8,"shri");
        hm.put(9,"ram");

        LinkedList<Map.Entry<Integer,String>> ls = new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
        Collections.sort(ls, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                if(ascending){
                   return o1.getValue().compareTo(o2.getValue());
                }
                else{
                   return o2.getValue().compareTo(o1.getValue());
                }
        }});
        for(Map.Entry m: ls){
            System.out.println("Key:- "+m.getKey() + " Values:- "+ m.getValue());
        }
    }
}