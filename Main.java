public class Main{
    public static void main(String[] args){
        zad01.saySempay();
        System.out.println();
        zad02.korni(1,-5,6);
        System.out.println();
        for (int i=1; i<=500; i++){
            if (zad03.normalnumbers(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // 1
    public static class zad01{
        public static void saySempay(){
            System.out.println("охае семпай >.<");
        }
    }
    // 2
    public static class zad02{
        public static void korni(double a,double b,double c){
            double D=b*b-4*a*c;
            double x1=(-b+Math.sqrt(D))/(2*a);
            double x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("first корень: "+x1);
            System.out.println("second корень: "+x2);
        }
    }
    // 3
    public static class zad03{
        public static boolean normalnumbers(int num){
            int sotni=num/100;
            int desatki=(num%100)/10;
            int astatki=num%10;
            int summ=sotni+desatki+astatki;
            boolean f=false;
            if (num<10){
                f=true;
            }
            else if (num<100){
                f=(num/10==num%10);
            }
            else{
                f=(num/100==num%10);
            }
            return f&&(summ>10);
        }
    }
}