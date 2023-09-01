package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* AOP.UniversityLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void AOP.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() " +
//            "&& !returnMagazineFromUniLibrary()")
//    private void allWithoutReturnMagazine() {
//    }
//
//    @Before("allWithoutReturnMagazine()")
//    public void noReturnMagazine() {
//        System.out.println("noReturnMagazine");
//    }

//    @Pointcut("execution(* AOP.UniversityLibrary.get*())")
//    private void allGetMethodsUniversityLibrary(){};
//
//    @Pointcut("execution(* return*()))")
//    private void allReturnMethodsUniversityLibrary(){}
//
//    @Pointcut("allGetMethodsUniversityLibrary() " +
//            "|| allReturnMethodsUniversityLibrary()")
//    private void allGetAndReturnMethods(){}
//
//
//    @Before("allGetMethodsUniversityLibrary()")
//    public  void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: log #1");
//    }
//
//    @Before("allReturnMethodsUniversityLibrary()")
//    public  void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: log #2");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetReturnLoggingAdvice(){
//        System.out.println("beforeGetReturnLoggingAdvice: log #3");
//    }

//    метод будет вызываться до метода getBook
//    @Before("execution(public void AOP.UniversityLibrary.getBook())")
//    @Before("execution(public void getBook(String))")
//    @Before("execution(public void getBook(*))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void get*(*))")
//    @Before("execution(public void get*(..))")
//    @Before("execution(public void getBook(AOP.Book, ..))")
//    @Before("execution (* get*())")
//    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: логирование - попытка получить книгу/журнал ");
//        System.out.println("--------------------------------------");
//    }

    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        //для addbook будем выводить параметры, а для addMagazine нет
        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object object : arguments){
                if (object instanceof Book){
                    Book myBook = (Book) object;
                    System.out.println("Инфо о книге: " + myBook.getName() +
                            "\n" + myBook.getAuthor() + "\n" + myBook.getYearOfPublication());
                }
                else if (object instanceof String){
                    String name = (String) object;
                    System.out.println("Имя пользователя: " + name);
                }
            }
        }

        System.out.println("beforeAddBookAdvice: логирование - попытка получить книгу/журнал ");
        System.out.println("--------------------------------------");


    }


//    @Before("execution( *  returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: логирование - попытка вернуть книгу");
//    }

}
