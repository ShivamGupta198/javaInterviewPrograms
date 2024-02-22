package javaTpointPrograms.javaTpointArrayPrograms;
// In this program, we need to rotate the elements of an array towards the left by the specified number of times.
// In the left rotation, each element of the array will be shifted to its left by one position and the first element
// of the array will be added to end of the list.
// This process will be followed for a specified number of times.
public class leftRotateElementsOfArray {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 3, 4, 5};
        int arr2[]= new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            if (i != (arr.length - 1)) {
                arr2[i] = arr[i+1];
            }else {
                arr2[arr.length-1]=arr[0];
            }
        }
        for (int j=0; j< arr.length;j++){
            System.out.println(arr2[j]);
        }
    }
}
