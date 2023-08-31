package AOP;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Мы берем книгу в университетской библиотеке");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал в университетской библиотеке");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в университетскую библиотеку");
        return "ok";
    }


}
