package javaTpointPrograms;

/*
Here, our task is to divide the string S into n equal parts. We will print an error message
if the string cannot be divisible into n equal parts
otherwise all the parts need to be printed as the output of the program.
*/
public class divideStringInNequalParts {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int size = str.length();
        int equalPartToBeDivided = 3;

        String subString[] = new String[equalPartToBeDivided];
        int totalChar = size / equalPartToBeDivided;
        int temp = 0;
        if ((size % equalPartToBeDivided) != 0) {
            System.out.println("String cannot be divisible into n equal parts");
        } else {
            for (int i = 0; i < size; i = i+totalChar) {
                subString[temp] = str.substring(i, i+totalChar);
                temp++;
            }
        }
        for (int j = 0; j < subString.length; j++) {
            System.out.println("Equal Part String:- " + subString[j]);
        }
    }
}