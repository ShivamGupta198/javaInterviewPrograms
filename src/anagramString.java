import java.util.Arrays;
public class anagramString {

    public static void main(String[] args) {
        String S1= "listen is";
        String S2="silent si";
        if(S1.length()!=(S2.length())){
            System.out.println("Not a Anagram String, False");
            System.exit(0);
        }
        char ch1[]= S1.toCharArray();
        Arrays.sort(ch1);
        char ch2[]= S2.toCharArray();
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram String");
        }else{
            System.out.println("Not a Anagram String");
        }
    }
}