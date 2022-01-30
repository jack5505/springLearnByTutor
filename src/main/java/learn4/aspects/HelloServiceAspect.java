package learn4.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* learn4.services.HelloService.hello(..))")
    public void before(){
        System.out.println("A");
    }

    @After("execution(* learn4.services.HelloService.hello(..))")
    public void after(){
        System.out.println("B");
    }

    @AfterReturning("execution(* learn4.services.HelloService.hello(..))")
    public void afterReturning(){
        System.out.println("C");
    }
}
