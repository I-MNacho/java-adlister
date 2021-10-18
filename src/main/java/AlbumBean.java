import java.awt.*;
import java.io.Serializable;


public class AlbumBean implements Serializable{


    //variables
    private int id;
    private String artist;
    private String name;
    private int release_date;
    private long sales;
    private String genre;

    //empty constructor
    public AlbumBean() {
    }

    //constructor
    public AlbumBean(int id, String artist, String name, int release_date, long sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", name='" + name + '\'' +
                ", release_date=" + release_date +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                '}';
    }
}

