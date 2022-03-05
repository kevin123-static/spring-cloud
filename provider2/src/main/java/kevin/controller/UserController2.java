package kevin.controller;
import kevin.entity.User2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController2 {
    @GetMapping("/{id}")
    public User2 findById(@PathVariable Long id) {
        User2 user = new User2();
        user.setId(2l);
        user.setUsername("test2");
        return user;
    }
}