import java.util.Scanner;
import java.util.Locale;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcaoPrincipal = -1;

        while (opcaoPrincipal != 0) {
            System.out.println("\n========================================");
            System.out.println("MENU DE ATIVIDADES - TRILHA 03[cite: 23]");
            System.out.println("1 - Tabuada[cite: 24]");
            System.out.println("2 - Calculadora[cite: 25]");
            System.out.println("3 - Controle de Temperatura[cite: 26]");
            System.out.println("4 - Caixa Mercado[cite: 27]");
            System.out.println("5 - Desafio da Soletração[cite: 28]");
            System.out.println("6 - Sistema Bancário[cite: 29]");
            System.out.println("7 - Fatorial[cite: 30]");
            System.out.println("8 - Fibonacci[cite: 31]");
            System.out.println("9 - Desenhar Retângulo[cite: 32]");
            System.out.println("10 - Desenhar Triângulo[cite: 33]");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1: // Tabuada[cite: 24]
                    System.out.print("Número para tabuada: ");
                    int numTabuada = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d x %d = %d\n", numTabuada, i, (numTabuada * i));
                    }
                    break;

                case 2: // Calculadora[cite: 25]
                    int opCalc = -1;
                    while (opCalc != 0) {
                        System.out.println("\nMenu de Opções");
                        System.out.println("1. Somar");
                        System.out.println("2. Subtrair");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("0. Sair");
                        System.out.print("Opção: ");
                        opCalc = scanner.nextInt();
                        
                        if (opCalc == 0) {
                            System.out.println("Fim.");
                            break;
                        }
                        
                        if (opCalc >= 1 && opCalc <= 4) {
                            System.out.print("N1: ");
                            double n1 = scanner.nextDouble();
                            System.out.print("N2: ");
                            double n2 = scanner.nextDouble();
                            
                            if (opCalc == 1) {
                                System.out.printf("Resultado: %.0f + %.0f = %.0f\n", n1, n2, (n1 + n2));
                            } else if (opCalc == 2) {
                                System.out.printf("Resultado: %.0f - %.0f = %.0f\n", n1, n2, (n1 - n2));
                            } else if (opCalc == 3) {
                                System.out.printf("Resultado: %.0f * %.0f = %.0f\n", n1, n2, (n1 * n2));
                            } else if (opCalc == 4) {
                                if (n2 == 0) {
                                    System.out.println("Divisão por zero não permitida");
                                } else {
                                    System.out.printf("Resultado: %.0f / %.0f = %.1f\n", n1, n2, (n1 / n2));
                                }
                            }
                        } else {
                            System.out.println("Opção inválida");
                        }
                    }
                    break;

                case 3: // Controle de Temperatura[cite: 26]
                    double maxTemp = -999;
                    double minTemp = 999;
                    boolean teveValida = false;
                    System.out.println("Digite as temperaturas (0 para encerrar):");
                    while (true) {
                        double temp = scanner.nextDouble();
                        if (temp == 0) break;
                        
                        if (temp < -50 || temp > 60) {
                            System.out.println("Temperatura inválida");
                        } else {
                            if (!teveValida) {
                                maxTemp = temp;
                                minTemp = temp;
                                teveValida = true;
                            } else {
                                if (temp > maxTemp) maxTemp = temp;
                                if (temp < minTemp) minTemp = temp;
                            }
                        }
                    }
                    if (teveValida) {
                        System.out.printf("Maior temperatura: %.0f\n", maxTemp);
                        System.out.printf("Menor temperatura: %.0f\n", minTemp);
                    }
                    break;

                case 4: // Caixa Mercado[cite: 27]
                    double totalMercado = 0;
                    System.out.println("Digite os valores das compras (0 para encerrar):");
                    while (true) {
                        double valor = scanner.nextDouble();
                        if (valor == 0) break;
                        if (valor < 0) {
                            System.out.println("Valor inválido");
                        } else {
                            totalMercado += valor;
                        }
                    }
                    System.out.print("Parcelar em quantas vezes? ");
                    int parcelas = scanner.nextInt();
                    
                    if (parcelas <= 1) {
                        System.out.printf("Pagamento à vista: R$ %.0f\n", totalMercado);
                    } else {
                        System.out.printf("Total da compra: R$ %.0f\n", totalMercado);
                        System.out.printf("Parcelado em %dx de R$ %.2f\n", parcelas, (totalMercado / parcelas));
                    }
                    break;

                case 5: // Desafio da Soletração[cite: 28]
                    System.out.print("Digite a palavra original: ");
                    String original = scanner.next();
                    String soletrada = "";
                    System.out.println("Digite as letras (0 para encerrar):");
                    while (true) {
                        String letra = scanner.next();
                        if (letra.equals("0")) break;
                        soletrada += letra;
                    }
                    System.out.println("Palavra original: " + original);
                    System.out.println("Palavra soletrada: " + soletrada);
                    break;

                case 6: // Sistema Bancário[cite: 29]
                    double saldo = 0;
                    int opBanco = -1;
                    while (opBanco != 0) {
                        System.out.println("\nMenu de Opções");
                        System.out.println("1. Consultar Saldo");
                        System.out.println("2. Realizar Depósito");
                        System.out.println("3. Realizar Saque");
                        System.out.println("0. Sair");
                        System.out.print("Opção: ");
                        opBanco = scanner.nextInt();
                        
                        if (opBanco == 1) {
                            System.out.printf("Saldo atual: R$ %.0f\n", saldo);
                        } else if (opBanco == 2) {
                            System.out.print("Valor do depósito: ");
                            double dep = scanner.nextDouble();
                            if (dep < 0) System.out.println("Valor inválido");
                            else saldo += dep;
                        } else if (opBanco == 3) {
                            System.out.print("Valor do saque: ");
                            double saq = scanner.nextDouble();
                            if (saq < 0) System.out.println("Valor inválido");
                            else if (saq > saldo) System.out.println("Saldo insuficiente");
                            else saldo -= saq;
                        } else if (opBanco != 0) {
                            System.out.println("Opção inválida");
                        }
                    }
                    break;

                case 7: // Fatorial[cite: 30]
                    System.out.print("Número para fatorial: ");
                    int numFatorial = scanner.nextInt();
                    if (numFatorial <= 0) {
                        System.out.println("Parâmetro inválido.");
                    } else {
                        long fat = 1;
                        for (int i = numFatorial; i >= 1; i--) {
                            fat *= i;
                        }
                        System.out.printf("O fatorial de %d é %d.\n", numFatorial, fat);
                    }
                    break;

                case 8: // Fibonacci[cite: 31]
                    System.out.print("Posição desejada na sequência: ");
                    int pos = scanner.nextInt();
                    if (pos <= 0) {
                        System.out.println("Posição inválida.");
                    } else {
                        long a = 1, b = 1;
                        for (int i = 3; i <= pos; i++) {
                            long temp = a + b;
                            a = b;
                            b = temp;
                        }
                        long result = (pos == 1 || pos == 2) ? 1 : b;
                        System.out.printf("O valor na posição %d da sequência de Fibonacci é %d\n", pos, result);
                    }
                    break;

                case 9: // Desenhar Retângulo[cite: 32]
                    System.out.print("Tamanho da base: ");
                    int base = scanner.nextInt();
                    System.out.print("Tamanho da altura: ");
                    int altura = scanner.nextInt();
                    
                    if (base <= 0 || altura <= 0) {
                        System.out.println("Retângulo inválido");
                    } else {
                        for (int i = 0; i < altura; i++) {
                            for (int j = 0; j < base; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 10: // Desenhar Triângulo[cite: 33]
                    System.out.print("Tamanho da altura: ");
                    int alturaTriangulo = scanner.nextInt();
                    
                    if (alturaTriangulo <= 0) {
                        System.out.println("Triângulo inválido");
                    } else {
                        for (int i = 1; i <= alturaTriangulo; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a Atividade 3...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}