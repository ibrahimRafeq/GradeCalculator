package com.example.gradecalculator.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GradeCalculatorTest {

    GradeCalculator calc = new GradeCalculator();

    @Test
    public void testLetterGradeA() {
        assertEquals("A", calc.getLetterGrade(95));
        assertEquals("A", calc.getLetterGrade(90));
    }

    @Test
    public void testLetterGradeB() {
        assertEquals("B", calc.getLetterGrade(85));
        assertEquals("B", calc.getLetterGrade(80));
    }

    @Test
    public void testLetterGradeC() {
        assertEquals("C", calc.getLetterGrade(75));
        assertEquals("C", calc.getLetterGrade(70));
    }

    @Test
    public void testLetterGradeD() {
        assertEquals("D", calc.getLetterGrade(65));
        assertEquals("D", calc.getLetterGrade(60));
    }

    @Test
    public void testLetterGradeF() {
        assertEquals("F", calc.getLetterGrade(59));
        assertEquals("F", calc.getLetterGrade(0));
    }

    @Test
    public void testPassingGrade() {
        assertTrue(calc.isPassing(75));
        assertTrue(calc.isPassing(60));
        assertFalse(calc.isPassing(59));
        assertFalse(calc.isPassing(0));
    }
    @Test
    public void testCalculateAverageNormal() {
        double[] grades = {80, 90, 70};
        // استخدم delta صغير، مثلا 0.001
        assertEquals(80.0, calc.calculateAverage(grades), 0.001);
    }

    @Test
    public void testCalculateAverageEmpty() {
        double[] grades = {};
        assertEquals(0.0, calc.calculateAverage(grades), 0.001);
    }

    @Test
    public void testCalculateAverageSingleValue() {
        double[] grades = {100};
        assertEquals(100.0, calc.calculateAverage(grades), 0.001);
    }
}
