package com.example.gradecalculator.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GradeCalculatorTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    public void testLetterGrade() {
        assertEquals("A", calc.getLetterGrade(100));
        assertEquals("A", calc.getLetterGrade(90));
        assertEquals("B", calc.getLetterGrade(89));
        assertEquals("B", calc.getLetterGrade(80));
        assertEquals("C", calc.getLetterGrade(79));
        assertEquals("C", calc.getLetterGrade(70));
        assertEquals("D", calc.getLetterGrade(69));
        assertEquals("D", calc.getLetterGrade(60));
        assertEquals("F", calc.getLetterGrade(59));
        assertEquals("F", calc.getLetterGrade(0));
    }


    @Test
    public void testPassingGrade() {
        assertTrue(calc.isPassing(75));
        assertFalse(calc.isPassing(55));
    }

    @Test
    public void testCalculateAverageNormal() {
        double[] grades = {85, 90, 80};
        assertEquals(85.0, calc.calculateAverage(grades), 0.001);
        double[] grades2 = {};
        assertEquals(0.0, calc.calculateAverage(grades2), 0.001);
        double[] grades3 = {100};
        assertEquals(100.0, calc.calculateAverage(grades3), 0.001);
    }

}
