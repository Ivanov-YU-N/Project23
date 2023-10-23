import java.util.Date;

public class ToyModel {

    private static int counter = 90000;
    private final int id;

    private Date date;
    private String name;

    {
        id = ++counter;
    }

    public ToyModel(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
