package g12c.cw5.zd2;

import java.util.ArrayList;
import java.util.List;

public class Elixir {
    protected String name;
    private boolean isCreated;
    private int power;
    private Liquid catalyst;
    private List<Ingredient> ingredients;

    public Elixir(String name,Liquid catalyst){
        this.name = name;
        this. isCreated = false;
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

    public Liquid getCatalyst(){
        return catalyst;
    }
    public void setCatalyst(Liquid catalyst){
        this.catalyst = catalyst;
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
        System.out.println("Power of the created '" + name + "' Elixir is | " + power + " |");
    }


    void addIngredient(Ingredient ingredient){
        if(isCreated){
            throw new RuntimeException("Elixir has already been created");
        }else {
            ingredients.add(ingredient);
        }
    }

    void removeIngredient(Ingredient ingredient) {
        if(isCreated){
            throw new RuntimeException("Elixir has already been created");
        }else {
            ingredients.remove(ingredient);
        }
    }

    public void printIngredientList() {
        System.out.print("\n");
        System.out.println("List of ingredient of " + name + "\n");
        System.out.println("catalyst:");
        System.out.println(catalyst);
        System.out.println("\n");

        System.out.println("ingredients:");

        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }

        System.out.println(" ");
    }




}
