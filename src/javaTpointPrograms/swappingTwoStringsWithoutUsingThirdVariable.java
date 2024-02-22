package javaTpointPrograms;

public class swappingTwoStringsWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String S1= "Good";
        String S2= "Morning";

        S1= S1+S2;
        S2= S1.substring(0,(S1.length()-S2.length()));
        S1= S1.substring(S2.length());

        System.out.println("S1:- "+S1+ " S2:- "+S2);
    }
}
