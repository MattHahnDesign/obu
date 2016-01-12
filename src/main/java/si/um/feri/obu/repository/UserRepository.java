package si.um.feri.obu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import si.um.feri.obu.domain.model.User;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByUsername(String username);
    public User findByEmail(String email);

}
