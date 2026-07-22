public class Lasagna {
   
     public int expectedMinutesInOven(){
         int time = 40 ;
         return time;
     }
   
     public int  remainingMinutesInOven(int minutesInOven){
         int remianingtime = expectedMinutesInOven() - minutesInOven ;
         return remianingtime;
     }
   
     public int preparationTimeInMinutes(int numberOfLayers ){
         int prepMinutes  = numberOfLayers * 2 ;
         return prepMinutes ;
     }
  
    public int totalTimeInMinutes( int numberoflayers , int minutesinoven) {
        int totalminutes = preparationTimeInMinutes(numberoflayers) + minutesinoven ;
        return totalminutes;
    }
}
