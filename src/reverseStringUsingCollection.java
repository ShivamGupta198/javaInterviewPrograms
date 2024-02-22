import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reverseStringUsingCollection {
    public static void main(String[] args) {
        String S = "GanpatiBappa";
        String rev = "";
        ArrayList<Character> reverseS = new ArrayList<Character>();
        for (Character c : S.toCharArray()) {
            reverseS.add(c);
        }

        Collections.reverse(reverseS);
        System.out.println(reverseS);
        StringBuilder bdr = new StringBuilder();
        for(Character Ch :reverseS){
            bdr.append(Ch);
        }
        System.out.println(bdr);

    }
}