import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=scn.nextInt();
        scn.close();
        int flag=0;
        if (num<2){
            System.out.println("invalid input");
        }
        else if(num==2){
            System.out.println("2 is a prime number");
        }
        else{
            for (int i=2; i<(int)Math.sqrt(num) ;i++){      //sqrt of num isbecause of factorts are getting repeated 
                if (num%i==0){
                    System.out.println("not prime");
                    flag=1;
                    break;
                }

            }
        if (flag!=1){
            System.out.println("prime number");
        }
        }
        }
    }
    

