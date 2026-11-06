package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void isEven_ShouldReturnTrue_WhenValueIsZero() {
        assertTrue(CourseToolkit.isEven(0));
        assertTrue(CourseToolkit.isEven(2));
        assertFalse(CourseToolkit.isEven(7));
        assertTrue(CourseToolkit.isEven(-4));
    }
    @Test
    void isPrime_ShouldReturnFalse_WhenNumberIsLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(-7));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(1));
    }
    @Test
    void isPrime_ShouldReturnTrue_ForPrimes() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(3));
        assertTrue(CourseToolkit.isPrime(13));
        assertTrue(CourseToolkit.isPrime(97));
        assertFalse(CourseToolkit.isPrime(25));
    }
    @Test
    void isPalindrome_ShouldReturnTrue_ForExactPalindromes() {
        assertTrue(CourseToolkit.isPalindrome(""));
        assertTrue(CourseToolkit.isPalindrome("a"));
        assertTrue(CourseToolkit.isPalindrome("radar"));
        assertTrue(CourseToolkit.isPalindrome("12321"));
        assertTrue(CourseToolkit.isPalindrome("a b a"));
        assertFalse(CourseToolkit.isPalindrome("Radar"));
        assertFalse(CourseToolkit.isPalindrome("java"));
    }
    @Test
    void average_ShouldHandleNegativeNumbersAndFractions() {
        assertEquals(-2.0, CourseToolkit.average(new int[]{-4, -2, 0}), 1e-9);
        assertEquals(2.5, CourseToolkit.average(new int[]{2, 3}), 1e-9);
    }
    @Test
    void average_ShouldThrowException_WhenArrayIsEmptyOrNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(null));
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[0]));
    }
}