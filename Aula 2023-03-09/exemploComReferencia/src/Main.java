public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pessoa p1 = new Pessoa();
        p1.idPessoa = 1;
        p1.nome = "Maria";
        System.out.println(p1);
        meuNome(p1);
        System.out.println(p1);

        Pessoa p2 = new Pessoa();
        p2.idPessoa = 2;
        p2.
    }

    public static void meuNome(Pessoa x){       // Quando objeto, por padrão estamos falando de referência
        x.idPessoa = 10;
        x.nome = "Tereza";
        System.out.println(x);
    }
}