package si.um.feri.obu.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Component;
import si.um.feri.obu.domain.model.Authorities;
import si.um.feri.obu.domain.model.User;
import si.um.feri.obu.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Component
public class UserCreator implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {
        User user = new User();
        user.setUsername("greg");
        StandardPasswordEncoder spe = new StandardPasswordEncoder();
        user.setPassword(spe.encode("greg"));
        user.setEmail("grega@grega.xyz");
        Set<Authorities> authoritiesSet = new HashSet<>();
        authoritiesSet.add(Authorities.ROLE_ADMIN);
        authoritiesSet.add(Authorities.ROLE_SUPER_USER);
        authoritiesSet.add(Authorities.ROLE_USER);
        user.setAuthorities(authoritiesSet);
        userRepository.save(user);
    }
}
