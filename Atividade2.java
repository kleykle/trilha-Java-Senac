import java.util.Scanner;
import java.util.Locale;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========================================");
            System.out.println("MENU DE ATIVIDADES - TRILHA 02 (CONDICIONAL)");
            System.out.println("1 - Orçamento Familiar");
            System.out.println("2 - Semáforo");
            System.out.println("3 - Dia por Extenso");
            System.out.println("4 - Sorveteria em Promoção");
            System.out.println("5 - Boletim Aluno");
            System.out.println("6 - Qual é a cor?");
            System.out.println("7 - Nota de Corte");
            System.out.println("8 - Calculadora com Menu");
            System.out.println("9 - Mensalidade Universidade");
            System.out.println("10 - Ingressos para o Cinema");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Orçamento Familiar[cite: 13]
                    System.out.print("Ganhos: ");
                    double ganhos = scanner.nextDouble();
                    System.out.print("Gastos: ");
                    double gastos = scanner.nextDouble();
                    
                    if (ganhos >= gastos) {
                        System.out.println("Você está dentro do orçamento!");
                    } else {
                        System.out.println("Você está fora do orçamento! Não gaste mais!");
                    }
                    break;

                case 2: // Semáforo[cite: 14]
                    System.out.print("Cor do semáforo: ");
                    String corSemaforo = scanner.nextLine().trim().toLowerCase();
                    
                    if (corSemaforo.equals("vermelho")) {
                        System.out.println("Espere");
                    } else if (corSemaforo.equals("verde")) {
                        System.out.println("Atravesse");
                    } else {
                        System.out.println("Farol inoperante");
                    }
                    break;

                case 3: // Dia por Extenso[cite: 15]
                    System.out.print("Número do dia (0 a 6): ");
                    int dia = scanner.nextInt();
                    
                    switch (dia) {
                        case 0: System.out.println("Domingo"); break;
                        case 1: System.out.println("Segunda-feira"); break;
                        case 2: System.out.println("Terça-feira"); break;
                        case 3: System.out.println("Quarta-feira"); break;
                        case 4: System.out.println("Quinta-feira"); break;
                        case 5: System.out.println("Sexta-feira"); break;
                        case 6: System.out.println("Sábado"); break;
                        default: System.out.println("Dia da semana inválido");
                    }
                    break;

                case 4: // Sorveteria em Promoção[cite: 16]
                    System.out.print("Total de gramas: ");
                    double gramas = scanner.nextDouble();
                    
                    if (gramas <= 0) {
                        System.out.println("Peso inválido");
                    } else {
                        double precoPor100g = (gramas >= 1000) ? 3.00 : 3.50;
                        double totalSorveteria = (gramas / 100) * precoPor100g;
                        System.out.printf("O total é R$ %.2f\n", totalSorveteria);
                    }
                    break;

                case 5: // Boletim Aluno[cite: 17]
                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();
                    System.out.print("Nota 3: ");
                    double nota3 = scanner.nextDouble();
                    System.out.print("Faltas: ");
                    int faltas = scanner.nextInt();
                    
                    double media = (nota1 + nota2 + nota3) / 3.0;
                    
                    if (media < 0 || media > 10 || faltas < 0) {
                        System.out.println("Parâmetros inválidos");
                    } else {
                        System.out.printf("Média: %.1f.\n", media);
                        if (faltas > 4) {
                            System.out.println("Situação: Reprovado por Falta");
                        } else if (media >= 8) {
                            System.out.println("Situação: Aprovado com sucesso");
                        } else if (media >= 6) {
                            System.out.println("Situação: Aprovado");
                        } else if (media > 0) {
                            System.out.println("Situação: Recuperação");
                        } else {
                            System.out.println("Situação: Desistente");
                        }
                    }
                    break;

                case 6: // Qual é a cor?[cite: 18]
                    System.out.print("Cor 1: ");
                    String c1 = scanner.nextLine().trim().toLowerCase();
                    System.out.print("Cor 2: ");
                    String c2 = scanner.nextLine().trim().toLowerCase();
                    
                    boolean p1 = c1.equals("vermelho") || c1.equals("azul") || c1.equals("amarelo");
                    boolean p2 = c2.equals("vermelho") || c2.equals("azul") || c2.equals("amarelo");
                    
                    if (!p1 || !p2) {
                        System.out.println("Apenas cores primárias são aceitas.");
                    } else {
                        System.out.println("A combinação resulta em:");
                        if ((c1.equals("vermelho") && c2.equals("azul")) || (c1.equals("azul") && c2.equals("vermelho"))) {
                            System.out.println("Roxo");
                        } else if ((c1.equals("vermelho") && c2.equals("amarelo")) || (c1.equals("amarelo") && c2.equals("vermelho"))) {
                            System.out.println("Laranja");
                        } else if ((c1.equals("azul") && c2.equals("amarelo")) || (c1.equals("amarelo") && c2.equals("azul"))) {
                            System.out.println("Verde");
                        } else {
                            // Se forem cores iguais
                            System.out.println(c1.substring(0, 1).toUpperCase() + c1.substring(1));
                        }
                    }
                    break;

                case 7: // Nota de Corte[cite: 19]
                    System.out.print("Nota candidato: ");
                    double notaCand = scanner.nextDouble();
                    System.out.print("Nota de corte: ");
                    double notaCorte = scanner.nextDouble();
                    System.out.print("Nota mín. aprovação: ");
                    double notaMin = scanner.nextDouble();
                    
                    System.out.println("Situação candidato:");
                    if (notaCand < notaCorte) {
                        System.out.println("Reprovado");
                    } else if (notaCand >= notaMin) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("Lista de Espera");
                    }
                    break;

                case 8: // Calculadora com Menu[cite: 20]
                    System.out.print("Valor 1: ");
                    double v1 = scanner.nextDouble();
                    System.out.print("Valor 2: ");
                    double v2 = scanner.nextDouble();
                    scanner.nextLine(); // limpar
                    System.out.print("Operação (1 a 6 ou nome): ");
                    String operacao = scanner.nextLine().trim().toLowerCase();
                    
                    if (operacao.equals("1") || operacao.equals("soma")) {
                        System.out.printf("%.1f + %.1f = %.1f\n", v1, v2, (v1 + v2));
                    } else if (operacao.equals("2") || operacao.equals("subtração") || operacao.equals("subtracao")) {
                        System.out.printf("%.1f - %.1f = %.1f\n", v1, v2, (v1 - v2));
                    } else if (operacao.equals("3") || operacao.equals("multiplicação") || operacao.equals("multiplicacao")) {
                        System.out.printf("%.1f * %.1f = %.1f\n", v1, v2, (v1 * v2));
                    } else if (operacao.equals("4") || operacao.equals("divisão") || operacao.equals("divisao")) {
                        System.out.printf("%.1f / %.1f = %.1f\n", v1, v2, (v1 / v2));
                    } else if (operacao.equals("5") || operacao.equals("resto")) {
                        System.out.printf("%.1f mod %.1f = %.1f\n", v1, v2, (v1 % v2));
                    } else if (operacao.equals("6") || operacao.equals("potência") || operacao.equals("potencia")) {
                        System.out.printf("%.1f ^ %.1f = %.1f\n", v1, v2, Math.pow(v1, v2));
                    } else {
                        System.out.println("Operação não suportada");
                    }
                    break;

                case 9: // Mensalidade Universidade[cite: 21]
                    System.out.print("Sigla do curso (SI, ADS, CS, EC, ES): ");
                    String sigla = scanner.nextLine().trim().toUpperCase();
                    System.out.print("Isento (Sim/Não): ");
                    String isento = scanner.nextLine().trim().toLowerCase();
                    System.out.print("Desconto (%): ");
                    double desconto = scanner.nextDouble();
                    
                    double valorBase = -1;
                    switch (sigla) {
                        case "SI": valorBase = 900.00; break;
                        case "ADS": valorBase = 750.00; break;
                        case "CS": valorBase = 1150.00; break;
                        case "EC": valorBase = 1300.00; break;
                        case "ES": valorBase = 950.00; break;
                    }
                    
                    if (valorBase == -1) {
                        System.out.println("Curso não encontrado");
                    } else {
                        if (isento.equals("sim")) {
                            System.out.println("Valor da mensalidade: R$ 0.00");
                        } else {
                            double valorFinal = valorBase - (valorBase * (desconto / 100.0));
                            System.out.printf("Valor da mensalidade:\nR$ %.2f\n", valorFinal);
                        }
                    }
                    break;

                case 10: // Ingressos para o Cinema[cite: 22]
                    System.out.print("Qtd Inteiras: ");
                    int inteiras = scanner.nextInt();
                    System.out.print("Qtd Meias: ");
                    int meias = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Dia da semana: ");
                    String diaSemana = scanner.nextLine().trim().toLowerCase();
                    System.out.print("Nacional (Sim/Não): ");
                    String nacional = scanner.nextLine().trim().toLowerCase();
                    
                    double totalPagar = 0;
                    int totalIngressos = inteiras + meias;
                    
                    if (nacional.equals("sim")) {
                        totalPagar = totalIngressos * 5.00;
                    } else if (diaSemana.equals("quarta-feira") || diaSemana.equals("quarta")) {
                        totalPagar = totalIngressos * 14.50;
                    } else {
                        totalPagar = (inteiras * 28.50) + (meias * 14.25);
                    }
                    
                    System.out.printf("Total à pagar:\nR$ %.2f\n", totalPagar);
                    break;

                case 0:
                    System.out.println("Encerrando a Atividade 2...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}