package AOP;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берем книгу в университетской библиотеке: ");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал в университетской библиотеке");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в университетскую библиотеку");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в университетскую библиотеку");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в университетскую библиотеку: ");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в университетскую библиотеку: ");
    }


}
