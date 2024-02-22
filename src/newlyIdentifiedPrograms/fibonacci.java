package newlyIdentifiedPrograms;

public class fibonacci {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int SeriesCount=6;
        int z;
        for (int i=0; i<SeriesCount;i++){
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
        }
    }
}
