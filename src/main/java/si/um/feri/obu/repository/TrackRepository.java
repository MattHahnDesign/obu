package si.um.feri.obu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import si.um.feri.obu.domain.xjc.Track;

public interface TrackRepository extends MongoRepository<Track, String> {
}
