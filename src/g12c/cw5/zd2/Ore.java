package g12c.cw5.zd2;

public class Ore extends Mineral{
    private boolean metallic;

    public Ore (String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        setMetallic(metallic);
    }
    public boolean getMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic){
        this.metallic = metallic;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent() {
        if(metallic==false){
            return baseReagent/2;
        }else {
            return baseReagent;
        }
    }
}
