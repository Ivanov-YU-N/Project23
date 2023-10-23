import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Model {

    private Collection<Toy> tables;

    /**
     * Получить список столиков
     */
    public Collection<Toy> loadToy(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Toy());
            tables.add(new Toy());
            tables.add(new Toy());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер резерва
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Toy t : tables){
            if (t.getNo() == tableNo){
                ToyModel reservation = new ToyModel(reservationDate, name);
//                t.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Добавить реализацию в рамках выполнения домашней работы
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        return -1;
    }


}
