import java.util.*;
public class prime_range {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("enter start range:");
        int strt_range=scn.nextInt();
        System.out.println("enter end range:");
        int end_range=scn.nextInt();
        scn.close();
        for(int i=strt_range;i<=end_range;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }

            }
            if(flag!=1){
            System.out.println(i);
        }
            
        }
    }
}
