public class Convert_Bin_Hex {
    public static void main(String[] args) {

        Integer number = 100;

        // Бинарный
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Шеснадцатиричный
        convert = Integer.toHexString(number);
        System.out.println(convert);

    }
}

