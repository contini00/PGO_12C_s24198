package g12c.cw6.zd3;

public interface Fun {

    double f(double x);

    static double minimum(Fun func, double a, double b, double alpha) {
        double minimum = a;
        double temporary = a;
        if( a > b ){
            throw new RuntimeException("A parameter is always greater then B");
        }
        else{
            while ( temporary <= b ){
                temporary=temporary+alpha;
                if (func.f(temporary) < func.f(minimum)){
                    minimum = temporary;
                }
            }
        }
        return func.f(minimum);
    }

}