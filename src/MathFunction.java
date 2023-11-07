public class MathFunction {
public static double e=2.71828182846;
public static double p=3.14159265359;

public static void doiraYuzi(){
    double r=4;
    double s;
    s=p*r*r;
    System.out.println("Doira yuzi: "+s);
}

public static void uchBurchakYuzi(){
    double a=10;
    double b=9;
    double c=12;
    double p=(a+b+c)/2;
    double s=Math.sqrt(p*((p-a)*(p-b)*(p-c)));
}

    public static void main(String[] args) {
        doiraYuzi();
        uchBurchakYuzi();
    }
}