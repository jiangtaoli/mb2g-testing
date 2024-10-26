package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

//        assert("Hello World".equals(javaHelloWorld.getHello()));
        assertEquals("Hello World", javaHelloWorld.getHello());
    }

}