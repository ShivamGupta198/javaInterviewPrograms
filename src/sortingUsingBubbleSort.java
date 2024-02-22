public class sortingUsingBubbleSort {
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int tmp;
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int k=0;k<arr.length;k++){
            System.out.println("Sorted Array "+k+" is :- "+arr[k]);
        }

    }
}
