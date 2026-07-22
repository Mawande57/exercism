public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
     public int expectedMinutesInOven(){
         int time = 40 ;
         return time;
     }
    // TODO: define the 'remainingMinutesInOven()' method
     public int  remainingMinutesInOven(int minutesInOven){
         int remianingtime = expectedMinutesInOven() - minutesInOven ;
         return remianingtime;
     }
    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int numberOfLayers ){
         int prepMinutes  = numberOfLayers * 2 ;
         return prepMinutes ;
     }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes( int numberoflayers , int minutesinoven) {
        int totalminutes = preparationTimeInMinutes(numberoflayers) + minutesinoven ;
        return totalminutes;
    }
}
