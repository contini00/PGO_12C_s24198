package g12c.cw5.zd2;

public class Liquid extends Ingredient{
    private int dissolubility;

    public Liquid (String name, int dissolubility) {
        super(name);
        setDissolubility(dissolubility);
    }

    public double getDissolubility(){

        return dissolubility;
    }

    public void setDissolubility(int dissolubility){
        if(dissolubility < 0){
            throw new RuntimeException("Paramiter cannot be lower than zero");
        }
        this.dissolubility = dissolubility;
    }

}
