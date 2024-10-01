import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Videogame {
    private String name;
    private String genre;
    private int playersNumber;
    private float price;
    private String platforms;
    private String setting;
    private String recommendedAgePEGI;
    private String specificContentPEGI;
    private String requirements;

    private Set<User> usersWhoHaveConsulted;
    private List<Review> reviews;

    public Set<User> getUsersWhoHaveConsulted() {
        return usersWhoHaveConsulted;
    }

    public Videogame(String name) {
        this.name = name;
        usersWhoHaveConsulted = new HashSet<>();
        reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getRecommendedAgePEGI() {
        return recommendedAgePEGI;
    }

    public void setRecommendedAgePEGI(String recommendedAgePEGI) {
        this.recommendedAgePEGI = recommendedAgePEGI;
    }

    public String getSpecificContentPEGI() {
        return specificContentPEGI;
    }

    public void setSpecificContentPEGI(String specificContentPEGI) {
        this.specificContentPEGI = specificContentPEGI;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void showData() {
        System.out.println(this.getName());
        System.out.println("-------------------------------");
        System.out.println("* GENRE: " + this.getGenre());
        System.out.println("* PLAYERS NUMBER: " + this.getPlayersNumber());
        System.out.println("* PRICE: " + this.getPrice());
        System.out.println("* PLATFORMS: " + this.getPlatforms());
        System.out.println("* SETTINGS: " + this.getSetting());
        System.out.println("* RECOMMENDED AGE (PEGI): " + this.getRecommendedAgePEGI());
        System.out.println("* SPECIFIC CONTENT (PEGI) : " + this.getSpecificContentPEGI());
        System.out.println("* REQUIREMENTS:\n" + this.getRequirements());
        System.out.println();
        System.out.println();
    }

    public void addUsersWhoHaveConsulted(User user) {
        usersWhoHaveConsulted.add(user);
    }

    public boolean addReview(User user, String comment, int score) {
        if (score < 1 || score > 5) {
            return false;
        }
        reviews.add(new Review(user, comment, score));
        return true;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}

