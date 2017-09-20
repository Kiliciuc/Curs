
import java.util.Scanner;

public class joc {
    public static void main(String[] args) {
        System.out.println("Ai naufragiat pe o insula");
        String alegere = plaja();
        boolean jocActiv = true;
        while (jocActiv) {
            switch (alegere) {
                case "epava":
                    alegere = epava();
                    break;
                case "coliba":
                    alegere = coliba();
                    break;
                case "plaja":
                    alegere = plaja();
                    break;
                case "pierdut":
                    jocActiv = false;
                    break;
                case "castigat":
                    jocActiv = false;
                    break;
                case "jungla":
                    alegere = jungla();
                    break;
            }
        }
    }

    public static String plaja() {
        System.out.println("Esti pe o plaja.La est e epava. La vest este o coliba.La sud ai marea");
        System.out.println("Ce alegi");
        System.out.println("1. Mergi la est");
        System.out.println("2. Mergi la vest");
        System.out.println("3. Mergi la sud");
        System.out.println("4. Mergi la nord");
        Scanner scanner = new Scanner(System.in);
        int alegerea = scanner.nextInt();
        String optiune = "plaja";
        switch (alegerea) {
            case 1:
                optiune = "epava";
                break;
            case 2:
                optiune = "coliba";
                break;
            case 3:
                optiune = "pierdut";
                System.out.printf("Ai intrat in mare si te-ai inecat");
                break;
            case 4:
                optiune = "jungla";
                break;
        }
        return optiune;
    }

    public static String epava() {
        System.out.println("Ai ajuns la vaporul cu care ai calatorit, dar este stricat");
        System.out.println("Ce alegi");
        System.out.println("1. Mergi la vest");
        System.out.println("2. Repara vaporul");
        System.out.println("3. Mergi la sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "plaja";
        switch (alegere) {
            case 1:
                optiune = "plaja";
                break;
            case 2:
                optiune = "castiga";
                System.out.println("Ai reusit sa repari vaporul si poti merge acasa, ai scapat de pe insula");
                break;
            case 3:
                optiune = "pierdut";
                System.out.println("Ai intrat in mare si te-ai inecat");
                break;
        }
        return optiune;
    }

    public static String coliba() {
        System.out.println("Ai ajuns la o coliba. In spate este un mos.La est ai plaja");
        System.out.println("1. Vorbeste cu mosul");
        System.out.println("2. Mergi spre est");
        System.out.println("2. Mergi spre sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "coliba";
        switch (alegere) {
            case 1:
                optiune = "castigat";
                System.out.println("Mosul are un vapor pe partea opusa a insulei.Te duce pana acolo");
                System.out.printf("Ai ajuns acasa");
                break;
            case 2:
                optiune = "plaja";
                break;
            case 3:
                optiune = "pierdut";
                System.out.println("Ai intra in mare si te-ai inecat");
                break;
        }
        return optiune;
    }

    public static String jungla() {
        System.out.println("Ai ajuns in jungla, oare o sa reusesti sa te  intorci vreodata acasa?");
        System.out.println("Cararea principala din jungla se imparte in doua, un drum duce spre est, iar celalat drum te duce spre vest");
        System.out.println("1. Ma duc spre vest");
        System.out.println("2. Ma duc spre est");
        System.out.println("3. Hmmmm, mie frica sa intru mai indanc in jungla, prefer sa ma intorc pe plaja");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "jungla";
        switch (alegere) {
            case 1:
                optiune = "castigat";
                System.out.println("Super, ai ales drumul potrivit, la capatul drumului este o barca abandonata dar in stare buna de functionare, cu ea te poti intoarce acasa");
                System.out.printf("Ai ajuns acasa");
                break;
            case 2:
                optiune = "prapastie";
                System.out.printf("Ai cazut intr-o prapastie si ai murit");
                break;
            case 3:
                optiune = "plaja";
            System.out.println("Ai revenit spre plaja");
            break;
        }
        return optiune;
    }
}
