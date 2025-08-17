import java.util.*;
public class fact2 {
    public static int fact(int n){
        if(n==1 ||n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        int factorial=fact(n);
        scn.close();
        System.out.println("the factorial of number is "+factorial);
        

        


    }
    
}
