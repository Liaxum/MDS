package TP1.Exercice7;

public class Vehicle {
    private String model, brand, id;
    private int age, power;
    private float price;

    public Vehicle(String model, String brand, String id, int age, int power, float price) throws Exception {
        this.setModel(model);
        this.setBrand(brand);
        this.setId(id);
        this.setAge(age);
        this.setPower(power);
        this.setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public float getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) throws Exception {
        if (age >= 1) this.age = age;
        else throw new Exception("Age must be superior or equal to 1 year old");
    }

    public void setPower(int power) throws Exception {
        if (power >= 4 && power <= 20) this.power = power;
        else throw new Exception("Power must between 4 and 20");
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
