package nivel1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("==== Informatorio 2024 - Ejercicios POO ====");

    String studentName;
    String studentLastName;
    String studentDateOfBirth;
    String courseName;
    String courseState;
    String courseDescription;

    Scanner scanner = new Scanner(System.in);

    System.out.println("==== Datos del Alumno ====");

    System.out.println("Nombre:");
    studentName = scanner.next();

    System.out.println("Apellido:");
    studentLastName = scanner.next();

    System.out.println("Fecha de nacimiento (yyyy-MM-dd):");
    studentDateOfBirth = scanner.next();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateFormatted = LocalDate.parse(studentDateOfBirth, formatter);

    Student alumno1 = new Student(studentName, studentLastName, dateFormatted);

    System.out.println("Dato de alumno");
    System.out.println("Nombre: " + alumno1.getName() +
        " Apellido: " + alumno1.getLastName() +
        " Edad: " + alumno1.getAge() +
        " Fecha de nacimiento: " + alumno1.getDateOfBirth());

    System.out.println("==== Datos del curso ====");

    System.out.println("Nombre:");
    courseName = scanner.nextLine();

    System.out.println("Descripción:");
    courseDescription = scanner.nextLine();

    System.out.println("Estado:");
    courseState = scanner.nextLine();

    Boolean isCourseAvailable = courseState.equals("si") || false;

    Course curso1 = new Course(courseName, courseDescription, isCourseAvailable);

    System.out.println(
        "\nCurso: " + curso1.getName() +
            "\n Disponible " + curso1.getState() +
            "\nDescripción: " + curso1.getDescription());

    curso1.addStudent(alumno1);

    curso1.listStudents();

  }
}