package Home_7;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        array[0][0] = "1";
        array[0][1] = "3";
        array[0][2] = "11";
        array[0][3] = "2";

        array[1][0] = "12";
        array[1][1] = "13";
        array[1][2] = "14";
        array[1][3] = "15";

        array[2][0] = "16";
        array[2][1] = "17";
        array[2][2] = "18";
        array[2][3] = "19";

        array[3][0] = "4";
        array[3][1] = "5";
        array[3][2] = "6";
        array[3][3] = "7";

        try {
            System.out.println(ArrayValueCalculator.doCalc(array));
        } catch (ArraySizeException e) {
            throw new RuntimeException(e);
        } catch (ArrayDataException e) {
            throw new RuntimeException(e);
        }

    }

    public static int doCalc(String[][] inputString) throws ArraySizeException, ArrayDataException {
        if (inputString.length != 4 || inputString[0].length != 4) {
            throw new ArraySizeException("Not correct size of array.");
        }
        int sum = 0;
        for (int i = 0; i < inputString.length; i++) {
            for (int y = 0; y < inputString[i].length; y++) {
                try {
                    sum += Integer.parseInt(inputString[i][y]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Not correct data type in box: [" + i + "] [ " + y + "] !" + e);
                }
            }
        }
        return sum;
    }

}
