package springboot.ui.spring.demo.components;

import springboot.ui.spring.demo.model.Foo;
import springboot.ui.spring.demo.respository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {
    
    @Autowired
    private FooRepository fooRepository;

    public Foo getFooWithId(Integer id) throws Exception {
        return fooRepository.findById(id).orElse(null);
    }

    public Foo getFooWithName(String name) {
        return fooRepository.findByName(name);
    }
}
