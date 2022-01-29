package learn2.beans;

import learn2.Main;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


public class Cat {
    private String name;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
