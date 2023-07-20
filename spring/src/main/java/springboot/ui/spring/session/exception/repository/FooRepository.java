package springboot.ui.spring.session.exception.repository;

import springboot.ui.spring.demo.model.Foo;

public interface FooRepository {
    
    void save(Foo foo);

    Foo get(Integer id);
}
