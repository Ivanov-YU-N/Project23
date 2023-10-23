import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {

    public static ArrayList<Toy> toy;
    public static int n = 1;

    public static void main(String[] args) {

        while(n<5) {
            if (toy == null) {
                toy = new ArrayList<>();
                toy.add(new Toy());
            } else {
                toy = new ArrayList<>();
                toy.add(new Toy());
            }
            n++;
        }

        for(Toy t: toy) {
            System.out.println(t.toString());
        }
    }

}