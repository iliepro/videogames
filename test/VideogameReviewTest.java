import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VideogameReviewTest {

    Videogame videogame;
    User user;

    @BeforeEach
    void setUp() {
        videogame = new Videogame("Sample Game");
        user = new User("reviewerUser", "John", "Doe", "johndoe@example.com", LocalDate.of(1990, 1, 1));
    }

    @Test
    void userCanLeaveReviewWithValidScore() {
        boolean reviewAdded = videogame.addReview(user, "Great game!", 5);
        assertTrue(reviewAdded);
    }

    @Test
    void userCannotLeaveReviewWithInvalidScore() {
        boolean reviewAdded = videogame.addReview(user, "Not good", 6); // Invalid score
        assertFalse(reviewAdded);
    }

    @Test
    void canGetReviewsForGame() {
        videogame.addReview(user, "Amazing game!", 5);
        assertEquals(1, videogame.getReviews().size());
        assertEquals("Amazing game!", videogame.getReviews().get(0).getComment());
        assertEquals(5, videogame.getReviews().get(0).getScore());
    }
}

