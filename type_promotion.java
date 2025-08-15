public class type_promotion {
    public static void main(String[] args) {
        byte a=23;
        char b='a';
        short c=50;
        int res=a+b+c;          // byte short char will get converted into int note only beheave in eqn
        System.out.println(res);
        float d =2.456f;
        long f=12345;
        double d1=1234567.45;
        double res1=a+b+c+d+f+d1;      // double is more it converts all into double
        System.out.println(res1);

    }
    

}
