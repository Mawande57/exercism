class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastweek = {0, 2, 5, 3, 7, 8, 4};
        return lastweek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];  
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1; 
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0)
                return true;  // Removed unnecessary break
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        // Handle case where numberOfDays might be larger than array length
        int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < daysToCount; i++) {  
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}