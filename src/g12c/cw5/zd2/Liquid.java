package g12c.cw5.zd2;

public class Liquid extends Ingredient{
    protected int dissolubility;

    public Liquid (String name,int baseReagent,int dissolubility) {
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility(){

        return dissolubility;
    }

    public void setDissolubility(int dissolubility){
        if(dissolubility < 0 || dissolubility > 100){
            throw new RuntimeException("Parameter must be between 0 and 100");
        }
        this.dissolubility = dissolubility;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent(){
        return baseReagent*(dissolubility/100);
    }



}
