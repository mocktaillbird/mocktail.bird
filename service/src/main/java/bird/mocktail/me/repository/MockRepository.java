package bird.mocktail.me.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import bird.mocktail.me.model.Mock;


public interface MockRepository extends MongoRepository<Mock, String> {
	
	public Optional<Mock> findById(String id);
	
	public Mock save(Mock mock);
}
