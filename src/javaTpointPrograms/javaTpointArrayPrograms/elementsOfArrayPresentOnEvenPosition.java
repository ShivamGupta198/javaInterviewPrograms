package javaTpointPrograms.javaTpointArrayPrograms;

public class elementsOfArrayPresentOnEvenPosition {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int size= arr.length;
        for (int i=0; i<size;i++){
            int j=i+1;
            if (j%2==0){
                System.out.println("Elements present at Even Positions:- "+ arr[i]);
            }else{
                System.out.println("Elements present at Odd Positions:- "+ arr[i]);
            }
        }
    }
}