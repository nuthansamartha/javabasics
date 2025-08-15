import java.util.*;
public class bill {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter pencil price:");
    float p1=scn.nextInt();
    //without gst
    System.out.println("enter pen price:");
    float p2=scn.nextInt();
    System.out.println("enter eraser price:");
    float p3=scn.nextInt();
    System.out.println("--------bil---------");
    System.out.printf("pencil price:%.2f \n",p1);
    System.out.printf("pen price   :%.2f \n",p2);
    System.out.printf("eraser price:%.2f \n",p3);

    //with gst of 18%
    float p1gst=(float) p1+(p1*0.18f);
    float p2gst=(float) p2+(p2*0.18f);
    float p3gst=(float) p3+(p3*0.18f);

    System.out.println("--------bil with gst---------");
    System.out.printf("pencil price:%.2f \n",p1gst);
    System.out.printf("pen price   :%.2f \n",p2gst);
    System.out.printf("eraser price:%.2f \n",p3gst);
    scn.close();

    float avg=(p1+p2+p3)/3;
    float avggst=(p1gst+p2gst+p3gst)/3;
    System.out.printf("the avg is:%.2f\n",avg);
    System.out.printf("the avg with gst is:%.2f",avggst);



    }
}
