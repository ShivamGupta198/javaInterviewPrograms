public class reverseString {
    public static void main(String[] args) {
        String S = "GanpatiBappa";
        String rev=""  ;
        for(int i=S.length()-1;i>=0;i--){
            rev = rev+S.charAt(i);
        }
        System.out.println("PrintStr:- "+rev);

    }
}