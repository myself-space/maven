import org.junit.Test;

/**
 * @date 2020/12/11 - 12:33
 */
public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        String maven = hello.sayHello("Maven22222222222");
        System.out.println(maven);
    }
}