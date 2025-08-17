import java.util.*;
public class inverted_star {
    public static void main(String[] args) {
        System.out.println("enter the number of rows: ");
        Scanner scn=new Scanner(System.in);
        int rows=scn.nextInt();
        scn.close();
        for(int i=1;i<=rows;i++){
            System.out.print("\n");
            for(int j=1;j<=rows-i+1;j++){
                System.out.print("*");
            }
       
        }

    }
}
