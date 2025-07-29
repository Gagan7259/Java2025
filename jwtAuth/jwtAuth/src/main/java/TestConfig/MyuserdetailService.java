package TestConfig;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyuserdetailService implements UserDetailsService {
    private StudentRepository stRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Userss user = stRepo.findByUsername(username);

        if (user == null) {
            System.out.println("user Not Found");
            throw new UsernameNotFoundException("User Not found");
        }
        return new UserPrincipall(user);
    }
}
