package kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMovieApplication.class, args);
    }
}