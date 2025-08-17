import java.util.Scanner;

public class fibo1 {
    public static void f(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        
        scn.close();
        int a=0;
        int b=1;
        if (n==1){
            System.out.println(a);
        }
        else{
             for(int i=2;i<=n;i++){
            
            int temp=a+b;
            a=b;
            b=temp;
            
            
        }
        System.out.println(b);
    }
        }
        
       
    public static void main(String[] args) {
        f();
        
}
}
