package vehicles.dominio;

public class Motorcycle extends Vehicle {

  public Motorcycle(String Brand, String Model, Fleet fleet) {
    super(Brand, Model, fleet);
  }

  @Override
  public void move() {
    System.out.println("La moto está acelerando");
  }

}
