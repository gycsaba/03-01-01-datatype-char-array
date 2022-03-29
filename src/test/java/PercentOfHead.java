import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class PercentOfHead {

      @Test
      public void test() {
         double expected=41.18;
         double actual=MyCharArray.getPercentOfHead();
         Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg a fej dobazok szakalekat!");
      }
   }
