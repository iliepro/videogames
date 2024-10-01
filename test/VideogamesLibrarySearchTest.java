import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.time.LocalDate;

class VideogamesLibrarySearchTest {

    VideogamesLibrary videogamesLibrary;
    User user;

    @BeforeEach
    void setUp() {
        videogamesLibrary = new VideogamesLibrary();
        user = new User("testUser", "John", "Doe", "john.doe@example.com", LocalDate.of(1990, 1, 1));
    }

    @Test
    void searchByCategory() {
        List<Videogame> foundGames = videogamesLibrary.searchByCategory("Point and click");
        assertFalse(foundGames.isEmpty());
    }

    @Test
    void searchByPlatform() {
        List<Videogame> foundGames = videogamesLibrary.searchByPlatform("Switch");
        assertFalse(foundGames.isEmpty());
    }

    @Test
    void searchByPriceRange() {
        List<Videogame> foundGames = videogamesLibrary.searchByPriceRange(20, 30);
        assertFalse(foundGames.isEmpty());
    }

    @Test
    void searchByCategoryNoResults() {
        List<Videogame> foundGames = videogamesLibrary.searchByCategory("Nonexistent category");
        assertTrue(foundGames.isEmpty());
    }

    @Test
    void searchByPlatformNoResults() {
        List<Videogame> foundGames = videogamesLibrary.searchByPlatform("Nonexistent platform");
        assertTrue(foundGames.isEmpty());
    }

    @Test
    void searchByPriceRangeNoResults() {
        List<Videogame> foundGames = videogamesLibrary.searchByPriceRange(1000, 2000);
        assertTrue(foundGames.isEmpty());
    }
}

