package javaTpointPrograms.javaTpointArrayPrograms;

public class rightRotateElementsOfArray {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, 4, 5};
        int arr2[]= new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            if (i != (arr.length - 1)) {
                arr2[i + 1] = arr[i];
            }else {
                arr2[0]=arr[arr.length-1];
            }
        }
        for (int j=0; j< arr.length;j++){
            System.out.println(arr2[j]);
        }
    }
}
