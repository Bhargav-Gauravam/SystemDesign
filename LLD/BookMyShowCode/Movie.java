public class Movie{

    private String name;
    private float ratings = 0.0f;
    private Genre genre;
    private Language language;

    public Movie(String name, Genre genre, Language language){
        this.name = name;
        this.genre = genre;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public float getRatings() {
        return ratings;
    }

    public Language getLanguage() {
        return language;
    }

    public Genre getGenre() {
        return genre;
    }

}
