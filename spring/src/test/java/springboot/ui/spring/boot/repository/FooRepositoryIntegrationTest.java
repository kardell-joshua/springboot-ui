package springboot.ui.spring.boot.repository;

import springboot.ui.spring.demo.DemoApplicationIntegrationTest;
import springboot.ui.spring.demo.model.Foo;
import springboot.ui.spring.demo.respository.FooRepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

@Transactional
public class FooRepositoryIntegrationTest extends DemoApplicationIntegrationTest {
    @Autowired
    private FooRepository fooRepository;

    @Before
    public void setUp() {
        fooRepository.save(new Foo("Foo"));
        fooRepository.save(new Foo("Bar"));
    }

    @Test
    public void testFindByName() {
        Foo foo = fooRepository.findByName("Bar");

        assertThat(foo, notNullValue());
        assertThat(foo, notNullValue());
        assertThat(foo.getName(), is("Bar"));
    }
}
