public class Produto {
    // Atributos
    private int codigo;
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    // Get && Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Metodos
    public void imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Quantidade: " + this.quantidadeEstoque);
    }

    public void darEntrada(int qtd){
        qtd += this.quantidadeEstoque;
    }
    public void darSaida(int qtd){
        if(qtd<this.quantidadeEstoque){
            System.out.println("Voce esta sem estoque para dar saida");
            return;
        }
        qtd -=this.quantidadeEstoque;
    }
}
