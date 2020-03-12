import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpsonIntegrationTest {
  @Test
  public void test() {
    assertEquals(1.9999999986, SimpsonIntegration.simpson(290), 1e-10);
    assertEquals(1.9999996367, SimpsonIntegration.simpson(72), 1e-10);
    assertEquals(1.9999999975, SimpsonIntegration.simpson(252), 1e-10);
    assertEquals(1.9999961668, SimpsonIntegration.simpson(40), 1e-10);
  }
}
