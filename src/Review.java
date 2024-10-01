public class Review {

    private User user;
    private String comment;
    private int score;

    public Review(User user, String comment, int score) {
        this.user = user;
        this.comment = comment;
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public int getScore() {
        return score;
    }
}

