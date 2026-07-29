public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double productionRate = speed * 221;
        double finalRate;

        if (speed <= 4) {
            finalRate = productionRate;
        } else if (speed >= 5 && speed <= 8) {
            finalRate = productionRate * 0.9;
        } else if (speed == 9) {
            finalRate = productionRate * 0.8;
        } else {
            finalRate = productionRate * 0.77;
        }

        return finalRate;
    }

    public int workingItemsPerMinute(int speed) {

        double perHour = productionRatePerHour(speed);
        return (int)(perHour / 60);
    }
}
