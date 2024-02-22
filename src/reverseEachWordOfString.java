import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class reverseEachWordOfString {
    public static void main(String[] args) {
        String S = "Ganpati Bappa Morya";
        String seprateWord[]=S.split(" ");

        int Size= seprateWord.length;
        System.out.println("Size: "+Size);
        String newStr[] = new String[Size];
        List<String> ls = new ArrayList<String>();

        for(int i=0; i<Size;i++){
            for(int j=seprateWord[i].length()-1;j>=0;j--){
                if(newStr[i]== null){
                    newStr[i]="";
                }
                newStr[i] = newStr[i]+seprateWord[i].charAt(j);
            }
            newStr[i]=newStr[i].substring(0,1).toUpperCase()+newStr[i].substring(1).toLowerCase();
            ls.add(newStr[i]);
        }
        System.out.println("PrintStr:- "+ls);
        StringBuilder reverseStr= new StringBuilder();

        for(String St: ls){
            reverseStr.append(St);
            reverseStr.append(" ");
        }
        System.out.println("Reverse each words:- " +reverseStr);
    }
}