public class GerenciarEstacionamento {
    public static void main(String[] args) {
        System.out.println("Gerenciamento de Estacionamento:");
        System.out.println();

        Pessoa p = new Pessoa();
        p.setIdPessoa(1);
        p.setNome("Joao Vitor");
        p.setEmail("joaovitor@gmail.com");

        Carro c = new Carro();
        c.setIdCarro(1);
        c.setMarca("Honda");
        c.setModelo("Civic");

        p.setCarro(c);

        System.out.println(p);
    }
}