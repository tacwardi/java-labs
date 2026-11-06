package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {return number % 2 == 0;}

    public static boolean isPrime(int number) {
        if (number < 2) {return false;}
        if (number == 2) {return true;}
        if (number % 2 == 0) {return false;}
        for (int i = 3; (long) i * i <= number; i += 2) {
            if (number % i == 0) {return false;}
        }
        return true;
    }

    public static boolean isPalindrome(String text) {if (text == null) {throw new IllegalArgumentException("Text cannot be null");}
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {if (text.charAt(left) != text.charAt(right)) {return false;}
            left++;
            right--;
        }
        return true;
    }

    public static double average(int[] values) {if (values == null || values.length == 0) {throw new IllegalArgumentException("Array must not be null or empty");}
        long sum = 0;
        for (int i = 0; i < values.length; i++) {sum += values[i];}
        return (double) sum / values.length;
    }
}



