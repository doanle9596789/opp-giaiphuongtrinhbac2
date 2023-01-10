import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập a");
        double a=scanner.nextDouble();
        System.out.println("nhập b");
        double b=scanner.nextDouble();
        System.out.println("nhập c");
        double c=scanner.nextDouble();
        if (a==0){
            System.out.println(" day la phuong trinh bac nhat");

        }else {
            QuadraticEquation ptb2=new QuadraticEquation(a,b,c);
            if (ptb2.getDenta()<0){
                System.out.println("phuong trinh vo nghiem");
            }else if (ptb2.getDenta()==0){
                System.out.println("phuong trinh co nghiem kep" + ptb2.getx3());
            }else if (ptb2.getDenta()>0){
                System.out.println("phuong trinh co hai nghiem" + ptb2.getx1()+" "+ "va" +" " + ptb2.getx2());
            }
        }
    }
}