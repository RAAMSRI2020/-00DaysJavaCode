package com.conditionalsLoops;
public class battingAvg {

        public static void main(String[] args) {
            // Step 1: Player's innings data (sample data)
            int[] runsScored = {50, 30, 0, 45, 60}; // Runs scored in each inning
            int totalOuts = 2; // Total outs (dismissals)

            // Step 2: Calculate total runs scored
            int totalRuns = 0;
            for (int runs : runsScored) {
                totalRuns += runs;
            }

            // Step 3: Calculate batting average
            double battingAverage = (double) totalRuns / totalOuts;

            // Step 4: Display the batting average
            System.out.println("Batting Average: " + battingAverage);
        }


}
