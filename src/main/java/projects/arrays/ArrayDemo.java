package projects.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
            ArrayUtil util = new ArrayUtil();
            int[] array = util.createArray(5);
            util.fillArrayWithRandomNumbers(array);
            util.printArrayToConsole(array);
            System.out.println(util.findMaxNumber(array));
        }
    }

