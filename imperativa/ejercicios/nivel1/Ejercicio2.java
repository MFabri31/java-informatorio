public class Ejercicio2 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        
        int sumResult = num1 + num2;

        String message = sumResult % 2 == 0
                ? "El resultado es " + sumResult + " y es par "
                : "El resultado es " + sumResult + " y es impar";

        System.out.println(message);
    }
}
