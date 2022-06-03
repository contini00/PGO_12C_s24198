package g12c.cw5.zd2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    protected String name;
    private boolean isCreated = false;
    int power;
    public Elixir(String name, boolean isCreated, int power){
        this.name = name;
        this. isCreated = isCreated;
        this.power = power;

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

    List<Ingredient> ingredientsList = new ArrayList<>();

    public void addIngredient(Ingredient){
        if(isCreated == true){
            throw new RuntimeException("Elixir has already been created");
        }else {
            ingredientsList.add(new Ingredient())
        }
    }
}
