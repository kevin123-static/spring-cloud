package kevin.service;

import kevin.entity.UserFeignEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="PROVIDER-USER")
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    UserFeignEntity findById(@PathVariable("id") Long id);
}
