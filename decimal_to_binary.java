import java.util.*;
public class decimal_to_binary{
    public static void decitobin(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the decimal number: ");
        int dinum=scn.nextInt();
        int binary=0;
        // String binary="";
        int i=0;
        scn.close();
        while(dinum>=1){
        //         binary=(dinum%2)+binary;
        //         dinum/=2;
        int rem=dinum%2;
        binary=binary+rem*(int)Math.pow(10,i);
        i++;
        dinum/=2;

        }
        System.out.println("the binary number is: "+binary);
        
        
    }
    public static void main(String[] args) {
        decitobin();
        
    }
}        