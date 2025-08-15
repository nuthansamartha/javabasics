import java.util.*;      
public class area_ofsquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the side of the square:");
        float side=sc.nextFloat();
        float area=side*side;
        System.out.printf("the area is :%.2f",area);
        sc.close();

        
    }
}
    