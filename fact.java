import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        int res=1;
        scn.close();
        while (n!=0){
            res=res*(n);
            n=n-1;

        }
    System.out.println("the factorial of number is: "+res );
    }
}
