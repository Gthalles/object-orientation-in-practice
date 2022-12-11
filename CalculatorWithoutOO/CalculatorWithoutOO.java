import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalculatorWithoutOO {
    public static void main(String args[]) throws IOException {
        char option;
        double result = 0;

        coutln("Calculator without Object Orientation.");

        while(true) {
            cout("Type number one: ");
            double number1 = cind();

            cout("Type number two: ");
            double number2 = cind();

            cout("Type the operation: ");
            char operation = cinch();
            
            switch(operation) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 == 0) {
                        coutln("Unvailable division..");
                        break;
                    }

                    result = number1 / number2;
                    break;

                default:
                    coutln("Invalid operation.");
                    break;
            }

            coutln("O resultado é " + Double.toString(result));

            coutln("Press 'S' or 's' to stop the calculator..");
            option = cinch();

            if(option != 'S' || option != 's') break;
        }

        coutln("Finished");
    }

    static String cin() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();

        return str;
    }

    static double cind() throws IOException {
        String str = cin();
        double d = 0;

        for (int i = 0; i < str.length(); i++) {
            coutln(str.charAt(i) + "");

            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == '.' || str.charAt(i) == '-') {
                continue;
            } else {
                return d;
            }
        }

        d = Double.parseDouble(str);

        return d;
    }

    static char cinch() throws IOException {
        String str = cin();
        char ch = 'e';

        if (str.length() >= 1) {
            ch = str.charAt(0);
        }

        return ch;
    }

    static void cout(String msg) {
        System.out.print(msg);
    }

    static void coutln(String msg) {
        System.out.println(msg);
    }
}