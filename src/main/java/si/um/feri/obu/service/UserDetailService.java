package si.um.feri.obu.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import si.um.feri.obu.domain.model.Authorities;
import si.um.feri.obu.domain.model.User;
import si.um.feri.obu.repository.UserRepository;

import java.util.ArrayList;
import java.util.Collection;

@Component("userDetailService")
public class UserDetailService implements UserDetailsService {

    private final Logger logg = LoggerFactory.getLogger(UserDetailsService.class);

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        logg.info("Authenticating: ", login);

        String lowercaseLogin = login.toLowerCase();

        User userFromDB;

        if(lowercaseLogin.contains("@")) {
            userFromDB = userRepository.findByEmail(lowercaseLogin);
        } else {
            userFromDB = userRepository.findByUsername(lowercaseLogin);
        }

        if(userFromDB == null) {
            throw new UsernameNotFoundException("User " + lowercaseLogin + " was not found in database!");
        }

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for(Authorities authority : userFromDB.getAuthorities()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.name());
            grantedAuthorities.add(grantedAuthority);
        }

        return new org.springframework.security.core.userdetails.User(userFromDB.getUsername(), userFromDB.getPassword(), grantedAuthorities);
    }
}
