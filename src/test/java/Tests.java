import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tests {

    @Tag("First")
    @Test()
    void firstTest(){
        int a=0;
        int b=2;
        Assertions.assertTrue(a+b==2);
    }

    @Tag("Second")
    @Test
    void secondTest(){
        int a=2;
        int b=3;
        Assertions.assertTrue(a*b==6);
    }

    @Tag("Third")
    @Test
    void thirdTest(){
        int a=4;
        int b=2;
        Assertions.assertTrue(a/b==2);
    }

    @Tag("Forth")
    @Test
    void forthTest(){
        int a=5;
        int b=3;
        Assertions.assertTrue(a-b==2);
    }
}
