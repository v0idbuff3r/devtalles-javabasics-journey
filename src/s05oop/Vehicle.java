package s05oop;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if(year<1886 || year>currentYear+2) {
            throw new IllegalArgumentException("Año inválido!!!");
        }
        this.year = year;
    }

    public String toString() {
        return "VEHICLE: \n" +
                "\tbrand: " + brand + "\n" +
                "\tmodel: " + model + "\n" +
                "\tyear: " + year;
    }
}
