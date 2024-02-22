package javaTpointPrograms;
//A string is said to be palindrome if it is same from both the ends.
public class determineStringIsPalindrome {
    public static void main(String[] args) {
        String str1= "saippuakivikauppiasa";
        //1st Way
        String str= str1.toLowerCase();
        int size =str.length();
        int mid;
        if(size%2==0){
            mid=size/2;
        }else {
            mid=(size/2)+1;
        }
        boolean flag=false;
        for (int i=0; i<mid; i++){
            int j= size - (i+1);
            if (str.charAt(i)==str.charAt(j)){
                flag=true;
            }else {
                flag=false;
                break;
            }
        }

        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");


/*        //2nd Way
        String str1= str.toLowerCase();
        char ch[]= str1.toCharArray();
        int size =ch.length;
        int mid;
        if(size/2==0){
            mid=size/2;
        }else {
            mid=(size/2)+1;
        }

        for (int i=0; i< mid;i++){
            int j= size - (i+1);
                if (ch[i]==ch[j]){
                    System.out.println("Palindrome");
                }else {
                    System.out.println("Not a Palindrome");
                    break;
                }
        }*/
    }
}