import java.util.*; 
public class prdtc {
    public static int product(int num1,int num2){
        return num1*num2;
        
    }
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        scn.close();
        int res=product(a,b);
        System.out.println("product is "+res);
        
    }
}
