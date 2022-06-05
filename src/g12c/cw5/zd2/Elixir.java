package g12c.cw5.zd2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    protected String name;
    private boolean isCreated;
    private int power;
    private Liquid catalyst;
    private List<Ingredient> ingredients;
    public Elixir(String name, boolean isCreated, int power){
        this.name = name;
        this. isCreated = false;
        this.power = power;
        this.catalyst = catalyst;
        this.ingredients = new ArrayList<>();

        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name.isEmpty()){
            throw new RuntimeException("Can not be empty");
        }
        this.name = name;
    }

    void Create() {
        if(isCreated) {
            System.out.println("Elixis was created");
            return;
        }
        isCreated = true;
        power = 0;
        for (Ingredient ingredient : ingredients){
            power += ingredient.getReagent();
        }
        power /= catalyst.getReagent();
        System.out.println("Power of the created Elixir: " + name + " is | " + power + " |");
    }
    

    public void addIngredient(Ingredient){
        if(isCreated == true){
            throw new RuntimeException("Elixir has already been created");
        }else {
            ingredientsList.add(new Ingredient());
        }
    }
}
