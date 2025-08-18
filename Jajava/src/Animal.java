public class Animal {

    String name;
    String description;
    String date;

    Animal(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;
}
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public String getDate() {
        return this.date;
    }
    public void displayAnimalInfo() {
        System.out.println("Nome: " + this.name);
        System.out.println("Descrição: " + this.description);
        System.out.println("Data: " + this.date);
    }
}