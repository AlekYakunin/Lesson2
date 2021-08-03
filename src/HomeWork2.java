public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(checkRange(12, 18));
        printNum(5);
        System.out.println(posNeg(-10));
        messPrint("I Love Java", 5);
        System.out.println(yearCheck(2004));

    }

    public static boolean checkRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void printNum(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean posNeg(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }

    }

    public static void messPrint(String message, int a) {
        while (a > 0) {
            a--;
            System.out.println(message);
        }
    }

    public static boolean yearCheck(int year) {

        if (year % 4 == 0) {    // Все года, которые делятся на 4
            if (year % 400 == 0) {    // Все года, которые делятся на 400
                return true;
            } else {
                if (year % 100 == 0) {    // Все года, которые делятся на 100
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
