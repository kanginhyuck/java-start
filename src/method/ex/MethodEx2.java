package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

        public static void printMessage(String message, int times) {
            for (int i = 0; i < times; i++) {
                System.out.println(message);
       }
    }
}