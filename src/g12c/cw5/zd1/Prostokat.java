package g12c.cw5.zd1;

public class Prostokat extends Figura {

    private double a;
    private double b;

    public Prostokat(String name, double a, double b) {
        super(name);
        setA(a);
        setB(b);
    }

    public double getA(){
        return a;
    }

    public void setA(double a){
        if(a < 0){
            throw new RuntimeException("Parametr nie może być mniejszy niż zero");
        }
        this.a = a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        if(b < 0){
            throw new RuntimeException("Parametr nie może być mniejszy niż zero");
        }
        this.b = b;
    }

    @Override
    public double getArea(){
        return a * b;
    }
    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }
    @Override
    public String toString(){
        return super.toString() + " " + a + " " + b;
    }





}
