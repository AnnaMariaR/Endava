import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Application {
     public static void main(String[] args) throws ParseException {

         ArrayList<User> userArrayList = new ArrayList<>();

         User dataUser1 = new User("Ana", "Roman", 22, "roman@mail.ru", "ACTIVE",convertStringToTimestamp("2020-10-05 11:51:12.208"));
         User dataUser2 = new User("Valerie", "Smith", 19, "avalon@mail.ru", "INACTIVE", convertStringToTimestamp("2020-10-05 11:51:12.208"));
         User dataUser3 = new User("Marie", "Jolie", 33, "jolie@mail.ru", "BLOCKED", convertStringToTimestamp("2020-10-02 11:51:12.108"));
         User dataUser4 = new User("Jonas", "Balciunas", 40, "balciun@mail.ru", "NEW", convertStringToTimestamp("2020-10-01 11:51:12.728"));

         // Initialize an ArrayList with add()
         userArrayList.add(dataUser1);
         userArrayList.add(dataUser2);
         userArrayList.add(dataUser3);
         userArrayList.add(dataUser4);

         //iterator
         for (User user : userArrayList) {
            setStatus(user);
         }
         System.out.println(userArrayList);
     }

    /**
     *  Set status active for users that have timestamp older that yesterday.
     * @param user User
     */
    public static void setStatus(User user){
        Timestamp yesterdayTs = new Timestamp(System.currentTimeMillis()-24*60*60*1000);
        if(user.getStatus().equals("NEW") && user.getTimestamp().before(yesterdayTs)){
            user.setStatus("ACTIVE");
        }
    }

    /**
     * Convert simple text to timestamp.
     * @param text string
     * @return Timestamp
     * @throws ParseException exception
     */
    public static Timestamp convertStringToTimestamp(String text) throws ParseException {
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date parsedDate = dateFormat.parse(text);

        return new Timestamp(parsedDate.getTime());
    }
}
