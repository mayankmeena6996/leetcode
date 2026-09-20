class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int year = 0;
        for (int i = 1950; i < 2050; i++) {
            int population = 0;
            for (int j = 0; j < logs.length; j++) {
                if (i >= logs[j][0] && i < logs[j][1]) {
                    population++;
                }
            }
            if (population > max) {
                max = population;
                year = i;
            }
        }
        return year;
    
    }
}