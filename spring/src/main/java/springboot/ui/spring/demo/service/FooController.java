package springboot.ui.spring.demo.service;

import springboot.ui.spring.demo.model.Foo;
import springboot.ui.spring.demo.components.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    
    @Autowired
    private FooService fooService;

    // Annotations associate metadata to the program elements
    // @GetMapping annotation is for mapping HTTP GET requests onto specific handler methods
    // @GetMapping is shorthand for @RequestMapping(method=RequestMethod.GET)
    @GetMapping("/{id}")
    public Foo getFooWithId(@PathVariable Integer id) throws Exception {
        return fooService.getFooWithId(id);
    }

    @GetMapping("/")
    public Foo getFooWithName(@RequestParam String name) throws Exception {
        return fooService.getFooWithName(name);
    }
}
