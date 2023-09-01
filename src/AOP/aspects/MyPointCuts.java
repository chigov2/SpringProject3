package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

//public class MyPointCuts {
//    @Pointcut("execution (* get*())")
//    public void allGetMethods(){}
//}
public class MyPointCuts {
    @Pointcut("execution (* add*(..))")
    public void allAddMethods(){}
}
