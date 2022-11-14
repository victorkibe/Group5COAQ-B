import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;


public class FractionConversions {


    static String FractionToDecimal(double a, int k) {


        int Integer = (int) a;
        double fraction = a - Integer;
        StringBuilder binary = new StringBuilder();


        while (Integer > 0) {
            int remainder = Integer % 2;
            binary.append((char) (remainder + '0'));
            Integer /= 2;
        }
        binary = new StringBuilder(reverse(binary.toString()));
        binary.append('.');

        while (k-- > 0) {

            fraction *= 2;
            int fr = (int) fraction;
            if (fr == 1) {

                fraction -= fr;
                binary.append((char) (1 + '0'));

            } else {
                binary.append('0');
            }
        }

        return binary.toString();
    }


    static String reverse(String input) {

        {
            char[] temparray = input.toCharArray();
            int left, right;
            right = temparray.length - 1;

            for (left = 0; left < right; left++, right--) {

                char temp = temparray[left];
                temparray[left] = temparray[right];
                temparray[right] = temp;
            }
            return String.valueOf(temparray);
        }

    }

    public class randomGen {
        double r = Math.random();


    }


    public static void main(String[] args) {


        int k = 5;
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        float a = (float) (Math.random() * 100);
       // System.out.println(numberFormat.format(a));



//1.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("1.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

//2.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("2.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

//3.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("3.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

       //4.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("4.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

        //5.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("5.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
//6
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("6.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
//7.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("7.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
        //8.

        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("8.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
        //9.
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("9.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
//10
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("10.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("11.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("12.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("13.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("14.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("15.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("16.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("17.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("18.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("19.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("20.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("21.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("22.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("23.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("24.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("25");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();


        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("26.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();
        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("27.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("28.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();



        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("29.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();

        k = 5;
        numberFormat = new DecimalFormat("#.000");
        a = (float) (Math.random() * 100);
        System.out.println("30.");
        System.out.println(numberFormat.format(a));
        System.out.println(FractionToDecimal(a, k));
        System.out.println("Approximate");
        System.out.println();




            }
        }










