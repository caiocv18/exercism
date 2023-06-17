public class Lasagna {
    int minutesToPrepare = 2;
    int expectedOvenTime = 40;
    public int expectedMinutesInOven(){
        return this.expectedOvenTime;
    }

    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int amountLayers){
        return amountLayers * this.minutesToPrepare;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutes){
        return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
    }
}
