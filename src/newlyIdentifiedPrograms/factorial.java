package newlyIdentifiedPrograms;

public class factorial {
    public static void main(String[] args) {
        int x=1;
        int factorialOfNo=5;
        for (int i=factorialOfNo;i>0;i--){
            x=x*i;
        }
        System.out.println("factorial Of No "+factorialOfNo +" is "+x);
    }
}
