import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();          //121
        int orgnum=num;
        int revnum=0;
        while (num!=0) {
            int lastdigit=num%10;       //remove last digit from num
            revnum=revnum*10+lastdigit;     //to store num in reverse order to compare in later wise
            num=num/10;                 //121/10=12 ----> 12/10----->1 ---->1/10----->0(int) it stops.
        }
        if (orgnum==revnum){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    scn.close();
            
        
        
    }
}
