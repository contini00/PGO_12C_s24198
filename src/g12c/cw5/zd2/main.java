package g12c.cw5.zd2;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Ingredient> ingredientsList = new ArrayList<>();
        ingredientsList.add(new Ingredient("in1", 5));
        ingredientsList.add(new Liquid("liq1",10, 10));

        for (Ingredient f: ingredientsList) {
            System.out.println(f.name + ": obwód = " + f.getReagent());
        }
    }
}
