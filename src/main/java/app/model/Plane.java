package app.model;

public class Plane implements Transport {
    private String model;
    private String company;

    public Plane(String model, String company) {
        this.model = model;
        this.company = company;
    }

    @Override
    public void move() {
        System.out.println("Plane takes off.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
