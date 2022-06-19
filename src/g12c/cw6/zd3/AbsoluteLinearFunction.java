package g12c.cw6.zd3;

public class AbsoluteLinearFunction extends LinearFunction implements Fun{

    AbsoluteLinearFunction(double a, double b){
        super(a,b);

    }

    @Override
    public double f(double x) {
        double zmienna;
        zmienna = Math.abs(super.f(x));
        return zmienna;
    }
}
