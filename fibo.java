import java.util.Scanner;

public class fibo {
    public static void f(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        
        scn.close();
        int a=0;
        int b=1;
        System.out.println(a);
        for(int i=1;i<n;i++){
            System.out.println(b);
            int temp=a+b;
            a=b;
            b=temp;
            
            
        }
    }
    public static void main(String[] args) {
        f();
        
}
}
