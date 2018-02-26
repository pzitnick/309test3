package test;
import static org.junit.Assert.*;
import org.junit.Test;
import logic.WeightConversion;

public class TestWeightConversion {
  @Test
  public void testKilosToPounds() {
    WeightConversion test = new WeightConversion();
    double input = 10;
    double output = test.KilosToPounds(input);
    assertEquals((double)(10/0.454), output, 0);
  }
  
  @Test
  public void testPoundsToKilos() {
    WeightConversion test = new WeightConversion();
    double input = 10;
    double output = test.PoundsToKilos(input);
    assertEquals((double)(10*0.454), output, 0);
  }
  
}
