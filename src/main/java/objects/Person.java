package objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void retrieveInformation(){
        System.out.printf(
                "Name is: %s Surname is: %s Age is: %d Weight is: %f Is hetero: %s",
                name, surname, age, weight, isHetero);
    }

    public Person() {
    }

    public Person(String name, String surname, int age, double weight, boolean isHetero) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.isHetero = isHetero;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;






    }
}
