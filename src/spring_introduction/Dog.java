package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//constructor
    public Dog() {

        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Dog31");
    }

    public void init(){
        System.out.println("Class dog: init method");
    }public void destroy(){
        System.out.println("Class dog: destroy method");
    }
}
