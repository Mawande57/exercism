class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == !true){
            return true;
        }
    return false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true  ){
           return true;
       }
    return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       if(archerIsAwake == !true && prisonerIsAwake == true){
           return true;
       }      
    return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent == true && archerIsAwake == !true){
            return true;
        }
        else if(petDogIsPresent == !true && prisonerIsAwake == true &&  knightIsAwake ==                  !true && archerIsAwake ==  !true){
            return true;
        }
    return false;  
    }
}
