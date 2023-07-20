package springboot.ui.spring.demo.exceptions;

public class FooNotFoundException extends RuntimeException {
    

    private static final long serialVersionUId = 9042200028456133589L;

    public FooNotFoundException(String message) {
        super(message);
    }
}
