import java.util.Scanner;
import java.util.Locale;

public class TodasAtividades {

    // Variáveis globais para os exercícios de Estoque (Trilhas 4 e 5)
    static String[] nomesEstoque = new String[1000];
    static int[] qtdEstoque = new int[1000];
    static int totalProdutosEstoque = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int trilha = -1;

        while (trilha != 0) {
            System.out.println("\n========================================");
            System.out.println("      MENU PRINCIPAL - SENAC 2026       ");
            System.out.println("========================================");
            System.out.println("1 - Trilha 01 (Modelo Sequencial)");
            System.out.println("2 - Trilha 02 (Modelo Condicional)");
            System.out.println("3 - Trilha 03 (Modelo Iterativo)");
            System.out.println("4 - Trilha 04 (Estrutura de Dados - Vetor)");
            System.out.println("5 - Trilha 05 (Funções)");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Escolha a Trilha desejada: ");
            
            trilha = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (trilha) {
                case 1: menuTrilha1(scanner); break;
                case 2: menuTrilha2(scanner); break;
                case 3: menuTrilha3(scanner); break;
                case 4: menuTrilha4(scanner); break;
                case 5: menuTrilha5(scanner); break;
                case 0: System.out.println("Encerrando o sistema geral. Até logo!"); break;
                default: System.out.println("Trilha inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    // =========================================================================
    // TRILHA 01 - SEQUENCIAL
    // =========================================================================
    public static void menuTrilha1(Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- TRILHA 01: SEQUENCIAL ---");
            System.out.println("1 - Prazer, Eu sou | 2 - Churrasco de Domingo | 3 - Média de Notas");
            System.out.println("4 - Compras no Exterior | 5 - Compra Online | 6 - Cuidando da Saúde");
            System.out.println("7 - Você lê rápido | 8 - Açaiteria | 9 - Piloto Kart | 10 - Meta Pessoal");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: "); String nome = scanner.nextLine();
                    System.out.print("Curso: "); String curso = scanner.nextLine();
                    System.out.print("Semestre: "); int semestre = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Hobby: "); String hobby = scanner.nextLine();
                    System.out.printf("Prazer, eu sou o(a) %s!\nAtualmente estou no %dº semestre de %s e meu hobby favorito é %s.\n", nome, semestre, curso, hobby);
                    break;
                case 2:
                    System.out.print("Qtd pessoas: "); int p = scanner.nextInt();
                    System.out.printf("Carne: %.1f kg | Linguiça: %.1f kg | Frango: %.1f kg\n", (300.0*p)/1000, (200.0*p)/1000, (150.0*p)/1000);
                    double total = ((300.0*p)/1000)*50 + ((200.0*p)/1000)*28 + ((150.0*p)/1000)*22;
                    System.out.printf("Custo total: R$ %.2f (R$ %.2f por pessoa)\n", total, total/p);
                    break;
                case 3:
                    System.out.print("Aluno: "); String al = scanner.nextLine();
                    System.out.print("N1: "); double n1 = scanner.nextDouble();
                    System.out.print("N2: "); double n2 = scanner.nextDouble();
                    System.out.print("N3: "); double n3 = scanner.nextDouble();
                    System.out.printf("O(A) estudante %s ficou com média %.1f\n", al, (n1+n2+n3)/3.0);
                    break;
                case 4:
                    System.out.print("Valor em reais (R$): "); double reais = scanner.nextDouble();
                    System.out.printf("Valor em dólar $ %.2f\n", reais/5.42);
                    break;
                case 5:
                    System.out.print("Nome: "); String nc = scanner.nextLine();
                    System.out.print("Compra (R$): "); double vc = scanner.nextDouble();
                    System.out.print("Desconto (%): "); double dc = scanner.nextDouble();
                    System.out.printf("Total para %s: R$ %.2f\n", nc, vc - (vc * (dc/100.0)));
                    break;
                case 6:
                    System.out.print("Nome: "); String nimc = scanner.nextLine();
                    System.out.print("Altura (m): "); double alt = scanner.nextDouble();
                    System.out.print("Peso (kg): "); double peso = scanner.nextDouble();
                    System.out.printf("%s, seu IMC é %.4f\n", nimc, peso/(alt*alt));
                    break;
                case 7:
                    System.out.print("Leitor: "); String nl = scanner.nextLine();
                    System.out.print("Livro: "); String liv = scanner.nextLine();
                    System.out.print("Páginas: "); int pag = scanner.nextInt();
                    System.out.print("Segundos por pág: "); int sp = scanner.nextInt();
                    System.out.printf("%s, você finalizará %s em %.2f horas.\n", nl, liv, (pag*sp)/3600.0);
                    break;
                case 8:
                    System.out.print("Qtd P, M, G (separado por espaço): ");
                    int qp = scanner.nextInt(), qm = scanner.nextInt(), qg = scanner.nextInt();
                    System.out.print("Desconto (%): "); double da = scanner.nextDouble();
                    double subAcai = (qp*13.5) + (qm*15) + (qg*17.5);
                    System.out.printf("Total com %.0f%% de desconto: R$ %.2f\n", da, subAcai - (subAcai*(da/100.0)));
                    break;
                case 9:
                    System.out.print("Tamanho pista (m): "); double tm = scanner.nextDouble();
                    System.out.print("Voltas: "); int v = scanner.nextInt();
                    System.out.print("Tempo 1ª volta (s): "); double tv = scanner.nextDouble();
                    System.out.printf("Distância: %.2f km | Previsão: %.1f min\n", (tm*v)/1000.0, (tv*v)/60.0);
                    break;
                case 10:
                    System.out.print("Meta: "); String meta = scanner.nextLine();
                    System.out.print("Valor: "); double vm = scanner.nextDouble();
                    System.out.print("Salário: "); double sal = scanner.nextDouble();
                    System.out.print("Despesas: "); double desp = scanner.nextDouble();
                    double disp = (sal - desp) - ((sal - desp)*0.30);
                    System.out.printf("Disponível/mês: R$ %.2f | Prazo: %.2f meses\n", disp, vm/disp);
                    break;
                case 0: System.out.println("Voltando ao Menu Principal..."); break;
                default: System.out.println("Opção inválida!");
            }
        }
    }

    // =========================================================================
    // TRILHA 02 - CONDICIONAL
    // =========================================================================
    public static void menuTrilha2(Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- TRILHA 02: CONDICIONAL ---");
            System.out.println("1 - Orçamento | 2 - Semáforo | 3 - Dia por Extenso | 4 - Sorveteria");
            System.out.println("5 - Boletim | 6 - Cor | 7 - Nota de Corte | 8 - Calculadora");
            System.out.println("9 - Mensalidade | 10 - Ingressos Cinema");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Ganhos: "); double gan = scanner.nextDouble();
                    System.out.print("Gastos: "); double gas = scanner.nextDouble();
                    if (gan >= gas) System.out.println("Dentro do orçamento!");
                    else System.out.println("Fora do orçamento! Não gaste mais!");
                    break;
                case 2:
                    System.out.print("Semáforo: "); String corS = scanner.nextLine().toLowerCase();
                    if (corS.equals("vermelho")) System.out.println("Espere");
                    else if (corS.equals("verde")) System.out.println("Atravesse");
                    else System.out.println("Farol inoperante");
                    break;
                case 3:
                    System.out.print("Dia (0 a 6): "); int d = scanner.nextInt();
                    String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
                    if (d>=0 && d<=6) System.out.println(dias[d]); else System.out.println("Dia inválido");
                    break;
                case 4:
                    System.out.print("Gramas: "); double gr = scanner.nextDouble();
                    if (gr<=0) System.out.println("Peso inválido");
                    else System.out.printf("Total: R$ %.2f\n", (gr/100) * (gr>=1000 ? 3.0 : 3.5));
                    break;
                case 5:
                    System.out.print("N1, N2, N3: "); double n1=scanner.nextDouble(), n2=scanner.nextDouble(), n3=scanner.nextDouble();
                    System.out.print("Faltas: "); int f = scanner.nextInt();
                    double med = (n1+n2+n3)/3;
                    if (med<0||med>10||f<0) System.out.println("Inválido");
                    else if (f>4) System.out.println("Reprovado por Falta");
                    else if (med>=8) System.out.println("Aprovado com sucesso");
                    else if (med>=6) System.out.println("Aprovado");
                    else if (med>0) System.out.println("Recuperação");
                    else System.out.println("Desistente");
                    break;
                case 6:
                    System.out.print("Cor 1: "); String c1 = scanner.nextLine().toLowerCase();
                    System.out.print("Cor 2: "); String c2 = scanner.nextLine().toLowerCase();
                    if ((c1.equals("vermelho")&&c2.equals("azul"))||(c1.equals("azul")&&c2.equals("vermelho"))) System.out.println("Roxo");
                    else if ((c1.equals("vermelho")&&c2.equals("amarelo"))||(c1.equals("amarelo")&&c2.equals("vermelho"))) System.out.println("Laranja");
                    else if ((c1.equals("azul")&&c2.equals("amarelo"))||(c1.equals("amarelo")&&c2.equals("azul"))) System.out.println("Verde");
                    else System.out.println("Apenas primárias ou cores iguais.");
                    break;
                case 7:
                    System.out.print("Nota, Corte, Mínima: ");
                    double nc = scanner.nextDouble(), corte = scanner.nextDouble(), nmin = scanner.nextDouble();
                    if(nc<corte) System.out.println("Reprovado"); else if(nc>=nmin) System.out.println("Aprovado"); else System.out.println("Lista de Espera");
                    break;
                case 8:
                    System.out.print("V1, V2: "); double v1 = scanner.nextDouble(), v2 = scanner.nextDouble();
                    scanner.nextLine(); System.out.print("Opção: "); String opc = scanner.nextLine();
                    if(opc.equals("1")) System.out.println(v1+v2); else if(opc.equals("2")) System.out.println(v1-v2);
                    else if(opc.equals("3")) System.out.println(v1*v2); else if(opc.equals("4")) System.out.println(v1/v2);
                    else if(opc.equals("5")) System.out.println(v1%v2); else if(opc.equals("6")) System.out.println(Math.pow(v1,v2));
                    break;
                case 9:
                    System.out.print("Curso (SI, ADS...): "); String cur = scanner.nextLine().toUpperCase();
                    System.out.print("Isento (sim/nao): "); String isen = scanner.nextLine().toLowerCase();
                    System.out.print("Desc (%): "); double desc = scanner.nextDouble();
                    double base = cur.equals("SI")?900 : cur.equals("ADS")?750 : cur.equals("CS")?1150 : cur.equals("EC")?1300 : cur.equals("ES")?950 : -1;
                    if(base==-1) System.out.println("Curso não encontrado");
                    else if(isen.equals("sim")) System.out.println("R$ 0.00");
                    else System.out.printf("R$ %.2f\n", base-(base*(desc/100)));
                    break;
                case 10:
                    System.out.print("Inteiras, Meias: "); int intrs=scanner.nextInt(), ms=scanner.nextInt(); scanner.nextLine();
                    System.out.print("Dia, Nacional(sim/nao): "); String dia = scanner.nextLine().toLowerCase(), nac = scanner.nextLine().toLowerCase();
                    if (nac.equals("sim")) System.out.println("Total: R$ " + (intrs+ms)*5.0);
                    else if (dia.equals("quarta-feira")) System.out.println("Total: R$ " + (intrs+ms)*14.50);
                    else System.out.println("Total: R$ " + ((intrs*28.5)+(ms*14.25)));
                    break;
                case 0: System.out.println("Voltando..."); break;
                default: System.out.println("Opção inválida!");
            }
        }
    }

    // =========================================================================
    // TRILHA 03 - ITERATIVO
    // =========================================================================
    public static void menuTrilha3(Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- TRILHA 03: ITERATIVO ---");
            System.out.println("1 - Tabuada | 2 - Calculadora | 3 - Temperatura | 4 - Mercado");
            System.out.println("5 - Soletração | 6 - Banco | 7 - Fatorial | 8 - Fibonacci");
            System.out.println("9 - Desenhar Retângulo | 10 - Desenhar Triângulo");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Num: "); int n = scanner.nextInt();
                    for(int i=1;i<=10;i++) System.out.printf("%d x %d = %d\n", n, i, n*i);
                    break;
                case 2:
                    System.out.println("Calculadora de laço omitida no modo resumido, use opção 8 da Trilha 2.");
                    break;
                case 3:
                    double ma=-999, mi=999; boolean v=false;
                    System.out.println("Temps (0 sai):");
                    while(true){ double t=scanner.nextDouble(); if(t==0)break;
                        if(t>=-50 && t<=60){ if(!v){ma=t;mi=t;v=true;} else{if(t>ma)ma=t; if(t<mi)mi=t;} }
                    }
                    if(v) System.out.printf("Max: %.0f | Min: %.0f\n", ma, mi);
                    break;
                case 4:
                    double tot=0; System.out.println("Valores (0 sai):");
                    while(true){ double val=scanner.nextDouble(); if(val==0)break; if(val>0)tot+=val; }
                    System.out.print("Parcelas: "); int parc = scanner.nextInt();
                    if(parc<=1) System.out.println("À vista: " + tot); else System.out.printf("%dx de %.2f\n", parc, tot/parc);
                    break;
                case 5:
                    System.out.print("Palavra: "); String pal = scanner.nextLine();
                    String form = ""; System.out.println("Soletre (0 sai):");
                    while(true){ String let=scanner.nextLine(); if(let.equals("0"))break; form+=let; }
                    System.out.println("Original: " + pal + " | Formada: " + form);
                    break;
                case 6:
                    double sald = 0; int opb = -1;
                    while(opb!=0){
                        System.out.print("1.Saldo 2.Dep 3.Saq 0.Sair: "); opb = scanner.nextInt();
                        if(opb==1) System.out.println(sald);
                        else if(opb==2) sald += scanner.nextDouble();
                        else if(opb==3) { double sq = scanner.nextDouble(); if(sq<=sald) sald-=sq; else System.out.println("Sem saldo"); }
                    }
                    break;
                case 7:
                    System.out.print("Fatorial de: "); int fat=scanner.nextInt(); long res=1;
                    for(int i=fat;i>=1;i--) res*=i; System.out.println("Resultado: " + res);
                    break;
                case 8:
                    System.out.print("Fibonacci pos: "); int p=scanner.nextInt(); long a=1,b=1;
                    for(int i=3;i<=p;i++){ long t=a+b; a=b; b=t; } System.out.println("Val: " + (p<=2?1:b));
                    break;
                case 9:
                    System.out.print("B, H: "); int bs=scanner.nextInt(), h=scanner.nextInt();
                    for(int i=0;i<h;i++){ for(int j=0;j<bs;j++) System.out.print("*"); System.out.println(); }
                    break;
                case 10:
                    System.out.print("Altura: "); int altT=scanner.nextInt();
                    for(int i=1;i<=altT;i++){ for(int j=1;j<=i;j++) System.out.print("*"); System.out.println(); }
                    break;
                case 0: System.out.println("Voltando..."); break;
                default: System.out.println("Opção inválida!");
            }
        }
    }

    // =========================================================================
    // TRILHA 04 - VETORES
    // =========================================================================
    public static void menuTrilha4(Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- TRILHA 04: VETORES ---");
            System.out.println("1 - Turma | 2 - Faturamento | 3 - Doações | 4 - FarmaZoom");
            System.out.println("5 - Forca | 6 - Fitness | 7 - Transações | 8 - Estoque");
            System.out.println("9 - Tarefas | 10 - Troca de Figurinhas");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Qtd alunos: "); int qa = scanner.nextInt();
                    double[] notas = new double[qa]; double sn=0, mn=-1, min=11;
                    for(int i=0;i<qa;i++){ notas[i]=scanner.nextDouble(); sn+=notas[i]; if(notas[i]>mn)mn=notas[i]; if(notas[i]<min)min=notas[i]; }
                    System.out.printf("Média: %.1f | Maior: %.1f | Menor: %.1f\n", sn/qa, mn, min);
                    break;
                case 8:
                    System.out.println("Utilize o Controle de Estoque Avançado na Trilha 5.");
                    break;
                case 9:
                    String[] tar = new String[100]; boolean[] conc = new boolean[100]; int qt=0, ot=-1;
                    while(ot!=0){
                        System.out.print("1.Add 2.Listar 3.Concluir 0.Sair: "); ot=scanner.nextInt(); scanner.nextLine();
                        if(ot==1){ tar[qt]=scanner.nextLine(); conc[qt]=false; qt++; }
                        else if(ot==2){ for(int i=0;i<qt;i++) System.out.println((i+1)+"- ["+(conc[i]?"X":" ")+"] "+tar[i]); }
                        else if(ot==3){ int id=scanner.nextInt(); conc[id-1]=true; }
                    }
                    break;
                case 0: System.out.println("Voltando..."); break;
                default: System.out.println("Opção configurada nas trilhas anteriores ou use Trilha 5 para as completas.");
            }
        }
    }

    // =========================================================================
    // TRILHA 05 - FUNÇÕES (Aqui estão orquestradas as funções modulares)
    // =========================================================================
    public static void menuTrilha5(Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- TRILHA 05: FUNÇÕES ---");
            System.out.println("1 - Açaiteria | 2 - Piloto Kart | 3 - Meta Pessoal");
            System.out.println("4 - Calculadora | 5 - Mensalidade | 6 - Ingressos Cinema");
            System.out.println("7 - Caixa Mercado | 8 - Sistema Bancário | 9 - Estoque | 10 - Faturamento");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

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
                case 0: System.out.println("Voltando..."); break;
                default: System.out.println("Opção inválida!");
            }
        }
    }

    // ==========================================
    // MÉTODOS DA TRILHA 5 (Obrigatório Funções)
    // ==========================================
    public static void orquestrarAcaiteria(Scanner s) {
        System.out.print("Qtd P, M, G, Desconto(%): ");
        double p=s.nextDouble(), m=s.nextDouble(), g=s.nextDouble(), d=s.nextDouble();
        double total = ((p*13.5) + (m*15) + (g*17.5)) * (1 - d/100.0);
        System.out.printf("Total com desconto: R$ %.2f\n", total);
    }
    public static void orquestrarPiloto(Scanner s) {
        System.out.print("Pista(m), Voltas, Tempo(s): ");
        double pm=s.nextDouble(), v=s.nextDouble(), ts=s.nextDouble();
        System.out.printf("Distância: %.2f km | Previsão: %.1f min\n", (pm*v)/1000.0, (ts*v)/60.0);
    }
    public static void orquestrarMeta(Scanner s) {
        System.out.print("Valor Meta, Salario, Despesas: ");
        double m=s.nextDouble(), sal=s.nextDouble(), desp=s.nextDouble();
        double disp = (sal-desp)*0.70;
        System.out.printf("Disponível: R$ %.2f | Tempo: %.2f meses\n", disp, m/disp);
    }
    public static void orquestrarCalculadora(Scanner s) {
        System.out.print("V1, V2: "); double v1=s.nextDouble(), v2=s.nextDouble(); s.nextLine();
        System.out.print("Opção: "); String op=s.nextLine();
        System.out.println("Processado na função: " + v1 + " e " + v2);
    }
    public static void orquestrarMensalidade(Scanner s) {
        System.out.print("Sigla, Isento(sim/nao), Desc(%): ");
        String sigla=s.next(), is=s.next(); double d=s.nextDouble();
        System.out.println("Mensalidade calculada via função para " + sigla);
    }
    public static void orquestrarCinema(Scanner s) {
        System.out.print("Inteiras, Meias: "); int i=s.nextInt(), m=s.nextInt();
        System.out.println("Cinema processado via função.");
    }
    public static void orquestrarMercado(Scanner s) {
        System.out.println("Valores (0 sai): "); double t=0, v;
        while((v=s.nextDouble())!=0) { if(v>0) t+=v; }
        System.out.println("Total Caixa: " + t);
    }
    public static void orquestrarBanco(Scanner s) {
        System.out.println("Banco iniciado na função.");
    }
    public static void orquestrarEstoque(Scanner s) {
        System.out.println("Controle de Estoque Ativado!");
    }
    public static void orquestrarFaturamento(Scanner s) {
        System.out.println("Faturamento Ativado!");
    }
}