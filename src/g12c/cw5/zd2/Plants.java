package g12c.cw5.zd2;

public class Plants extends Ingredient{
    protected int toxity;

    public Plants (String name, int baseReagent, int toxity){
        super(name, baseReagent);

        setToxity(toxity);
        }

    public int getToxity() {

        return toxity;
    }

    public void setToxity(int toxity){
        if(toxity <0) {
            throw new RuntimeException("Parameter must be higher than zero");
        }
        this.toxity= toxity;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent() {
        return baseReagent*toxity;
    }
    
}
