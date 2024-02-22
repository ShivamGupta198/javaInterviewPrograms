package newlyIdentifiedPrograms;

public class swappingTwoVariablesWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int x =10;
        int y =20;
        //1st Way
        x=x+y;
        y=x-y;
        x=x-y;

        //2nd Way
/*        x=(x+y)-(y=x);
 */
        System.out.println("x= "+x+ " and y= "+y);
    }
}
