import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateChar {
    public static void main(String[] args) {

/*        //1st Way
        String S = "ShivamKumarGupta";
        LinkedHashSet<Character> withoutDuplicate = new LinkedHashSet<>();

        for(Character c: S.toCharArray()){
            withoutDuplicate.add(c);
        }
        System.out.println(withoutDuplicate);

        StringBuilder abc= new StringBuilder();

        for(Character c: withoutDuplicate){
            abc.append(c);
        }
        System.out.println(abc);*/

        //2nd Way **Recommended
        String S = "ShivamKumarGupta";

        LinkedHashMap<Character, Integer> hm= new LinkedHashMap<Character, Integer>();
        for (Character c : S.toCharArray()){
            if (!hm.containsKey(c)){
                hm.put(c,1);
            }
        }
        Set<Character> keys= hm.keySet();

        StringBuilder nonDuplicateString = new StringBuilder();
        for (Character nonDuplicateCharacter: keys){
            nonDuplicateString.append(nonDuplicateCharacter);
        }
        System.out.println("nonDuplicateString:- "+nonDuplicateString);

//Not recommended below code since it will have issue in last character
/*        String S = "ShivamkumarGupta";
        S=S.toLowerCase();

        char ch[] = S.toCharArray();
        int size=ch.length;
        for(int i=0; i < size; i++){
            for(int j=i+1; j < size;j++){
                if (ch[i] == ch[j]) {
                    while (j < size-1) {
                        ch[j] = ch[j+1];
                        j++;
                    }
                    size--;
                }
                }
            }
        for (int l= 0; l < size; l++ ){
            System.out.println(ch[l]);
        }
    }*/
    }
}