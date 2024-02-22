import java.util.Arrays;
import java.util.LinkedList;

public class sortArrayOfString {
    public static void main(String[] args) {
        String S[] = {"ganpati", "bappa", "morya", "mangal", "murty"};

        //First Way Using Collection Method
/*
        Arrays.sort(S);
        for(int i=0; i< S.length ; i++){
            System.out.println("Sorted String Array:-  "+S[i]);
        }*/

        //Second Way

        for (int i=0;i<S.length;i++){
                    for (int j=0;j<S.length-1-i;j++){
                if (S[j].compareTo(S[j+1]) > 0) {
                    String temp;
                    temp = S[j];
                    S[j] = S[j+1];
                    S[j+1] = temp;
                } else if (S[j].compareTo(S[j+1]) <= 0) {
                    continue;
                }
            }
        }

            for(int l=0; l<S.length;l++){
                System.out.println("Sorted String Array:- "+S[l]);
            }
        }
    }