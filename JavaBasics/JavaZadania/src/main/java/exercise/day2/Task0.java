package exercise.day2;

public class Task0 {

    public static void main (String [] args){

        // konwersja liczb zmiennoprzecinkowych na całkowite

        int firstValue = (int)123.456F;
        System.out.println("firstValue: " + firstValue);

        long secondValue = (long)456.789;
        System.out.println("secondValue: " + secondValue);

        // automatyczna konwersja typów

        long value3 = 123;
        System.out.println("value3: " + value3); // zachodzi automatyczna (domyślna) konwersja z typu int (ktory jest typem domyślnym dla liczb cakowitych na typ long)

        // powstaje int, rzutujemy na short i znów rzutujemy na int
        int value4 = (short)123;
        System.out.println("value4: " + value4);

        float value5 = 123.456F;
        double value6 = value5; // konwersja automatyczna/niejawna z floata na doubla

        double value7 = 33.988;
        int value8 = (int)value7;
        System.out.println("value8: " + value8);
        int value9 = (int)Math.round(value7);
        System.out.println("value9: " + value9);

        /* niejawna (automat) konwersja typów podczas operacji arytmetycznych/matematycznych
        jeżeli którykolwiek z elem (liczb) naszej operacji jest typu double, to cały wynik będzie double
        float --> cały wynik będzie float
        long --> cały wynik będzie long
         */

        short value10 = 1;
        int value11 = 2;
        long value12 = 3;
        float value13 = 4.4F;
        double value14 = 5.5;

        System.out.println("int z double: " + value11 + value14);
        System.out.println("int z long: " + value11 + value13);

        long l = value11 + value12;
        System.out.println("int z long: " + l);
        int i = value10 + value10;

    }
}
