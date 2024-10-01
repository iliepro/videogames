import java.util.HashMap;
import java.util.Map;

public class UserAuthentication {

    private Map<String, String> registeredUsers;

    public UserAuthentication() {
        this.registeredUsers = new HashMap<>();
    }

    public boolean register(String nickname, String name, String lastName, String email, String password) {
        if (registeredUsers.containsKey(email)) {
            return false;
        }
        registeredUsers.put(email, password);
        return true;
    }

    public boolean login(String email, String password) {
        return registeredUsers.containsKey(email) && registeredUsers.get(email).equals(password);
    }
}

