//even odd in java?
for (int i = 1; i <= num; i++) {
    if ((i % 2) == 0) {
        System.out.print("\n" + i + " Is Even");
    } else if ((num % 2) >= 0) {
        System.out.print("\n" + i + " Is Odd");
    }
}


for (int i = 1; i <= num; i++) {
    if (i % 2 == 0) {
        System.out.print("\n" + i + " Is Even");
    } else if (num % 2 >= 0) {
        System.out.print("\n" + i + " Is Odd");
    }
}


for (int i = 1; i <= num; i++) {
    if (i % 2 == 0) {
        System.out.print("\n" + i + " Is Even");
    } else {
        System.out.print("\n" + i + " Is Odd");
    }
}


public class EvenOdd {
    public static void main(String[] args) {
        // input
        System.out.print("\nEnter a number less than 100: ");

        // variable
        int num = Expo.enterInt();

        System.out.println();

        // output
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Is Even");
            } else {
                System.out.println(i + " Is Odd");
            }
        }
    }
}


