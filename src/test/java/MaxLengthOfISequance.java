import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxLengthOfISequance {

   @Test
   public void testNoSequence() {
      char[] game ={};
      double expected=0;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testOnlyI() {
      char[] game ={'I','I','I','I','I','I','I','I','I','I','I'};
      double expected=11;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testInFront() {
      char[] game ={'I','I','I','I','F','F','I','F','I','I','F','I','I','I','F','F'};
      double expected=4;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testInBack() {
      char[] game ={'I','I','I','F','F','I','F','I','I','F','I','I','I','F','F','I','I','I','I'};
      double expected=4;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testInMiddle() {
      char[] game ={'I','I','I','F','F','I','F','I','I','F','I','I','I','I','I','I','F','F','I','I','I','I'};
      double expected=5;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testSame() {
      char[] game ={'F','I','I','I','F','F','I','I','I','F','F','I','I','I','F','I','I','I','F','F','I','I','I','F'};
      double expected=3;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testSame2() {
      char[] game ={'F','I','F','I','F','I','F','I','F','I','F','I','F','I','F','I','F','I','F','I','F','I','F','I'};
      double expected=1;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testNoI() {
      char[] game ={'F','F','F','F','F','F','F','F','F','F'};
      double expected=0;
      double actual=MyCharArray.getMaxLengthOfISequance(game);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }
}
