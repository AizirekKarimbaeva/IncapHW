public class Fish {
private String type;
private int lifeExpectancy;
private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void fishSwimming(){
        System.out.println("Fish swimming");
    }
}
