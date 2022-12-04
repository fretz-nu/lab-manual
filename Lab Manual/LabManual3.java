
import java.util.Scanner;
public class LabManual3 {
     
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int column;
    	int row;
    	System.out.println("Input no. of columns: ");
    	  column = input.nextInt();
    	System.out.println("Input no. of rows: ");
    	row = input.nextInt();
        for(int i = 1 ;i<=row;i++) {
            System.out.format("%6d ",i);
            for(int j=2;j<=column;j++) {
                System.out.printf("%6d",i*j);
            }
            System.out.println();
        }
    }
     
}