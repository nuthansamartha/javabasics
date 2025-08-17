import java.util.*;
public class binary_to_decimal{
    public static void bin_to_deci(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the binary number: ");
        int binum=scn.nextInt();
        int i=0;
        int decimal=0;
        scn.close();
        while(binum!=0){
            int lastdigit=binum%10;
            decimal=(int)decimal+(int)lastdigit*(int)(Math.pow(2, i));
            i=i+1;
            binum=binum/10;
        }
        System.out.println("the decimal number is: "+decimal);
        
    }
    public static void main(String[] args) {
        bin_to_deci();
        
    }
}        