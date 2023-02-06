package vicky.names.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;
import vicky.names.entity.NameEntity;
@Repository



public interface NameRepository extends MongoRepository<NameEntity, String>  {

}
