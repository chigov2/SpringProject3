package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {




//    @Pointcut("execution (* get*())")
//    private void allGetMethods(){}

    //метод будет вызываться до метода getBook
//    @Before("execution(public void AOP.UniversityLibrary.getBook())")
//    @Before("execution(public void getBook(String))")
//    @Before("execution(public void getBook(*))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void get*(*))")
//    @Before("execution(public void get*(..))")
//    @Before("execution(public void getBook(AOP.Book, ..))")
//    @Before("execution (* get*())")

//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: логирование - попытка получить книгу/журнал ");
//    }
//
//    @Before("execution( *  returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: логирование - попытка вернуть книгу");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение кгиги/журнала");
//
//    }
}
