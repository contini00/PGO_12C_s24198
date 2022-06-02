package g12c.cw5.zd1;

public class Figura {

    protected String name;
    public Figura(String name){

        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("cannot be empty");
        }
        this.name = name;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}

