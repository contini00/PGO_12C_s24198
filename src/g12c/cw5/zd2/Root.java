package g12c.cw5.zd2;

public class Root extends Plants{

    public Root(String name, int baseReagent, int toxity){
        super(name, baseReagent, toxity);
    }
    @Override
    public int getReagent(){
        return baseReagent/2;
    }
}
