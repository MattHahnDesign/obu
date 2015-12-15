package si.um.feri.obu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import si.um.feri.obu.domain.model.OBU;

public interface OBURepository extends MongoRepository<OBU, String> {
}
