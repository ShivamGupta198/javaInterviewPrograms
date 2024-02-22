import java.util.HashMap;
import java.util.Set;

public class countDuplicateNo {
    public static void main(String[] args) {
        String S= "Ganpati Bappa Morya";
        char c[]=S.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(Character ch: c){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
       Set<Character> set =hm.keySet();
        for(Character dupKey: set){
            if(hm.get(dupKey)>1){
                System.out.println("Duplicate Key:- "+dupKey +" displaying " +hm.get(dupKey) +" times");
            }
        }
    }
}