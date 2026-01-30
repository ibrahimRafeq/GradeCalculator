package com.example.gradecalculator.logic;

public class GradeCalculator {


    public String getLetterGrade(double percentage) {
        if (percentage >= 90 && percentage <= 100) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    public boolean isPassing(double percentage) {
        return percentage >= 60;
    }

    public double calculateAverage(double[] grades) {
        if (grades == null || grades.length == 0) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

}
