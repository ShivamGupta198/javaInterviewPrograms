package javaTpointPrograms.javaTpointArrayPrograms;

import java.util.HashMap;
import java.util.Set;

//In this program, we have an array of elements to count the occurrence of its each element
public class findFrequencyOfEachElementInArray {
   //1st way using collection
/* public static void main(String[] args) {
        int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (Integer c : arr) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        Set<Integer> keys = hm.keySet();
        for (Integer ch : keys) {
            if (hm.get(ch) > 1) {
                System.out.println("Duplicate no " + ch + " display " + hm.get(ch) + " times");
            } else {
                System.out.println("No " + ch + " display " + hm.get(ch) + " times");
            }
        }
    }*/


    //2nd way using array only
    public static void main (String[] args) {
        int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int size = arr.length;
        countFrequency(arr, size);
    }

    static void countFrequency(int[] array, int size)
    {

        for (int i = 0; i < size; i++){
            int flag = 0;
            int count = 0;

            for (int j = i+1; j < size; j++){
                if (array[i] == array[j]){
                    flag = 1;
                    break;
                }
            }
            // The continue keyword is used to end the current iteration
            // in a for loop (or a while loop), and continues to the next iteration
            if (flag == 1)
                continue;

            for (int j = 0;j<=i;j++){
                if (array[i] == array[j])
                    count++;
            }
            System.out.println(array[i]+": "+count);
        }
    }
}
