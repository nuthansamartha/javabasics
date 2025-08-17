import java.util.Scanner;

public class fiboarr {
    public static void fib(){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the range: ");
        int range=scn.nextInt();
        System.out.println("enter the number: ");
        int n=scn.nextInt();
        int []arr=new int[range];
        int flag=0;
        arr[0]=0;                                            // first element
        arr[1]=1;                                            //sce element stored in arr
        for(int i=2;i<range;i++){   
            arr[i]=arr[i-1]+arr[i-2];               //i 2 to range-1 assign value of previous two num sum
        }
        for(int i=0;i<range;i++){
            System.out.println(arr[i]);         //printing arr

        }
        for(int i=0;i<range;i++){
            if(n==arr[i]){
                flag=1;           //checks whether num enterd is present in arrr , if present flag 1 exit from loop
                break;
            }


        }
        if(flag!=0){          //this runs only when it becomes true (flag=1)
            System.out.println("the number is present in the fibo sequence");
        }
        else{          
            System.out.println("number not present");
        }
        scn.close();

        
      
    }
    public static void main(String args[]){
        fib();
    }
    
    
}
