package web.object;

public class Car {
    private int id;
    private String model;
    private String license;

    public Car(int id, String model, String license) {
        this.id = id;
        this.model = model;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }
}