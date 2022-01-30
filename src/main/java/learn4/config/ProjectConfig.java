package learn4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"learn4.services","learn4.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
