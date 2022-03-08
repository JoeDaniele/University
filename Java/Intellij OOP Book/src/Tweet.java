public class Tweet {
    private final String created_at;
    private final int favorite_count;
    private final boolean favorited;
    private final long id;
    private final int retweet_count;
    private final boolean retweeted;
    private final String text;

    public Tweet(String created_at, int favorite_count, boolean favorited, long id, int retweet_count, boolean retweeted, String text) {
        this.created_at = created_at;           //"means to store a copy of the value in the parameter, into the instance variable"
        this.favorite_count = favorite_count;
        this.favorited = favorited;
        this.id = id;
        this.retweet_count = retweet_count;
        this.retweeted = retweeted;
        this.text = text;
    }
     /*
    constructor "Tweet" with 7 parameters.
    use "this" to access the object you're currently in
    e.g. currently in tweet object -- use those variables.
     */

    public String toString() {
        String out = "";
        out += text + "\n";
        if (retweet_count > 0) {
            out += "Retweets: " + retweet_count + " ";
        }
        if (this.favorite_count > 0) {
            out += "Favorites: " + this.favorite_count + "\n";
        } else {
            out += "\n";
        }
        out += created_at + "\n";
        if (this.retweeted) {
            out += "[^v]";
        } else {
            out += "[ ]";
        }
        if (favorited) {
            out += "[ ]";
        }
        return out;
    }
}