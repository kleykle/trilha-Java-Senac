import java.util.Scanner;
import java.util.Locale;

public class Atividade5 {
    
    // Arrays globais para o Controle de Estoque (Ex 9)
    static String[] nomesEstoque = new String[1000];
    static int[] qtdEstoque = new int[1000];
    static int totalProdutosEstoque = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int opcao = -1;

        while (opcao != 0) {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1: orquestrarAcaiteria(scanner); break;
                case 2: orquestrarPiloto(scanner); break;
                case 3: orquestrarMeta(scanner); break;
                case 4: orquestrarCalculadora(scanner); break;
                case 5: orquestrarMensalidade(scanner); break;
                case 6: orquestrarCinema(scanner); break;
                case 7: orquestrarMercado(scanner); break;
                case 8: orquestrarBanco(scanner); break;
                case 9: orquestrarEstoque(scanner); break;
                case 10: orquestrarFaturamento(scanner); break;
                case 0: System.out.println("Encerrando a Atividade 5..."); break;
                default: System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("\n========================================");
        System.out.println("MENU DE ATIVIDADES - TRILHA 05 (FUNÇÕES)[cite: 45]");
        System.out.println("1 - Açaiteria[cite: 46]");
        System.out.println("2 - Piloto Kart[cite: 47]");
        System.out.println("3 - Meta Pessoal[cite: 48]");
        System.out.println("4 - Calculadora com Menu[cite: 49]");
        System.out.println("5 - Mensalidade Universidade[cite: 50]");
        System.out.println("6 - Ingressos para o Cinema[cite: 51]");
        System.out.println("7 - Caixa Mercado[cite: 52]");
        System.out.println("8 - Sistema Bancário[cite: 53]");
        System.out.println("9 - Controle de Estoque[cite: 54]");
        System.out.println("10 - Análise Mensal de Faturamento[cite: 55]");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // ==========================================
    // 1 - Açaiteria[cite: 46]
    // ==========================================
    public static void orquestrarAcaiteria(Scanner scanner) {
        double[] dados = coletarAcaiteria(scanner);
        double total = processarAcaiteria(dados);
        exibirAcaiteria(dados, total);
    }
    public static double[] coletarAcaiteria(Scanner scanner) {
        double[] dados = new double[4];
        System.out.print("Quantidade P: "); dados[0] = scanner.nextDouble();
        System.out.print("Quantidade M: "); dados[1] = scanner.nextDouble();
        System.out.print("Quantidade G: "); dados[2] = scanner.nextDouble();
        System.out.print("Cupom de desconto (%): "); dados[3] = scanner.nextDouble();
        return dados;
    }
    public static double processarAcaiteria(double[] d) {
        double subtotal = (d[0] * 13.50) + (d[1] * 15.00) + (d[2] * 17.50);
        return subtotal - (subtotal * (d[3] / 100.0));
    }
    public static void exibirAcaiteria(double[] d, double total) {
        System.out.println("Seu pedido foi registrado.");
        System.out.println("- Açaí P: " + (int)d[0]);
        System.out.println("- Açaí M: " + (int)d[1]);
        System.out.println("- Açaí G: " + (int)d[2]);
        System.out.printf("Desconto de %.0f%% aplicado.\n", d[3]);
        System.out.printf("Total R$ %.2f\n", total);
    }

    // ==========================================
    // 2 - Piloto Kart[cite: 47]
    // ==========================================
    public static void orquestrarPiloto(Scanner scanner) {
        double[] dados = coletarPiloto(scanner);
        double[] resultados = processarPiloto(dados);
        exibirPiloto(resultados);
    }
    public static double[] coletarPiloto(Scanner scanner) {
        double[] d = new double[3];
        System.out.print("Tamanho da pista (m): "); d[0] = scanner.nextDouble();
        System.out.print("Quantidade de voltas: "); d[1] = scanner.nextDouble();
        System.out.print("Tempo da 1ª volta (s): "); d[2] = scanner.nextDouble();
        return d;
    }
    public static double[] processarPiloto(double[] d) {
        double distKm = (d[0] * d[1]) / 1000.0;
        double tempoMin = (d[2] * d[1]) / 60.0;
        return new double[]{distKm, tempoMin};
    }
    public static void exibirPiloto(double[] r) {
        System.out.println("Análise Preditiva Concluída");
        System.out.printf("Distância total a ser percorrida: %.2f km.\n", r[0]);
        System.out.printf("Previsão de conclusão: %.1f minutos.\n", r[1]);
    }

    // ==========================================
    // 3 - Meta Pessoal[cite: 48]
    // ==========================================
    public static void orquestrarMeta(Scanner scanner) {
        System.out.print("Descrição da meta: ");
        String desc = scanner.nextLine();
        double[] dados = coletarMeta(scanner);
        double[] res = processarMeta(dados);
        exibirMeta(desc, dados, res);
    }
    public static double[] coletarMeta(Scanner s) {
        double[] d = new double[3];
        System.out.print("Valor da meta: "); d[0] = s.nextDouble();
        System.out.print("Salário: "); d[1] = s.nextDouble();
        System.out.print("Despesas: "); d[2] = s.nextDouble();
        return d;
    }
    public static double[] processarMeta(double[] d) {
        double saldo = d[1] - d[2];
        double reserva = saldo * 0.30;
        double disponivel = saldo - reserva;
        double meses = d[0] / disponivel;
        return new double[]{saldo, reserva, disponivel, meses};
    }
    public static void exibirMeta(String desc, double[] d, double[] r) {
        System.out.printf("Meta: %s (R$ %.2f)\n", desc, d[0]);
        System.out.printf("Salário: R$ %.2f - Despesas: R$ %.2f\n", d[1], d[2]);
        System.out.printf("Saldo após despesas: R$ %.2f\n", r[0]);
        System.out.printf("Reserva fixa (30%%): R$ %.2f\n", r[1]);
        System.out.printf("Valor disponível para a meta: R$ %.2f por mês\n", r[2]);
        System.out.printf("Prazo estimado para atingir a meta: %.2f meses\n", r[3]);
    }

    // ==========================================
    // 4 - Calculadora com Menu[cite: 49]
    // ==========================================
    public static void orquestrarCalculadora(Scanner scanner) {
        double n1 = coletarNumero(scanner, "Valor 1: ");
        double n2 = coletarNumero(scanner, "Valor 2: ");
        String op = coletarOperacao(scanner);
        double res = processarCalculadora(n1, n2, op);
        exibirCalculadora(n1, n2, op, res);
    }
    public static double coletarNumero(Scanner s, String msg) {
        System.out.print(msg);
        return s.nextDouble();
    }
    public static String coletarOperacao(Scanner s) {
        System.out.print("Operação (1.Soma, 2.Subtração, 3.Multiplicação, 4.Divisão, 5.Resto, 6.Potência): ");
        s.nextLine();
        return s.nextLine().trim().toLowerCase();
    }
    public static double processarCalculadora(double n1, double n2, String op) {
        if (op.equals("1") || op.equals("soma")) return n1 + n2;
        if (op.equals("2") || op.equals("subtração")) return n1 - n2;
        if (op.equals("3") || op.equals("multiplicação")) return n1 * n2;
        if (op.equals("4") || op.equals("divisão")) return n1 / n2;
        if (op.equals("5") || op.equals("resto")) return n1 % n2;
        if (op.equals("6") || op.equals("potência")) return Math.pow(n1, n2);
        return Double.NaN;
    }
    public static void exibirCalculadora(double n1, double n2, String op, double res) {
        if (Double.isNaN(res)) System.out.println("Operação não suportada");
        else {
            String sinal = op.equals("1") ? "+" : op.equals("2") ? "-" : op.equals("3") ? "*" : op.equals("4") ? "/" : op.equals("5") ? "mod" : "^";
            System.out.printf("%.1f %s %.1f = %.1f\n", n1, sinal, n2, res);
        }
    }

    // ==========================================
    // 5 - Mensalidade Universidade[cite: 50]
    // ==========================================
    public static void orquestrarMensalidade(Scanner s) {
        System.out.print("Sigla (SI, ADS, CS, EC, ES): ");
        String sigla = s.nextLine().toUpperCase();
        System.out.print("Isento (Sim/Não): ");
        String isento = s.nextLine().toLowerCase();
        System.out.print("Desconto (%): ");
        double desc = s.nextDouble();
        
        double valor = processarMensalidade(sigla, isento, desc);
        exibirMensalidade(valor);
    }
    public static double processarMensalidade(String sigla, String isento, double desc) {
        double base = -1;
        if(sigla.equals("SI")) base = 900;
        else if(sigla.equals("ADS")) base = 750;
        else if(sigla.equals("CS")) base = 1150;
        else if(sigla.equals("EC")) base = 1300;
        else if(sigla.equals("ES")) base = 950;
        
        if (base == -1) return -1;
        if (isento.equals("sim")) return 0.0;
        return base - (base * (desc / 100.0));
    }
    public static void exibirMensalidade(double valor) {
        if (valor == -1) System.out.println("Curso não encontrado");
        else System.out.printf("Valor da mensalidade: R$ %.2f\n", valor);
    }

    // ==========================================
    // 6 - Ingressos Cinema[cite: 51]
    // ==========================================
    public static void orquestrarCinema(Scanner s) {
        System.out.print("Inteiras: "); int inteiras = s.nextInt();
        System.out.print("Meias: "); int meias = s.nextInt();
        s.nextLine();
        System.out.print("Dia da semana: "); String dia = s.nextLine().toLowerCase();
        System.out.print("Nacional (Sim/Não): "); String nac = s.nextLine().toLowerCase();
        
        double total = processarCinema(inteiras, meias, dia, nac);
        System.out.printf("Total à pagar: R$ %.2f\n", total);
    }
    public static double processarCinema(int intrs, int ms, String dia, String nac) {
        int totalIngressos = intrs + ms;
        if (nac.equals("sim")) return totalIngressos * 5.00;
        if (dia.equals("quarta-feira") || dia.equals("quarta")) return totalIngressos * 14.50;
        return (intrs * 28.50) + (ms * 14.25);
    }

    // ==========================================
    // 7 - Caixa Mercado[cite: 52]
    // ==========================================
    public static void orquestrarMercado(Scanner s) {
        double total = coletarEProcessarComprasMercado(s);
        System.out.print("Parcelas: ");
        int parcelas = s.nextInt();
        exibirMercado(total, parcelas);
    }
    public static double coletarEProcessarComprasMercado(Scanner s) {
        double total = 0;
        System.out.println("Digite valores (0 encerra):");
        while (true) {
            double v = s.nextDouble();
            if (v == 0) break;
            if (v < 0) System.out.println("Valor inválido: " + v);
            else total += v;
        }
        return total;
    }
    public static void exibirMercado(double total, int parcelas) {
        if (parcelas <= 1) System.out.printf("Pagamento à vista: R$ %.0f\n", total);
        else {
            System.out.printf("Total da compra: R$ %.0f\n", total);
            System.out.printf("Parcelado em %dx de R$ %.2f\n", parcelas, (total/parcelas));
        }
    }

    // ==========================================
    // 8 - Sistema Bancário[cite: 53]
    // ==========================================
    public static void orquestrarBanco(Scanner s) {
        double saldo = 0;
        int op = -1;
        while (op != 0) {
            System.out.println("\n1. Consultar Saldo | 2. Depósito | 3. Saque | 0. Sair");
            op = s.nextInt();
            saldo = processarBanco(op, saldo, s);
        }
    }
    public static double processarBanco(int op, double saldo, Scanner s) {
        if (op == 1) System.out.printf("Saldo atual: R$ %.0f\n", saldo);
        else if (op == 2 || op == 3) {
            System.out.print("Valor: "); double v = s.nextDouble();
            if (v < 0) System.out.println("Valor inválido");
            else if (op == 2) saldo += v;
            else if (v > saldo) System.out.println("Saldo insuficiente");
            else saldo -= v;
        } else if (op != 0) System.out.println("Opção inválida");
        return saldo;
    }

    // ==========================================
    // 9 - Controle de Estoque[cite: 54]
    // ==========================================
    public static void orquestrarEstoque(Scanner s) {
        int op = -1;
        while (op != 0) {
            System.out.println("\n1. Adicionar | 2. Entrada | 3. Saída | 4. Listar | 0. Sair");
            op = s.nextInt(); s.nextLine();
            processarEstoque(op, s);
        }
    }
    public static void processarEstoque(int op, Scanner s) {
        if (op == 1) {
            if (totalProdutosEstoque >= 1000) System.out.println("Limite atingido!");
            else {
                System.out.print("Produto: "); nomesEstoque[totalProdutosEstoque] = s.nextLine();
                System.out.print("Qtd: "); qtdEstoque[totalProdutosEstoque] = s.nextInt();
                totalProdutosEstoque++;
                System.out.println("Produto adicionado com sucesso!");
            }
        } else if (op == 2 || op == 3) {
            System.out.print("Num produto: "); int p = s.nextInt();
            if (p > 0 && p <= totalProdutosEstoque) {
                System.out.print("Qtd: "); int q = s.nextInt();
                if (op == 2) { qtdEstoque[p-1] += q; System.out.println("Entrada realizada!"); }
                else {
                    if (q > qtdEstoque[p-1]) System.out.println("Quantidade insuficiente.");
                    else { qtdEstoque[p-1] -= q; System.out.println("Saída realizada!"); }
                }
            } else System.out.println("Produto não encontrado.");
        } else if (op == 4) {
            if (totalProdutosEstoque == 0) System.out.println("Vazio.");
            else {
                System.out.println("Estoque atual:");
                for (int i=0; i<totalProdutosEstoque; i++) 
                    System.out.println("Produto "+(i+1)+": "+nomesEstoque[i]+" - "+qtdEstoque[i]+" unidades");
            }
        } else if (op == 0) System.out.println("Encerrando...");
        else System.out.println("Inválido");
    }

    // ==========================================
    // 10 - Faturamento[cite: 55]
    // ==========================================
    public static void orquestrarFaturamento(Scanner s) {
        double[] fat = coletarFaturamento(s);
        String situacao = processarFaturamento(fat);
        exibirFaturamento(fat, situacao);
    }
    public static double[] coletarFaturamento(Scanner s) {
        System.out.print("Meses analisados: ");
        int m = s.nextInt();
        double[] f = new double[m];
        for(int i=0; i<m; i++) {
            System.out.print("Faturamento Mês " + (i+1) + ": ");
            f[i] = s.nextDouble();
        }
        return f;
    }
    public static String processarFaturamento(double[] f) {
        boolean cresc = true, queda = true, constt = true;
        for (int i = 1; i < f.length; i++) {
            if (f[i] < f[i-1]) cresc = false;
            if (f[i] > f[i-1]) queda = false;
            if (f[i] != f[i-1]) constt = false;
        }
        if (constt) return "Constante";
        if (cresc) return "Crescimento";
        if (queda) return "Queda";
        return "Sem padrão";
    }
    public static void exibirFaturamento(double[] f, String situacao) {
        System.out.println("\n>> Análise de Faturamento <<");
        System.out.print("Faturamento informado: ");
        for(int i=0; i<f.length; i++) System.out.print(f[i] + (i<f.length-1 ? ", " : "\n"));
        System.out.println("Situação: " + situacao);
    }
}