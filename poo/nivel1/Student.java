package nivel1;

import java.time.LocalDate;
import java.time.Period;

public class Student {
  private String name;
  private String lastName;
  private LocalDate dateOfBirth;
  private int age;

  public Student(String name, String lastName, LocalDate dateOfBirth) {
    this.name = name;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    calculateAge();
    return age;
  }

  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void calculateAge() {
    this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
  }

}
