import java.util.Scanner;

public class ProdutoTeste {
    private static ProdutoTeste teste = new ProdutoTeste();
    private static Produto produto = new Produto();
    public Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println();
            System.out.println("MENU:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Registrar Entrada");
            System.out.println("4. Registrar Saida");
            System.out.println("5. Valor em Reais do Produto");
            System.out.println("9. FIm");
            System.out.println("Escolha uma opcao:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Cadastrar
                    teste.execCadastrar();
                    break;
                case 2: // Consultar
                    teste.execConsultar();
                    break;
                case 3: // Registrar Entrada
                    teste.execRegistrarEntrada();
                    break;
                case 4: // Registrar Saida
                    teste.execRegistrarSaida();
                    break;
                case 5: // Valor em Reais
                    int valorEmReais = (int) (produto.getValor() * produto.getQuantidadeEstoque());
                    System.out.println("Valor em Reais: " + valorEmReais);
                    break;
                case 9:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 9);
    }

    public void execCadastrar() {
        if(produto.getCodigo() != 0){
            System.out.println("Nao!");
            return;
        }
        System.out.println("Digite o codigo do produto:");
        produto.setCodigo(sc.nextInt());
        System.out.println("Entre com a descricao do produto:");
        produto.setDescricao(sc.nextLine());
        System.out.println("Entre com o valor do produto:");
        produto.setValor(sc.nextInt());
        System.out.println("Entre com a quantidade do produto:");
        produto.setQuantidadeEstoque(sc.nextInt());
    }

    public void execConsultar() {
        produto.imprimir();
    }

    public void execRegistrarEntrada() {
        System.out.println("Quantidade de entrada de produtos:");
        int valorDeEntrada = sc.nextInt();
        produto.darEntrada(valorDeEntrada);
    }

    public void execRegistrarSaida() {
        System.out.println("Quantidade de saida de produtos:");
        int valorDeSaida = sc.nextInt();
        produto.darSaida(valorDeSaida);
    }
}