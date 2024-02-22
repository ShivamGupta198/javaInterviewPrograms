import java.util.LinkedList;

public class checkNumerCharSpecialChar {
    public static void main(String[] args) {
        String S = "C3h@e2c*k1#";
        LinkedList<Character> letter = new LinkedList<Character>();
        LinkedList<Character> digit = new LinkedList<Character>();
        LinkedList<Character> specialChar = new LinkedList<Character>();
        char expectedArray[] = S.toCharArray();
        for (Character ch : expectedArray) {
            if (Character.isDigit(ch)) {
                digit.add(ch);
            } else if (Character.isLetter(ch)) {
                letter.add(ch);
            } else {
                specialChar.add(ch);
            }
        }

        System.out.println("Letters:- " + letter + " Special Chars:- " + specialChar + " Digits:- " + digit);
        StringBuilder letterBr= new StringBuilder();
        StringBuilder specialCharBr= new StringBuilder();
        StringBuilder digitBr= new StringBuilder();

        for(Character c: letter){
            letterBr.append(c);
        }
        for(Character c: specialChar){
            specialCharBr.append(c);
        }
        for(Character c: digit){
            digitBr.append(c);
        }
        System.out.println(letterBr);
        System.out.println(specialCharBr);
        System.out.println(digitBr);
    }
}