package TestConfig;

import com.example.jwtAuth.TestController.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Userss,Integer> {
    Userss findByUsername(String username);
}
