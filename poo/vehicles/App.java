package vehicles;

import vehicles.dominio.*;

public class App {
  public static void main(String[] args) {
    System.out.println("==== Gestor de Vehículos ====");

    Fleet fleet1 = new Fleet("Flota 1");

    Car car1 = new Car("Ford", "Fiesta", fleet1);
    Motorcycle moto1 = new Motorcycle("Yamaha", "FZ-X", fleet1);

    fleet1.manage(car1);
    fleet1.manage(moto1);

    System.out.println("Marca: " + car1.getBrand() + " - Modelo " + car1.getModel());
    System.out.println("Marca: " + moto1.getBrand() + " - Modelo " + moto1.getModel());

    fleet1.listVehicles();

  }
}
