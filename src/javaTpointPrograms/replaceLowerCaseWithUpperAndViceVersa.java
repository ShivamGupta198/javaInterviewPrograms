package javaTpointPrograms;

public class replaceLowerCaseWithUpperAndViceVersa {
    public static void main(String[] args) {
        String str1="Great Power";
        char ch[]=str1.toCharArray();
        StringBuilder br= new StringBuilder();
        for (Character c: ch){
            if (Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
                br.append(c);
            }else if (Character.isLowerCase(c)){
                c=Character.toUpperCase(c);
                br.append(c);
            }else {
                br.append(c);
            }
        }
        //for (int i=0; i<ch.length;i++){
            System.out.println(br);
        //}
    }
}