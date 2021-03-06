package kevin.controller;
import kevin.entity.UserRibbonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/movies")
@RestController
public class MovieRibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public UserRibbonEntity findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        UserRibbonEntity user = this.restTemplate.getForObject("http://PROVIDER-USER/users/{id}", UserRibbonEntity.class, id);
        // ...电影微服务的业务...
        return user;
    }
}