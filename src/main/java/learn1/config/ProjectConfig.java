package learn1.config;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"learn1.repository", "learn1.services"})
public class ProjectConfig {


}
