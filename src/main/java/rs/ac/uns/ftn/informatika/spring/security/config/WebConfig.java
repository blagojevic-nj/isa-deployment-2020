package rs.ac.uns.ftn.informatika.spring.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {
 
    //CORS neka bude enable-ovan samo prilikom razvoja aplikacije
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").allowedOrigins("http://localhost:4200");
//    }
}
