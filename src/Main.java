import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        int numar = scanner.nextInt();
        afiseazaNumere(numar);

    }

    public static boolean isPrime(int numar) {
        if (numar < 2) {
            return false;
        }
        for (int i = 2; i <= numar / 2; i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void afiseazaNumere(int nr) {
        boolean estePrim = false;
        for (int i = 2; i <= nr; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                estePrim = true;
            }
        }
        if (!estePrim) {
            System.out.println("empty");
        }
    }
}