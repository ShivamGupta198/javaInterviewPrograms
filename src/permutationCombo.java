public class permutationCombo {
    public static void main(String[] args) {
        String str= "abc";
        permCombo(str,"");
    }
    static void permCombo(String str, String ans) {

        if(str.length()==0){
        System.out.println(ans + " ");
        return;
    }
    for(int i=0;i<str.length();i++){
        char ch =str.charAt(i);
    // Rest of the String after excluding ith character
    String ros = str.substring(0,i)+str.substring(i+1);
    //recursive call
    permCombo(ros,ans+ch);
    }
    }
}