package springboot.ui.spring.crud.repositories;

import org.springframework.data.repository.*;

import springboot.ui.spring.Repository;
import springboot.ui.spring.crud.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}