package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private String name;
  private boolean isAvailable;
  private String description;

  private List<Student> students = new ArrayList<>();

  public Course(
      String name,
      String description, boolean isAvailable) {
    this.name = name;
    this.isAvailable = isAvailable;
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public String getState() {
    if (this.isAvailable) {
      return "Disponible";
    }
    return "No disponible";
  }

  public String getDescription() {
    return this.description;
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void listStudents() {
    System.out.println("Alumnos en el curso " + this.name + ":");
    for (Student alumno : this.students) {
      System.out.println(alumno.getName());
    }
  }

}
