package practiceGeeksPrograms;

public class firstLetterOfEachWordInAstring {
    public static void main(String[] args) {
        String S = "A Computer Science Portal for Geeks";
        String seprateWords[] = S.split(" ");
        String firstLetter="";
        for (int i =0; i<seprateWords.length;i++){
            firstLetter=firstLetter+seprateWords[i].charAt(0);
        }
        System.out.println("Separate Words:- "+firstLetter);

    }
}