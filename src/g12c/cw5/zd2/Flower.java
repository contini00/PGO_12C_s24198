package g12c.cw5.zd2;

public class Flower extends Plants{

    public Flower (String name, int baseReagent, int toxity){
        super(name, baseReagent, toxity);
    }
    @Override
    public int getReagent(){
        return baseReagent*2;
    }
}
