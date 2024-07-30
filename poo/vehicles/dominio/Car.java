package vehicles.dominio;

public class Car extends Vehicle {

  public Car(String brand, String model, Fleet fleet) {
    super(brand, model, fleet);
  }

  @Override
  public void move() {
    System.out.println("El auto está conduciendo");
  }

}
