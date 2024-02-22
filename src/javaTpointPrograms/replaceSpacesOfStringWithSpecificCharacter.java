package javaTpointPrograms;

public class replaceSpacesOfStringWithSpecificCharacter {
    public static void main(String[] args) {
        String str = "Once in a blue moon";
/*      //1st Way
        str= str.replaceAll("\\s+","-");
        System.out.println(str);*/

        //2nd Way
        String ws[]= str.split(" ");
        StringBuilder br =new StringBuilder();
        int flag=0;
        for (String S2: ws){
            br.append(S2);
            flag++;
            if (flag!= ws.length) {
                br.append("-");
            }
        }
        System.out.println("String when space replaced with Special Character:- "+br);
    }
}