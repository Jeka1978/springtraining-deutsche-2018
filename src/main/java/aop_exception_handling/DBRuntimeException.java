package aop_exception_handling;

/**
 * @author Evgeny Borisov
 */
public class DBRuntimeException extends RuntimeException {
    public DBRuntimeException(String message) {
        super(message);
    }
}
