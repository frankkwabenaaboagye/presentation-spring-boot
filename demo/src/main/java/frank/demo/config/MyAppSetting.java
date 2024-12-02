package frank.demo.config;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data  // lombok
@ConfigurationProperties(prefix = "myapp.backend")
// @Component
public class MyAppSetting {

    private String name;
    private String ipaddress;

    @PostConstruct
    public void printOut(){
        System.out.println("my app name: " + this.name);
        System.out.println("my app IP: " + this.ipaddress);
    }
}
