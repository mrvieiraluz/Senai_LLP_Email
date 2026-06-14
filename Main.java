public class main {
    public static void main(String[] args) {
        int quantidade = 1;

        if (args.length > 0) {
            try {
                quantidade = Integer.parseInt(args[0]);
                if (quantidade < 1) {
                    System.out.println("Informe um número de dados maior ou igual a 1.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Uso: java main [quantidade_de_dados]");
                System.out.println("Exemplo: java main 2");
                return;
            }
        }

        for (int i = 1; i <= quantidade; i++) {
            int valor = (int) (Math.random() * 6) + 1;
            System.out.println("Dado " + i + ": " + valor);
            imprimirDado(valor);
            if (i < quantidade) {
                System.out.println();
            }
        }
    }

    private static void imprimirDado(int valor) {
        String[] desenho;
        switch (valor) {
            case 1:
                desenho = new String[]{
                    "+-------+",
                    "|       |",
                    "|   o   |",
                    "|       |",
                    "+-------+"
                };
                break;
            case 2:
                desenho = new String[]{
                    "+-------+",
                    "| o     |",
                    "|       |",
                    "|     o |",
                    "+-------+"
                };
                break;
            case 3:
                desenho = new String[]{
                    "+-------+",
                    "| o     |",
                    "|   o   |",
                    "|     o |",
                    "+-------+"
                };
                break;
            case 4:
                desenho = new String[]{
                    "+-------+",
                    "| o   o |",
                    "|       |",
                    "| o   o |",
                    "+-------+"
                };
                break;
            case 5:
                desenho = new String[]{
                    "+-------+",
                    "| o   o |",
                    "|   o   |",
                    "| o   o |",
                    "+-------+"
                };
                break;
            case 6:
                desenho = new String[]{
                    "+-------+",
                    "| o   o |",
                    "| o   o |",
                    "| o   o |",
                    "+-------+"
                };
                break;
            default:
                desenho = new String[]{"Valor incorreto"};
        }

        for (String linha : desenho) {
            System.out.println(linha);
        }
    }
}