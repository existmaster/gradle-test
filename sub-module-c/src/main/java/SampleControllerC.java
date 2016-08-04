import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by existmaster on 2016. 8. 4..
 */
@Controller
@EnableAutoConfiguration
public class SampleControllerC{

    @RequestMapping("c")
    @ResponseBody
    String home() {
        return "Hello sub-module C";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(SampleControllerB.class, args);
//    }

}