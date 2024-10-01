import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserAuthenticationTest {

    private UserAuthentication userAuth;

    @BeforeEach
    void setUp() {
        userAuth = new UserAuthentication();
    }

    @Test
    void userCanRegisterWithValidDetails() {
        boolean isRegistered = userAuth.register("newUser", "New", "User", "newuser@example.com", "password123");
        assertTrue(isRegistered);
    }

    @Test
    void userCannotRegisterWithDuplicateEmail() {
        userAuth.register("user1", "John", "Doe", "duplicate@example.com", "password123");
        boolean isRegisteredAgain = userAuth.register("user2", "Jane", "Smith", "duplicate@example.com", "password456");
        assertFalse(isRegisteredAgain);
    }

    @Test
    void userCanLoginWithValidCredentials() {
        userAuth.register("validUser", "Valid", "User", "validuser@example.com", "securePassword");
        boolean canLogin = userAuth.login("validuser@example.com", "securePassword");
        assertTrue(canLogin);
    }

    @Test
    void userCannotLoginWithInvalidCredentials() {
        userAuth.register("validUser", "Valid", "User", "validuser@example.com", "securePassword");
        boolean canLogin = userAuth.login("validuser@example.com", "wrongPassword");
        assertFalse(canLogin);
    }
}

