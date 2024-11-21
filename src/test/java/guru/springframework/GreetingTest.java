package guru.springframework;

import org.junit.jupiter.api.*;

public class GreetingTest {
    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called Once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In before each....");

        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        greeting = new Greeting();

        System.out.println(greeting.helloWorld("john"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After!!! ****** - I am only called Once!");
    }

}
