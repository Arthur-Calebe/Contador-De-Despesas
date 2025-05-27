import java.util.Scanner;

public class ContadorDeDespezas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] descricao = new String[100];
        double[] valor = new double[100];
        int contador = 0;

        int opcao;

        do{
            System.out.println("\n===== Contador de Despesas =====");
            System.out.println("1. Adicionar despesa");
            System.out.println("2. Listar despesas");
            System.out.println("3. Ver total gasto");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da despesa:");
                    descricao[contador] = scanner.nextLine();

                    System.out.println("Digite o valor da despesa:");
                    valor[contador] = scanner.nextDouble();

                    contador++;
                    
                    System.out.println("\nDespesa adicionada com sucesso!");
                    break;

                case 2:
                System.out.println("===== Lista de Despesas =====");
                for (int i = 0; i < contador; i++) {
                    System.out.println((i + 1) + ". " + descricao[i] + " - R$ " + valor[i]);
                }
                if (contador == 0) {
                    System.out.println("\nNenhuma despesa registrada.");
                    
                }
                break;
                
                case 3:
                   double total = 0;
                    for (int i = 0; i < contador; i++) {
                        total += valor[i];
                    }
                    System.out.printf("Total gasto: R$ ", total);
                    break;
                
                    case 4:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
        System.out.println("\nObrigado por usar o Contador de Despesas!");
    }
}
        

