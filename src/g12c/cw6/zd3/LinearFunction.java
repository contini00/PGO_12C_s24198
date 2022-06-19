package g12c.cw6.zd3;

public class LinearFunction extends Function implements Fun{

    private double a;
    private double b;

    LinearFunction(double a, double b){
        setA(a);
        setB(b);
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getB() {
        return b;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a += delta;
        b += delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a -= delta;
        b -= delta;
    }

    @Override
    public double f(double x) {
        double zmienna;
        zmienna = a*x+b;
        return zmienna;
    }
}