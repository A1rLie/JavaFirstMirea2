package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class MyMathTest {
    static boolean factorialTest=false;
    static boolean powTest=false;

    @Test
    public void pow() {
        Assert.assertEquals(1, MyMath.pow(5, 0));
        Assert.assertEquals(27,MyMath.pow(3,3));
        Assert.assertEquals(144,MyMath.pow(12,2));
        powTest=true;
        writeMathFTestResults();
    }

    @Test
    public void factorial() {
        Assert.assertEquals(1,MyMath.factorial(0));
        Assert.assertEquals(24,MyMath.factorial(4));
        Assert.assertEquals(120,MyMath.factorial(5));
        factorialTest=true;
        writeMathFTestResults();
    }

    static void writeMathFTestResults() {
        try {
            FileWriter fw = new FileWriter("src\\ru\\mirea\\task31\\MathTestsResults.md");

            fw.write("# Результаты тестирования \n");

            fw.write("## Тест factorial()\n");
            if (MyMathTest.factorialTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            fw.write("## Тест pow()\n");
            if (MyMathTest.powTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }
        catch (IOException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        }
    }
}
