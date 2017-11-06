package TASK_02_03;

/**
 * Created by Роман on 06.11.2017.
 */
public class RestrictedException extends Exception {

    private Class<?> item;

    public RestrictedException(Class<?> item) {
        this.item = item;
    }

    @Override
    public String getMessage() {
        return item + " IS NOT ALLOWED!";
    }
}
