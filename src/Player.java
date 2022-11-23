public class Player {
    //atributos
    private String name;
    private Integer points;

    //constructor
    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public void incrementPoints() {
        setPoints(getPoints() + 1);
    }
    //getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
