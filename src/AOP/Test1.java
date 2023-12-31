package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book =context.getBean("book", Book.class);

//        universityLibrary.getBook();
        universityLibrary.addBook("Mike",book);
        universityLibrary.addMagazine();

//        universityLibrary.getMagazine();
//        universityLibrary.getBook(book);
//        universityLibrary.returnBook();
//        universityLibrary.addBook();
//        universityLibrary.returnMagazine();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
