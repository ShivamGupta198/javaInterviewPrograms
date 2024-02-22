package javaTpointPrograms;

//Java Program to Count the Total Number of Punctuation Characters Exists in a String

import java.util.Scanner;

public class countTotalPunchuationCharInString {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        System.out.println(str);*/
        String str ="He said, 'The mailman loves you.' I heard it with my own ears.";
        int count=0;
        char ch[]= str.toCharArray();
        for(Character c: ch){
            if(!Character.isLetter(c) && !Character.isDigit(c) && !Character.isSpaceChar(c)){
                count++;
            }
        }
        System.out.println("special char count:- "+count);
    }
}