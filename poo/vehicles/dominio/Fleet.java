package vehicles.dominio;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

  private String name;

  List<Vehicle> vehicles = new ArrayList<>();

  public Fleet(String name) {
    this.name = name;
  }

  public void manage(Vehicle vehicle) {
    this.vehicles.add(vehicle);
  }

  public String getName() {
    return this.name;
  }

  public void listVehicles() {
    System.out.println("Vehículos en " + this.name + ":");
    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle.getBrand() + " " + vehicle.getModel());
    }
  }

}
