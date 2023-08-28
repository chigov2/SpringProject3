package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person bean is created with constructor without parameters");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person setter \"setPet\" was used");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }

    public void callMyPet(){
        System.out.println("Hello me pet");
        pet.say();
    }
    //    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
}
