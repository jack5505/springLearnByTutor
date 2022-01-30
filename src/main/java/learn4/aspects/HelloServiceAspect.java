package learn4.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* learn4.services.HelloService.hello(..))")
//    public void before(){
//        System.out.println("A");
//    }
//
//
//    @After("execution(* learn4.services.HelloService.hello(..))")
//    public void after(){
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* learn4.services.HelloService.hello(..))")
//    public void afterReturning(){
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* learn4.services.HelloService.hello(..))")
//    public void afterThrowing(){
//        System.out.println("throws");
//    }

    @Around("execution(* learn4.services.HelloService.hello(..))")
    public <T> T around(ProceedingJoinPoint proced){
        System.out.println("A");
        T result = null;
        try {
            // result = (T) proced.proceed();
            result = (T) proced.proceed(new Object[]{"Jakhongir"});  // send parameter into method just cool
            System.out.println(result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;

    }


}
