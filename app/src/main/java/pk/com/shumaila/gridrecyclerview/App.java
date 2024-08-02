package pk.com.shumaila.gridrecyclerview;

public class App {
    private int imageResourceId;
    private  String name;
    private String rating;



    public App(int imageResourceId, String name , String rating) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "App{" +
                "imageResourceId=" + imageResourceId +
                ", name='" + name + '\'' +
                '}';
    }
}
