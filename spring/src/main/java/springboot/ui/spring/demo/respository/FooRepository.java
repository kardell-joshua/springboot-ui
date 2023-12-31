package springboot.ui.spring.demo.respository;

import springboot.ui.spring.demo.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Integer> {
    public Foo findByName(String name);
}
