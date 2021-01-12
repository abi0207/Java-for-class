import java.util.Scanner;
import static java.lang.Math.sqrt;

class Triangle extends GeometricObject{
    Scanner sc;
    protected double[] side=new double[3];
    protected String color;
    protected Boolean full;
    void inputData(){
        sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            this.side[i] = sc.nextDouble();
        }
        this.color=sc.next();
        this.full=sc.nextBoolean();
    }
    double countPerimeter(){
        double a=0;
        for(int i=0;i<3;i++) {
            a += side[i];
        }
        return a;
    }
    double countArea() {
        double s=this.perimeter/2;
        double a=s;
        for(int i=0;i<3;i++) {
            a *= (s - this.side[i]);
        }
        return sqrt(a);
    }
    void showSide(){
        System.out.print("Triangle:");
        for(int i=0;i<3;i++) {
            System.out.print(" side" + (i + 1) + " = " + this.side[i]);
        }
        System.out.println();
    }
    void showArea(){
        System.out.println("The area is "+this.area);
    }
    void showPerimeter(){
        System.out.println("The perimeter is "+this.perimeter);
    }
    void showColor(){
        System.out.println(this.color);
    }
    void showDraw(){
        System.out.println(full);
    }
}
abstract class GeometricObject{
    protected double perimeter;
    protected double area;
    void count(){
        this.perimeter=countPerimeter();
        this.area=countArea();
    }
    void outputData(){
        showSide();
        showArea();
        showPerimeter();
        showColor();
        showDraw();
    }
    abstract double countPerimeter();
    abstract double countArea();
    abstract void showPerimeter();
    abstract void showArea();
    abstract void showSide();
    abstract void showColor();
    abstract void showDraw();
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.inputData();
        t.count();
        t.outputData();
    }
}
