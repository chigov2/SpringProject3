package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    //метод будет вызываться до метода getBook
//    @Before("execution(public void AOP.UniversityLibrary.getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: логирование - попытка получить книгу");
    }

    @Before("execution( *  returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: логирование - попытка вернуть книгу");
    }
}
