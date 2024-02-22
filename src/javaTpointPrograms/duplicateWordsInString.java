package javaTpointPrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String words[] = str.split(" ");

        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String sp: words){
            if(hm.containsKey(sp)){
                hm.put(sp,hm.get(sp)+1);
            }else{
                hm.put(sp,1);
            }
        }

        Set<String> set =hm.keySet();
        for(String dupKey: set){
            if(hm.get(dupKey)>1){
                System.out.println("Duplicate Key:- "+dupKey +" displaying " +hm.get(dupKey) +" times");
            }
        }
    }
}
