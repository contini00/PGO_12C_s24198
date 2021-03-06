package g12c.cw5.zd2;

public class Mineral extends Ingredient {
    protected int power;

    public Mineral (String name, int baseReagent, int power) {
        super(name, baseReagent);
        setPower(power);
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        if(power < 0){
            throw new RuntimeException("Parameter cannot be lower than zero");
        }
        this.power = power;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent() {
        return baseReagent+power;
    }

}
