package learn4.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name){
        String message = "Hello ," + name +"!";
        return message;
    }
}
