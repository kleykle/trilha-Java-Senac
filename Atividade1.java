import java.util.Scanner;
import java.util.Locale;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========================================");
            System.out.println("MENU DE ATIVIDADES - TRILHA 01");
            System.out.println("1 - Prazer, Eu sou");
            System.out.println("2 - Churrasco de Domingo");
            System.out.println("3 - Média de Notas");
            System.out.println("4 - Compras no Exterior");
            System.out.println("5 - Compra Online");
            System.out.println("6 - Cuidando da Saúde");
            System.out.println("7 - Você lê rápido");
            System.out.println("8 - Açaiteria");
            System.out.println("9 - Piloto Kart");
            System.out.println("10 - Meta Pessoal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Semestre: ");
                    int semestre = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Hobby favorito: ");
                    String hobby = scanner.nextLine();
                    
                    System.out.printf("Prazer, eu sou o(a) %s!\n", nome);
                    System.out.printf("Atualmente estou no %dº semestre de %s e meu hobby favorito é %s.\n", semestre, curso, hobby);
                    break;

                case 2:
                    System.out.print("Quantidade de pessoas: ");
                    int pessoas = scanner.nextInt();
                    
                    double carneKg = (300.0 * pessoas) / 1000.0;
                    double linguicaKg = (200.0 * pessoas) / 1000.0;
                    double frangoKg = (150.0 * pessoas) / 1000.0;
                    
                    double custoCarne = carneKg * 50.0;
                    double custoLinguica = linguicaKg * 28.0;
                    double custoFrango = frangoKg * 22.0;
                    double custoTotal = custoCarne + custoLinguica + custoFrango;
                    
                    System.out.println("Quantidades:");
                    System.out.printf("Carne: %.1f kg - Linguiça: %.1f kg - Frango: %.1f kg\n", carneKg, linguicaKg, frangoKg);
                    System.out.println("Custo total:");
                    System.out.printf("Carne: R$ %.2f - Linguiça: R$ %.2f - Frango: R$ %.2f\n", custoCarne, custoLinguica, custoFrango);
                    System.out.printf("Custo total do churrasco: R$ %.2f\n", custoTotal);
                    System.out.printf("Cada pessoa deve contribuir com: R$ %.2f\n", (custoTotal / pessoas));
                    break;

                case 3:
                    System.out.print("Nome do(a) estudante: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Nota 1: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = scanner.nextDouble();
                    System.out.print("Nota 3: ");
                    double n3 = scanner.nextDouble();
                    
                    double media = (n1 + n2 + n3) / 3.0;
                    System.out.printf("O(A) estudante %s ficou com média %.1f\n", nomeAluno, media);
                    break;

                case 4:
                    System.out.print("Valor em reais (R$): ");
                    double reais = scanner.nextDouble();
                    double dolares = reais / 5.42;
                    
                    System.out.printf("Valor em real R$ %.2f.\n", reais);
                    System.out.printf("Valor em dólar $ %.2f.\n", dolares);
                    break;

                case 5:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Valor da compra (R$): ");
                    double valorCompra = scanner.nextDouble();
                    System.out.print("Cupom de desconto (%): ");
                    double descontoPorcentagem = scanner.nextDouble();
                    
                    double valorFinal = valorCompra - (valorCompra * (descontoPorcentagem / 100.0));
                    System.out.printf("Olá %s, sua compra de R$ %.2f foi confirmada!\n", nomeCliente, valorCompra);
                    System.out.printf("Foi aplicado um desconto de %.1f%%.\n", descontoPorcentagem);
                    System.out.printf("O total final ficou em R$ %.2f\n", valorFinal);
                    break;

                case 6:
                    System.out.print("Nome: ");
                    String nomeImc = scanner.nextLine();
                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    
                    double imc = peso / (altura * altura);
                    System.out.printf("%s, seu IMC é de %.4f\n", nomeImc, imc);
                    break;

                case 7:
                    System.out.print("Nome do leitor: ");
                    String nomeLeitor = scanner.nextLine();
                    System.out.print("Nome do livro: ");
                    String livro = scanner.nextLine();
                    System.out.print("Total de páginas: ");
                    int paginas = scanner.nextInt();
                    System.out.print("Tempo de leitura por página (segundos): ");
                    int segPorPagina = scanner.nextInt();
                    
                    double horasTotais = (paginas * segPorPagina) / 3600.0;
                    System.out.printf("%s, você finalizará a leitura do livro %s em aproximadamente %.2f horas.\n", nomeLeitor, livro, horasTotais);
                    break;

                case 8:
                    System.out.print("Quantidade Açaí Pequeno: ");
                    int qtdP = scanner.nextInt();
                    System.out.print("Quantidade Açaí Médio: ");
                    int qtdM = scanner.nextInt();
                    System.out.print("Quantidade Açaí Grande: ");
                    int qtdG = scanner.nextInt();
                    System.out.print("Cupom de desconto (%): ");
                    double descontoAcai = scanner.nextDouble();
                    
                    double subtotalAcai = (qtdP * 13.50) + (qtdM * 15.00) + (qtdG * 17.50);
                    double totalAcai = subtotalAcai - (subtotalAcai * (descontoAcai / 100.0));
                    
                    System.out.println("Seu pedido foi registrado.");
                    System.out.printf("- Açaí P: %d\n", qtdP);
                    System.out.printf("- Açaí M: %d\n", qtdM);
                    System.out.printf("- Açaí G: %d\n", qtdG);
                    System.out.printf("Desconto de %.0f%% aplicado.\n", descontoAcai);
                    System.out.printf("Total R$ %.2f\n", totalAcai);
                    break;

                case 9:
                    System.out.print("Tamanho da pista (metros): ");
                    double pistaMetros = scanner.nextDouble();
                    System.out.print("Quantidade de voltas: ");
                    int voltas = scanner.nextInt();
                    System.out.print("Tempo da primeira volta (segundos): ");
                    double tempoVoltaSeg = scanner.nextDouble();
                    
                    double distanciaKm = (pistaMetros * voltas) / 1000.0;
                    double previsaoMinutos = (tempoVoltaSeg * voltas) / 60.0;
                    
                    System.out.println("Análise Preditiva Concluída");
                    System.out.printf("Distância total a ser percorrida: %.2f km.\n", distanciaKm);
                    System.out.printf("Previsão de conclusão: %.1f minutos.\n", previsaoMinutos);
                    break;

                case 10:
                    System.out.print("Descrição da meta: ");
                    String meta = scanner.nextLine();
                    System.out.print("Valor necessário (R$): ");
                    double valorMeta = scanner.nextDouble();
                    System.out.print("Salário mensal (R$): ");
                    double salario = scanner.nextDouble();
                    System.out.print("Despesas mensais (R$): ");
                    double despesas = scanner.nextDouble();
                    
                    double saldo = salario - despesas;
                    double reservaFixa = saldo * 0.30;
                    double disponivelMeta = saldo - reservaFixa;
                    double prazoMeses = valorMeta / disponivelMeta;
                    
                    System.out.printf("Meta: %s (R$ %.2f)\n", meta, valorMeta);
                    System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f\n", salario, despesas);
                    System.out.printf("Saldo após despesas: R$ %.2f\n", saldo);
                    System.out.printf("Reserva fixa (30%%): R$ %.2f\n", reservaFixa);
                    System.out.printf("Valor disponível para a meta: R$ %.2f por mês\n", disponivelMeta);
                    System.out.printf("Prazo estimado para atingir a meta: %.2f meses\n", prazoMeses);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}