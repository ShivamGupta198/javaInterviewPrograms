package javaTpointPrograms;

public class largestAndSmallestWordInString {
    public static void main(String[] args) {
        String str = "Hardships often prepare ordinary people for an extraordinary destiny";
        String words[]= str.split(" ");
        String largestWord= words[0];
        String smallestWord= words[0];

        for (int i=0; i< words.length; i++){
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }
        }
        System.out.println("LargestWord:- "+largestWord);
        System.out.println("smallestWord:-"+smallestWord);
    }
}