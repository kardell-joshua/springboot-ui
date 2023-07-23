package springboot.ui.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import springboot.ui.spring.session.exception.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource("classpath:exception.properties")
public class ApplicationIntegrationTest {
    @Test
    public void contextLoads() {
    }
}
