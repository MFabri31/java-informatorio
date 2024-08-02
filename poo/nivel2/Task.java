package poo.nivel2;

public class Task {
    private String title;
    private String description;
    // private LocalDate expirationDate;


    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        // this.expirationDate = expirationDate;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getDescription() {
        return this.description;
    }

    // public LocalDate getExpirationDate() {
    //     return expirationDate;
    // }

}
