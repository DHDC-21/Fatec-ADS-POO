public class GerenciarEstacionamento {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Carro c1, c2;

        c1 = new Carro();
        c1.setIdCarro(1);
        c1.setModelo("Civic");
        c1.setMarca("Honda");

        c2 = new Carro();
        c2.setIdCarro(2);
        c2.setModelo("Toro Sport");
        c2.setMarca("Fiat");

        Pessoa p = new Pessoa();
        p.setIdPessoa(1);
        p.setNomePessoa("João Vitor");
        p.setEmail("joao.vitor@gmail.com");

    }
}