package application.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    
    private static final String template = "Hello, %s!";
    
    @RequestMapping("/health")
    public Health checkHealth() {
        return new Health("john", "smith");
    }

}
