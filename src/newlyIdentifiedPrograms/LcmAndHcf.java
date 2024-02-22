package newlyIdentifiedPrograms;

public class LcmAndHcf {
    public static void main(String[] args) {
        //LCM
        int x=30;
        int y=10;
        int a=x;
        int b=y;
        while(a!=b){
            if(a<b){
                a=a+x;
            }else{
                b=b+y;
            }
        }
        System.out.println("LCM of x & y is :- "+a);
        //HCF
         a=x;
         b=y;
         while (a!=b){
             if(a>b){
                 a=a-b;
             }else{
                 b=b-a;
             }
         }
        System.out.println("HCF of x & y is :- "+b);
    }
}