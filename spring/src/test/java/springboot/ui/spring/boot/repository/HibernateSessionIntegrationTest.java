package springboot.ui.spring.boot.repository;

import springboot.ui.spring.demo.DemoApplicationIntegrationTest;
import springboot.ui.spring.demo.model.Foo;
import springboot.ui.spring.demo.respository.FooRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@Transactional
public class HibernateSessionIntegrationTest extends DemoApplicationIntegrationTest {
    @Autowired
    private FooRepository fooRepository;

    @Test
    public void whenSavingWithCurrentSession_thenThrowNoException() {
        fooRepository.save(new Foo("Exception Solved"));

        Foo foo = fooRepository.findByName("Exception solved");

        assertThat(foo, notNullValue());
        assertThat(foo.getId(), notNullValue());
        assertThat(foo.getName(), is("Exception Solved"));
    }
}
