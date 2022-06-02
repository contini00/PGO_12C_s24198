package g12c.cw5.zd1;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Figura> figuraList = new ArrayList<>();
        figuraList.add(new Figura("fig1"));
        figuraList.add(new Prostokat("prost1", 2, 4));
        figuraList.add(new Kolo("kol1", 10));

        for (Figura f: figuraList) {
            System.out.println(f.name + ": obwód = " + f.getPerimeter() + " powierzchnia = " + f.getArea());
        }
    }
}
