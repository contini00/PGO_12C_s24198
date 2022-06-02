package g12c.cw5.zd1;

public class Kolo extends Figura {

    private double r;
    public Kolo(String name, double r) {

        super(name);
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r){
        if(r < 0){
            throw new RuntimeException("Parametr nie może być mniejszy niż zero");
        }
        this.r=r;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(r,2);
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

    @Override
    public String toString(){
        return super.toString() + " " + r;
    }

}
