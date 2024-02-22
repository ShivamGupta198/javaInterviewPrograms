package javaTpointPrograms;

import java.util.HashMap;
import java.util.Map;

public class maxAndMinOccurringCharacterInAstring {
    public static void main(String[] args) {
       // String S= "grass is greener on the other side";
        String S= "Ganpati Bappa Morya";

        char c[]=S.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(Character ch: c){
                if (hm.containsKey(ch)) {
                    if(ch!=' ') {
                        hm.put(ch, hm.get(ch) + 1);
                    }
                } else {
                    if(ch!=' ') {
                        hm.put(ch, 1);
                    }
                }
        }
        char maxChar = '\0'; // Initialize maxChar to a null character
        int maxFrequency = 0;


        for (Map.Entry<Character,Integer> m : hm.entrySet()){
        int frequency = m.getValue();
        if (frequency > maxFrequency){
            maxFrequency =m.getValue();
            maxChar = m.getKey();
        }
        }
        System.out.println("Max Character:- "+maxChar);
        System.out.println("Max Frequency:- "+maxFrequency);

    }
}