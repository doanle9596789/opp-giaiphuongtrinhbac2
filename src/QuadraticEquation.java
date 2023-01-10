public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double setC(double c) {
        return c;
    }

    public double getDenta() {
        return b*b-4*(a*c);
    }
    public double getx1(){
        return  (((-b+Math.sqrt(this.getDenta()))/(2*a)));
    }
    public double getx2(){
        return (((-b-Math.sqrt(this.getDenta()))/(2*a)));
    }
    public double getx3(){
         return (-b/2*a);
    }
}