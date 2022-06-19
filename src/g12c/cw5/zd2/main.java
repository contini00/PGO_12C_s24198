package g12c.cw5.zd2;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
    /*
        List<Ingredient> ingredientsList = new ArrayList<>();
        ingredientsList.add(new Ingredient("in1", 5));
        ingredientsList.add(new Liquid("liq1",10, 10));

        for (Ingredient f: ingredientsList) {
            System.out.println(f.name + ": obwód = " + f.getReagent());

     */
        System.out.println("===============================================");

        Elixir ElixirMixture = new Elixir("Mikstura z Gumi Jagód", new Alcohol("Żytnia", 2, 55, 55));
        ElixirMixture.addIngredient(new Root("Korzeń rokitnika",30, 20));
        ElixirMixture.addIngredient(new Flower("Stokrotka", 60, 2));
        ElixirMixture.addIngredient(new Ore("Węgiel", 1000, 50, true));
        ElixirMixture.addIngredient(new Water("Woda destylowana", 25, 40, true));
        ElixirMixture.addIngredient(new Crystal("Rubin", 450, 60, 1200));
        ElixirMixture.Create();
        ElixirMixture.printIngredientList();

        System.out.println("===============================================");

        Elixir ElixirMixture2 = new Elixir("Wilga", new Alcohol("Gorzka", 10, 88, 75));
        ElixirMixture2.addIngredient(new Crystal("Azure", 2800, 50, 2000));
        ElixirMixture2.addIngredient(new Ore("Węgiel", 1000, 50, false));
        ElixirMixture2.addIngredient(new Water("Woda destylowana", 25, 40, false));
        ElixirMixture2.addIngredient(new Crystal("Rubin", 450, 60, 1200));
        ElixirMixture2.Create();
        ElixirMixture2.printIngredientList();

        Alcohol alcohol1 = new Alcohol("Alkohol", 10,100,70);
        Ore ore = new Ore("Ore", 15, 5, true);
        Crystal crystal = new Crystal("Crystal", 20, 6, 2);
        Flower flower = new Flower("Flower", 5, 3);
        Root root = new Root("Root", 25, 0);

        Elixir elixirPowaga = new Elixir("ELiksikPowaga", alcohol1);

        elixirPowaga.addIngredient(ore);
        elixirPowaga.addIngredient(crystal);
        elixirPowaga.addIngredient(flower);
        elixirPowaga.addIngredient(root);
        elixirPowaga.removeIngredient(root);

        elixirPowaga.Create();
        elixirPowaga.printIngredientList();

        }
}
