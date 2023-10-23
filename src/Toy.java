import java.util.*;

public class Toy {

    private static int counter;
    private final int no;
    public String name;


    public Toy(String name1) {
        this.name = name1;
    }

    public int getNo() {
        return no;
    }

    {
        no = ++counter;
    }

    public Toy() {
    }

    public String isName() {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        return name1;
    }
    public int count(){
        Random rand = new Random();
        int rand1 = rand.nextInt(30,100);
        return rand1;
    }

    @Override
    public String toString() {
        return String.format( "%s.nametoy %s  count %d", no, isName(), count());


    }
}
