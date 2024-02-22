package javaTpointPrograms;

public class countTotalVowelsConsonantsInString {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        int vowels=0;
        int consonents=0;
        char c[]= str.toCharArray();
        for (int i=0; i < c.length; i++){
            if((c[i]=='a') || (c[i]=='e') || (c[i]=='i') || (c[i]=='o') || (c[i]=='u') || (c[i]=='A') || (c[i]=='E') || (c[i]=='I') || (c[i]=='O') || (c[i]=='U') ){
                vowels++;
            }else{
                if (c[i] != ' '){
                    consonents++;
                }
            }
        }
        System.out.println("Vowel's Count = "+vowels);
        System.out.println("Consonents's Count = "+consonents);
    }
}
