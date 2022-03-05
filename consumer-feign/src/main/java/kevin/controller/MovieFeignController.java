package kevin.controller;
import kevin.entity.UserFeignEntity;
import kevin.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/feign/movies")
@RestController
public class MovieFeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public UserFeignEntity findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}