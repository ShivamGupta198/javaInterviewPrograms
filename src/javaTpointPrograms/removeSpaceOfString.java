package javaTpointPrograms;

public class removeSpaceOfString {
    public static void main(String[] args) {
        String str = "Remove white spaces";

      //1st Way:-
        String subStr[]= str.split(" ");

        StringBuilder br = new StringBuilder();
        for (String s: subStr){
            br.append(s);
        }
        System.out.println("String without space:- "+br);

        //2nd Way:-
/*        str=str.replaceAll("\\s+","");
        System.out.println("String without space:- "+str);*/
    }
}