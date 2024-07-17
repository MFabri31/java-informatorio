public class Ejercicio4{
  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 2;

    int resultSum = num1 + num2;

    System.out.println("Resultado suma: " + resultSum);
    
    Boolean isDivisible = num1 % num2 == 0;
    
    String message = isDivisible ? num1 +  " es divisble por " + num2 : num1 +  " no es divisble por " + num2;

    System.out.println(message);
  }
}