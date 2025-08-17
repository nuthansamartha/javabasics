import java.util.*;
public class fact1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        int res=1;
        scn.close();
        for(int i=1;i<=n;i++){
            res*=i;

        }
        System.out.println("fact is : "+res);
        
    }
}
