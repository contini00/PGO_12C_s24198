package g12c.cw5.zd2;

public class Water extends Liquid  {
    private boolean distilated;

    public Water (String name, int baseReagent, int dissolubility, boolean distilated){
        super(name, baseReagent, dissolubility);
        setDistilated(distilated);
    }

    public boolean getDistilated(){
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent() {
        return baseReagent*dissolubility;
    }




}
