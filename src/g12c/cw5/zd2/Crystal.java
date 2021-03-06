package g12c.cw5.zd2;

public class Crystal extends Mineral{
    private int magicPower;

    public Crystal (String name, int baseReagent, int power, int magicPower){
        super(name, baseReagent, power);
        setMagicPower(magicPower);
    }
    public int getMagicPower(){
        return magicPower;
    }

    public void setMagicPower( int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent(){
        return baseReagent+magicPower;
    }


}
