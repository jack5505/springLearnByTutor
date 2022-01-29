package learn2.config;

import learn2.beans.Cat;
import learn2.beans.Owner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"learn2.beans"})
public class ProjectConfiglearn2 {

//    @Bean
//    public Cat cat(){
//        return new Cat();
//    }
//
//
//    @Bean
//    public Owner owner(Cat cat){
//        Owner owner = new Owner();
//        owner.setCat(cat);
//        return owner;
//    }

    @Bean
    @Qualifier("cat")
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("first");
        return cat;
    }

    @Bean
    @Qualifier("cat2")
    public Cat cat2(){
        Cat cat = new Cat();
        cat.setName("second");
        return cat;
    }

}
