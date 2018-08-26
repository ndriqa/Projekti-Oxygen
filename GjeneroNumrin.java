import java.util.Random;

/**Kjo klase gjeneron, permes nje metode qe kthen nje variabel 
 * te tipit 'int', nje numer treshifror, i tille qe numri 
 * te mos i kete ndonje shifer te perseritur
 * @author ndriqa*/

public class GjeneroNumrin {
   public int random(){
      Random rand = new Random();
      int temp = 123;
      boolean gjetur = false;
      boolean ndryshShifror = true;
      boolean paZero = true;

      
      while(!gjetur){
         temp = rand.nextInt(999) + 1;
         String s = ""+temp;
         if (temp>100) {
        	 if(s.charAt(0)==s.charAt(1) || s.charAt(0)==s.charAt(2) || s.charAt(1)==s.charAt(2)){
        	 	ndryshShifror = false;
         	 }
        	 if(s.charAt(1)=='0' || s.charAt(2)=='0') {
            	 paZero = false;
         }
         
         }
         if(temp>100 && ndryshShifror && paZero){   
            gjetur = true;
         }
         
      }
      return temp;
   }
}