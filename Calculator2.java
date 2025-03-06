public class Calculator2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        if (!esNumero(args[0]) || !esNumero(args[2])) {
            System.out.println("Error: Los operandos deben ser números enteros.");
            System.exit(1);
        }

        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[2]);
        char operator = args[1].charAt(0);
        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: División por cero no permitida.");
                    System.exit(1);
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Error: Operador no válido.");
                System.exit(1);
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }

    public static boolean esNumero(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && !(i == 0 && str.charAt(i) == '-')) {
                return false;
            }
        }
        return true;
    }
}