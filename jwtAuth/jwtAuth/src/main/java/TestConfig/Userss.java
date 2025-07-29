package TestConfig;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@Getter
@Setter
@AllArgsConstructor
@Data
public class Userss {
    @Id
    private int id;
    private String userName;
    private String password;
}
