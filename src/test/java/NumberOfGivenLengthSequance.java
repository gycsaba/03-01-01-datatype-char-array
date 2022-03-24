import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfGivenLengthSequance {

   @Test
   public void testNoSequence() {
      char[] game ={};
      double expected=0;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,3);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testOnlyOne() {
      char[] game ={'F','F','F','F','F','I','I','I','F','F'};
      double expected=1;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,3);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testThree() {
      char[] game ={'F','I','I','F','F','F','I','I','F','F','I','F','F','I','F','I','F','I','I','F','F','F','I','I','I','I','I','F','F',};
      double expected=3;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,2);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testFront() {
      char[] game ={'I','I','F','F','F','I','I','I','F','F','I','I','F'};
      double expected=2;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,2);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testEnd() {
      char[] game ={'I','I','F','I','F','I','I','I','F','F','I','I','F','I','I'};
      double expected=3;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,2);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

   @Test
   public void testLong() {
      char[] game ={'F','I','I','F','F','F','I','I','F','F','I','F','F','I','F','I','F','I','I','I','I','I','I','I','I','I','I','F','F',};
      double expected=3;
      double actual=MyCharArray.getNumberOfGivenLengthSequance(game,10);
      Assertions.assertEquals(expected,actual,"Rosszul hatarozta meg leghosszabb csak I-bkől álló sorozat hosszát!");
   }

}
