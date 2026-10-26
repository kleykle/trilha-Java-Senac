import java.util.Scanner;
import java.util.Locale;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcaoPrincipal = -1;

        while (opcaoPrincipal != 0) {
            System.out.println("\n========================================");
            System.out.println("MENU DE ATIVIDADES - TRILHA 04 (VETORES)[cite: 34]");
            System.out.println("1 - Análise de Desempenho de uma Turma[cite: 35]");
            System.out.println("2 - Análise Mensal de Faturamento[cite: 36]");
            System.out.println("3 - Doações[cite: 37]");
            System.out.println("4 - FarmaZoom[cite: 38]");
            System.out.println("5 - Jogo da Forca[cite: 39]");
            System.out.println("6 - Projeto Fitness[cite: 40]");
            System.out.println("7 - Histórico de Transações[cite: 41]");
            System.out.println("8 - Controle de Estoque[cite: 42]");
            System.out.println("9 - Controle de Tarefas[cite: 43]");
            System.out.println("10 - Troca de Figurinhas[cite: 44]");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcaoPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcaoPrincipal) {
                case 1: // Análise de Desempenho de uma Turma[cite: 35]
                    System.out.print("Quantidade de alunos: ");
                    int qtdAlunos = scanner.nextInt();
                    double[] notas = new double[qtdAlunos];
                    double somaNotas = 0, maiorNota = -1, menorNota = 11;
                    int aprovados = 0, reprovados = 0;

                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.print("Nota do aluno " + (i + 1) + ": ");
                        notas[i] = scanner.nextDouble();
                        somaNotas += notas[i];
                        if (notas[i] > maiorNota) maiorNota = notas[i];
                        if (notas[i] < menorNota) menorNota = notas[i];
                        if (notas[i] >= 6) aprovados++;
                        else reprovados++;
                    }

                    System.out.println("\n>> Resultado da Turma <<");
                    System.out.print("Notas informadas: ");
                    for (int i = 0; i < qtdAlunos; i++) {
                        System.out.print(notas[i] + (i < qtdAlunos - 1 ? ", " : "\n"));
                    }
                    System.out.printf("☑ Média da turma: %.1f\n", (somaNotas / qtdAlunos));
                    System.out.printf("☑ Maior nota: %.1f\n", maiorNota);
                    System.out.printf("☑ Menor nota: %.1f\n", menorNota);
                    System.out.println("☑ Aprovados: " + aprovados);
                    System.out.println("☑ Reprovados: " + reprovados);
                    
                    if (reprovados == 0) {
                        System.out.println("Situação geral: Todos os alunos foram aprovados");
                    } else {
                        System.out.println("Situação geral: Nem todos os alunos foram aprovados");
                    }
                    break;

                case 2: // Análise Mensal de Faturamento[cite: 36]
                    System.out.print("Quantidade de meses analisados: ");
                    int meses = scanner.nextInt();
                    double[] faturamentos = new double[meses];
                    
                    for (int i = 0; i < meses; i++) {
                        System.out.print("Faturamento do mês " + (i + 1) + ": ");
                        faturamentos[i] = scanner.nextDouble();
                    }

                    boolean isCrescimento = true;
                    boolean isQueda = true;
                    boolean isConstante = true;

                    for (int i = 1; i < meses; i++) {
                        if (faturamentos[i] < faturamentos[i - 1]) isCrescimento = false;
                        if (faturamentos[i] > faturamentos[i - 1]) isQueda = false;
                        if (faturamentos[i] != faturamentos[i - 1]) isConstante = false;
                    }

                    System.out.println("\n>> Análise de Faturamento <<");
                    System.out.print("☑ Faturamento informado: ");
                    for (int i = 0; i < meses; i++) {
                        System.out.print(faturamentos[i] + (i < meses - 1 ? ", " : "\n"));
                    }

                    System.out.print("☑ Situação: ");
                    if (isConstante) System.out.println("Constante");
                    else if (isCrescimento) System.out.println("Crescimento");
                    else if (isQueda) System.out.println("Queda");
                    else System.out.println("Sem padrão");
                    break;

                case 3: // Doações[cite: 37]
                    System.out.print("Nome do projeto de caridade: ");
                    String projeto = scanner.nextLine();
                    System.out.print("Quantidade de doações: ");
                    int qtdDoacoes = scanner.nextInt();
                    System.out.print("Valor da meta financeira: ");
                    double meta = scanner.nextDouble();
                    
                    double[] doacoes = new double[qtdDoacoes];
                    double totalArrecadado = 0, maiorDoacao = 0;

                    for (int i = 0; i < qtdDoacoes; i++) {
                        System.out.print("Valor da doação " + (i + 1) + ": ");
                        doacoes[i] = scanner.nextDouble();
                        totalArrecadado += doacoes[i];
                        if (doacoes[i] > maiorDoacao) maiorDoacao = doacoes[i];
                    }

                    System.out.println("\n>> Resumo das Doações <<");
                    System.out.println("Projeto: " + projeto);
                    System.out.print("Doações recebidas: ");
                    for (int i = 0; i < qtdDoacoes; i++) {
                        System.out.print(doacoes[i] + (i < qtdDoacoes - 1 ? ", " : "\n"));
                    }
                    System.out.printf("☑ Total arrecadado: %.2f\n", totalArrecadado);
                    System.out.printf("☑ Maior doação: %.2f\n", maiorDoacao);
                    
                    if (totalArrecadado >= meta) {
                        System.out.println("☑ Situação: Meta atingida!");
                    } else {
                        System.out.println("☑ Situação: Meta não atingida");
                    }
                    break;

                case 4: // FarmaZoom[cite: 38]
                    System.out.print("Quantidade de medicamentos: ");
                    int qtdMed = scanner.nextInt();
                    double[] farmaA = new double[qtdMed];
                    double[] farmaB = new double[qtdMed];
                    double totalA = 0, totalB = 0;
                    int maisBaratoA = 0, maisBaratoB = 0, mesmoPreco = 0;

                    for (int i = 0; i < qtdMed; i++) {
                        System.out.print("Preço Farmácia A - Med " + (i + 1) + ": ");
                        farmaA[i] = scanner.nextDouble();
                        totalA += farmaA[i];
                    }
                    for (int i = 0; i < qtdMed; i++) {
                        System.out.print("Preço Farmácia B - Med " + (i + 1) + ": ");
                        farmaB[i] = scanner.nextDouble();
                        totalB += farmaB[i];
                        
                        if (farmaA[i] < farmaB[i]) maisBaratoA++;
                        else if (farmaB[i] < farmaA[i]) maisBaratoB++;
                        else mesmoPreco++;
                    }

                    System.out.println("\n☑ FARMAZOOM");
                    System.out.print("Farmácia A: ");
                    for (int i = 0; i < qtdMed; i++) System.out.print(farmaA[i] + (i < qtdMed - 1 ? ", " : "\n"));
                    System.out.print("Farmácia B: ");
                    for (int i = 0; i < qtdMed; i++) System.out.print(farmaB[i] + (i < qtdMed - 1 ? ", " : "\n"));
                    
                    System.out.println("\n☑ Produtos mais Baratos");
                    System.out.println("Na Farmácia A: " + maisBaratoA);
                    System.out.println("Na Farmácia B: " + maisBaratoB);
                    System.out.println("Mesmo preço: " + mesmoPreco);
                    System.out.println("\n☑ Total");
                    System.out.printf("Farmácia A: R$ %.2f\n", totalA);
                    System.out.printf("Farmácia B: R$ %.2f\n", totalB);
                    
                    System.out.print("Melhor opção: ");
                    if (totalA < totalB) System.out.println("Farmácia A");
                    else if (totalB < totalA) System.out.println("Farmácia B");
                    else System.out.println("Empate");
                    break;

                case 5: // Jogo da Forca[cite: 39]
                    System.out.print("Digite a palavra secreta: ");
                    String palavraSecreta = scanner.nextLine().toUpperCase();
                    for (int i = 0; i < 50; i++) System.out.println(); // Pular linhas
                    
                    char[] secreta = palavraSecreta.toCharArray();
                    char[] auxiliar = new char[secreta.length];
                    for (int i = 0; i < auxiliar.length; i++) auxiliar[i] = '_';
                    
                    int erros = 0;
                    boolean ganhou = false;

                    while (erros < 7 && !ganhou) {
                        System.out.print("\nForca: ");
                        for (char c : auxiliar) System.out.print(c + " ");
                        System.out.println("\nErros: " + erros);
                        
                        System.out.print("Letra: ");
                        char tentativa = scanner.nextLine().toUpperCase().charAt(0);
                        boolean acertou = false;
                        
                        for (int i = 0; i < secreta.length; i++) {
                            if (secreta[i] == tentativa) {
                                auxiliar[i] = tentativa;
                                acertou = true;
                            }
                        }
                        
                        if (!acertou) erros++;
                        
                        ganhou = true;
                        for (char c : auxiliar) {
                            if (c == '_') ganhou = false;
                        }
                    }

                    System.out.print("\nEstado Final: ");
                    for (char c : auxiliar) System.out.print(c + " ");
                    System.out.println("\nErros: " + erros);
                    
                    if (ganhou) System.out.println("Parabéns! Você descobriu a palavra.");
                    else System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
                    break;

                case 6: // Projeto Fitness[cite: 40]
                    System.out.print("Quantidade de dias monitorados: ");
                    int dias = scanner.nextInt();
                    int[] pesos = new int[dias];
                    int maxPeso = -1, minPeso = 9999;
                    int diaMax = 0, diaMin = 0;

                    for (int i = 0; i < dias; i++) {
                        System.out.print("Peso do dia " + (i + 1) + ": ");
                        pesos[i] = scanner.nextInt();
                        if (pesos[i] > maxPeso) { maxPeso = pesos[i]; diaMax = i + 1; }
                        if (pesos[i] < minPeso) { minPeso = pesos[i]; diaMin = i + 1; }
                    }

                    System.out.print("\nPesos informados: ");
                    for (int i = 0; i < dias; i++) System.out.print(pesos[i] + (i < dias - 1 ? ", " : "\n"));
                    System.out.println("Maior peso: " + maxPeso + " kg (Dia " + diaMax + ")");
                    System.out.println("Menor peso: " + minPeso + " kg (Dia " + diaMin + ")");
                    
                    System.out.println("\nGráfico de evolução:");
                    for (int i = 0; i < dias; i++) {
                        System.out.print("Dia " + (i + 1) + " | ");
                        for (int j = 0; j < (pesos[i] / 5); j++) System.out.print("*");
                        System.out.println(" " + pesos[i]);
                    }
                    break;

                case 7: // Histórico de Transações em Conta Corrente[cite: 41]
                    double[] transacoes = new double[1000];
                    int topo = 0;
                    System.out.println("Digite os valores das transações (0 anula anterior, -1 encerra):");
                    
                    while (topo < 1000) {
                        double valor = scanner.nextDouble();
                        if (valor == -1) break;
                        
                        if (valor == 0) {
                            if (topo > 0) topo--; // Cancela a última válida
                        } else {
                            transacoes[topo] = valor;
                            topo++;
                        }
                    }
                    
                    double saldoFinal = 0;
                    for (int i = 0; i < topo; i++) saldoFinal += transacoes[i];
                    System.out.printf("Saldo final: %.2f\n", saldoFinal);
                    break;

                case 8: // Controle de Estoque[cite: 42]
                    String[] produtosNomes = new String[1000];
                    int[] quantidades = new int[1000];
                    int totalProdutos = 0;
                    int opEstoque = -1;

                    while (opEstoque != 0) {
                        System.out.println("\nMenu Controle de Estoque");
                        System.out.println("1. Adicionar produto");
                        System.out.println("2. Realizar entrada no estoque");
                        System.out.println("3. Realizar saída no estoque");
                        System.out.println("4. Listar estoque");
                        System.out.println("0. Sair");
                        System.out.print("Opção: ");
                        opEstoque = scanner.nextInt();
                        scanner.nextLine();

                        if (opEstoque == 1) {
                            if (totalProdutos >= 1000) {
                                System.out.println("Limite de produtos atingido.");
                            } else {
                                System.out.print("Nome do produto: ");
                                produtosNomes[totalProdutos] = scanner.nextLine();
                                System.out.print("Quantidade inicial: ");
                                quantidades[totalProdutos] = scanner.nextInt();
                                totalProdutos++;
                                System.out.println("Produto adicionado com sucesso!");
                            }
                        } else if (opEstoque == 2) {
                            System.out.print("Número do produto (1 a " + totalProdutos + "): ");
                            int numProd = scanner.nextInt();
                            if (numProd > 0 && numProd <= totalProdutos) {
                                System.out.print("Quantidade para entrada: ");
                                quantidades[numProd - 1] += scanner.nextInt();
                                System.out.println("Entrada realizada com sucesso!");
                            } else {
                                System.out.println("Produto não encontrado.");
                            }
                        } else if (opEstoque == 3) {
                            System.out.print("Número do produto (1 a " + totalProdutos + "): ");
                            int numProd = scanner.nextInt();
                            if (numProd > 0 && numProd <= totalProdutos) {
                                System.out.print("Quantidade para saída: ");
                                int saida = scanner.nextInt();
                                if (saida <= quantidades[numProd - 1]) {
                                    quantidades[numProd - 1] -= saida;
                                    System.out.println("Saída realizada com sucesso!");
                                } else {
                                    System.out.println("Quantidade insuficiente em estoque.");
                                }
                            } else {
                                System.out.println("Produto não encontrado.");
                            }
                        } else if (opEstoque == 4) {
                            if (totalProdutos == 0) {
                                System.out.println("Nenhum produto cadastrado.");
                            } else {
                                System.out.println("\nEstoque atual:");
                                for (int i = 0; i < totalProdutos; i++) {
                                    System.out.println("Produto " + (i + 1) + ": " + produtosNomes[i] + " - " + quantidades[i] + " unidades");
                                }
                            }
                        } else if (opEstoque == 0) {
                            System.out.println("Encerrando controle de estoque...");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 9: // Controle de Tarefas[cite: 43]
                    String[] tarefas = new String[100];
                    boolean[] concluidas = new boolean[100];
                    int numTarefas = 0;
                    int opTarefa = -1;

                    while (opTarefa != 0) {
                        System.out.println("\nMenu Controle de Tarefas");
                        System.out.println("1. Adicionar tarefa");
                        System.out.println("2. Listar tarefas");
                        System.out.println("3. Marcar concluída");
                        System.out.println("4. Exibir pendentes");
                        System.out.println("0. Sair");
                        System.out.print("Opção: ");
                        opTarefa = scanner.nextInt();
                        scanner.nextLine();

                        if (opTarefa == 1) {
                            System.out.print("Nome da tarefa: ");
                            tarefas[numTarefas] = scanner.nextLine();
                            concluidas[numTarefas] = false;
                            numTarefas++;
                            System.out.println("Tarefa adicionada com sucesso!");
                        } else if (opTarefa == 2) {
                            if (numTarefas == 0) System.out.println("Nenhuma tarefa cadastrada.");
                            else {
                                System.out.println("\nLista de tarefas:");
                                for (int i = 0; i < numTarefas; i++) {
                                    System.out.println((i + 1) + "- [" + (concluidas[i] ? "X" : " ") + "] " + tarefas[i]);
                                }
                            }
                        } else if (opTarefa == 3) {
                            System.out.print("Número da tarefa para concluir: ");
                            int t = scanner.nextInt();
                            if (t > 0 && t <= numTarefas) {
                                concluidas[t - 1] = true;
                                System.out.println("Tarefa " + t + " marcada como concluída.");
                            } else {
                                System.out.println("Tarefa inválida.");
                            }
                        } else if (opTarefa == 4) {
                            if (numTarefas == 0) System.out.println("Nenhuma tarefa cadastrada.");
                            else {
                                System.out.println("\nTarefas pendentes:");
                                for (int i = 0; i < numTarefas; i++) {
                                    if (!concluidas[i]) {
                                        System.out.println((i + 1) + "- [ ] " + tarefas[i]);
                                    }
                                }
                            }
                        } else if (opTarefa == 0) {
                            System.out.println("Encerrando controle de tarefas...");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 10: // Troca de Figurinhas[cite: 44]
                    System.out.print("Quantidade de figurinhas do Jogador 1: ");
                    int qtd1 = scanner.nextInt();
                    int[] jog1 = new int[qtd1];
                    for (int i = 0; i < qtd1; i++) {
                        System.out.print("Figurinha J1 (" + (i + 1) + "): ");
                        jog1[i] = scanner.nextInt();
                    }

                    System.out.print("Quantidade de figurinhas do Jogador 2: ");
                    int qtd2 = scanner.nextInt();
                    int[] jog2 = new int[qtd2];
                    for (int i = 0; i < qtd2; i++) {
                        System.out.print("Figurinha J2 (" + (i + 1) + "): ");
                        jog2[i] = scanner.nextInt();
                    }

                    System.out.print("\nFigurinhas em comum: ");
                    for (int i = 0; i < qtd1; i++) {
                        for (int j = 0; j < qtd2; j++) {
                            if (jog1[i] == jog2[j]) System.out.print(jog1[i] + " ");
                        }
                    }

                    System.out.print("\nApenas jogador A: ");
                    int exclusivasA = 0;
                    for (int i = 0; i < qtd1; i++) {
                        boolean tem = false;
                        for (int j = 0; j < qtd2; j++) if (jog1[i] == jog2[j]) tem = true;
                        if (!tem) { System.out.print(jog1[i] + " "); exclusivasA++; }
                    }

                    System.out.print("\nApenas jogador B: ");
                    int exclusivasB = 0;
                    for (int i = 0; i < qtd2; i++) {
                        boolean tem = false;
                        for (int j = 0; j < qtd1; j++) if (jog2[i] == jog1[j]) tem = true;
                        if (!tem) { System.out.print(jog2[i] + " "); exclusivasB++; }
                    }

                    int trocasPossiveis = (exclusivasA < exclusivasB) ? exclusivasA : exclusivasB;
                    System.out.println("\nQuantidade de trocas possíveis: " + trocasPossiveis);
                    break;

                case 0:
                    System.out.println("Encerrando a Atividade 4...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}