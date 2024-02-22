package javaTpointPrograms.javaTpointArrayPrograms;
// Find Smallest or Largest or 2nd/3rd/4th Largest/Smallest
// Firstly do the sorting using bubble sort and provide respective indexing
public class findSmallestLargestNo {
    public static void main(String[] args) {
        int  arr[] = {25, 11, 7, 75, 56};

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<(arr.length-1-i);j++){
                if (arr[j]>arr[j+1]){
                    int tmp;
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("Smallest element:- "+arr[0]);
        System.out.println("2nd Smallest element:- "+arr[1]);
        System.out.println("3rd Smallest element:- "+arr[2]);

        System.out.println("Largest element:- "+arr[arr.length-1]);
        System.out.println("2nd Largest element:- "+arr[arr.length-1-1]);
        System.out.println("3rd Largest element:- "+arr[arr.length-1-2]);


    }
}
