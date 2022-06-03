package g12c.cw5.zd2;

public class Alcohol extends Liquid{
    private int percentage;

    public Alcohol (String name, int baseReagent, int dissolubility, int percentage) {
        super(name, baseReagent, dissolubility);
        setPercentage(percentage);
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        if(percentage < 0 || percentage > 100 ){
            throw new RuntimeException("Parameter must be between 0 and 100");
        }
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getReagent() {
        return baseReagent-(baseReagent*(percentage/100));
    }
}
