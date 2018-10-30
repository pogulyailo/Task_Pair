import java.util.Scanner;

public class Pair {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insert the number 1 ");
        int a = scanner.nextInt();
        System.out.println(" Insert the number 2 ");
        int b = scanner.nextInt();
        System.out.println(" Insert the number 3 ");
        int c = scanner.nextInt();

        if (a == b && b == c && a == c) {
            System.out.print(a +""+ b +""+ c);
        }
                else if ((a == b) && (c != a) && (c != b)){
                System.out.print(a +""+ b);
        }
            else if ((a == c) && (b != a) && (b != c))
            { System.out.print(a +""+ c);
            }
            else if ((b == c) && (a != c) && (a != b))
            { System.out.print(b + "" + c);
            }
    }
}