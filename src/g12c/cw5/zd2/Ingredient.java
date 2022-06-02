package g12c.cw5.zd2;

public class Ingredient {
    protected String name;
    protected int baseReagent;
    public Ingredient(String name, int baseReagent){
        this.name = name;
        this.baseReagent = baseReagent;

        setName(name);
        setBaseReagent(baseReagent);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("Cannot be empty");
        }
        this.name = name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        if (baseReagent <= 0) {
            throw new RuntimeException("");
        }
        this.baseReagent = baseReagent;
    }

    public int getReagent () {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
