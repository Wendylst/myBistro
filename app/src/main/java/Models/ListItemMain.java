package Models;

public class ListItemMain {

    private String heading;

    private String description;


    public ListItemMain(String heading) {
        this.heading = heading;
        //this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
