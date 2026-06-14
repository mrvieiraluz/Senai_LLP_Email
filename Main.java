import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static int numEmailsUnicos(String[] emails) {
       
        Set<String> enderecos = new HashSet<>();
        for (String email : emails) {
            String normalizado = normalizar(email);
            if (normalizado != null) {
                enderecos.add(normalizado);
            }
        }
        return enderecos.size();
    }
    private static String normalizar(String email) {
        int arroba = email.indexOf('@');
        if (arroba == -1) return null;

        String nomeLocal = email.substring(0, arroba);
        String dominio   = email.substring(arroba + 1);
        int plus = nomeLocal.indexOf('+');
        if (plus != -1) {
            nomeLocal = nomeLocal.substring(0, plus);
        }
        nomeLocal = nomeLocal.replace(".", "");

        return nomeLocal + "@" + dominio;
    }
    public static void main(String[] args) {
        String[] emails1 = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };

        String[] emails2 = {
            "a@leetcode.com",
            "b@leetcode.com",
            "c@leetcode.com"
        };
        System.out.println("=== Testes automáticos ===");
        System.out.println("Exemplo 1 => " + numEmailsUnicos(emails1) + " (esperado: 2)");
        System.out.println("Exemplo 2 => " + numEmailsUnicos(emails2) + " (esperado: 3)");

        System.out.println();
        System.out.println("=== Entrada manual ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos e-mails deseja informar? ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] entrada = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("E-mail " + (i + 1) + ": ");
            entrada[i] = sc.nextLine().trim();
        }

        System.out.println("Endereços únicos: " + numEmailsUnicos(entrada));
    }
}
