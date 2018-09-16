import java.util.Random;

/**
 * @author Khaustovich E.
 */

public class Base {
    public static void main(String[] args) {

        int[] array1 = new int[20];
        int minPol = 10;
        int maxOtr = -10;
        //заполняем массив
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array1[i] = -10 + random.nextInt(21);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Элемент массива № " + (i+1) + " = " + array1[i]);
        }
        //ищем min и max
        for (int i = 0; i < 20; i++) {
            if (array1[i] > 0) {
                if (array1[i] < minPol) {
                    minPol = array1[i];
                }
            }
            if (array1[i] < 0) {
                if (array1[i] > maxOtr) {
                    maxOtr = array1[i];
                }
            }
        }
        System.out.println("Минимальное положительное число = " + minPol + " , Максимальное отрицательное число = " + maxOtr);

        //меняем местами элементы

        for (int i = 0; i < 20; i++) {
            if (array1[i] == maxOtr) {
                array1[i] = minPol;
            } else
            if (array1[i] == minPol) {
                array1[i] = maxOtr;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Элемент массива № " + (i+1) + " = " + array1[i]);
        }



    }
}

