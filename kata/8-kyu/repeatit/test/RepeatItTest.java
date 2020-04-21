import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RepeatItTest {
  @Test
  public void testStar() {
    assertEquals("***", RepeatIt.repeatString("*", 3));
  }

  @Test
  public void testHello() {
    assertEquals("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello", RepeatIt.repeatString("Hello", 11));
  }
}