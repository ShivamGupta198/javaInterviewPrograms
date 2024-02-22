package javaTpointPrograms.javaTpointArrayPrograms;

public class sortingInDescendingOrder {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 7, 1};

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<(arr.length-1-i); j++){
                if (arr[j] < arr[j+1]){ // change "<" to ">" if require descending order in bubble sort
                    int tmp;
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int k=0; k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
