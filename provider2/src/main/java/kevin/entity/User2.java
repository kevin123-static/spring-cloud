package kevin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User2 {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}