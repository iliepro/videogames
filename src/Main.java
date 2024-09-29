import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        VideogamesLibrary library = new VideogamesLibrary();

        User joan = new User("JoanGamer", "Joan", "Garcia", "joan@example.com", LocalDate.of(1990, 1, 1));
        Videogame videogame1 = library.find(joan, "Return to Monkey Island");
        videogame1.showData();

        User josep = new User("JosepGamer", "Josep", "Belga", "josep@example.com", LocalDate.of(1995, 1, 1) );
        Videogame videogame2 = library.find(josep, "Return to Monkey Island");
        videogame2.showData();

        System.out.println("\n** USERS WHO HAVE CONSULTED");
        Set<User> usersWhoHaveConsulted = videogame1.getUsersWhoHaveConsulted();
        for (User user : usersWhoHaveConsulted) {
            System.out.println(user.getNickname());
        }
    }
}