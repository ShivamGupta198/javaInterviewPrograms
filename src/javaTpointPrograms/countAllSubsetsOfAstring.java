package javaTpointPrograms;

/*
In this program, all the subsets of the string need to be printed.
The subset of a string is the character or the group of characters that are present inside the string.
All the possible subsets for a string will be n(n+1)/2
*/
public class countAllSubsetsOfAstring {
    public static void main(String[] args) {
        String str = "FUN";
        int size = str.length();
        String subSet[] = new String[(size * (size + 1)) / 2];
        int tmp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                subSet[tmp] = str.substring(i, j + 1);
                tmp++;
            }
        }

        for (int k = 0; k < subSet.length; k++) {
            System.out.println("Subset:- " + subSet[k]);
        }
    }
}