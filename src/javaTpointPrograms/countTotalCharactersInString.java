package javaTpointPrograms;

public class countTotalCharactersInString {
    public static void main(String[] args) {
        String S= "Ganpati Bappa Morya";
        int count =0;
        for (int i=0; i<S.length();i++){
            if(S.charAt(i) != ' '){
            count++ ;
        }
        }
        System.out.println("total chars:- "+count);
    }
}
