package vehicles.dominio;

public abstract class Vehicle {

  private String brand;
  private String model;
  private Fleet fleet;

  public Vehicle(String brand, String model, Fleet fleet) {
    this.brand = brand;
    this.model = model;
    this.fleet = fleet;
  }

  public abstract void move();

  public String getModel() {
    return this.model;
  }

  public String getBrand() {
    return this.brand;
  }

  public Fleet getFleet() {
    return this.fleet;
  }

}
