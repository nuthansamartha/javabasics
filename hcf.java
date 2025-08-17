import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=scn.nextInt();
        int a1=a;
        System.out.println("enter b: ");
        int b=scn.nextInt();
        int b1=b;
        scn.close();
        while (b!=0){
            int temp=b;    // a<------b<------r
            b=a%b;
            a=temp;
        }
        System.out.println("hcf is: "+a);
        int lcm =(a1*b1)/a;             //lcm(a,b)*hcf(a,b)=a*b      //hcf(a,b)=hcf(a,r) r=a%b
        System.out.println("the lcm is: "+ lcm);
        
    }
    
}
