public class Pessoa {
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    // Atributos
    private int idPessoa;
    private String nome;
    private String email;
    private Carro carro;

    @Override
    public String toString() {
        return "ID DO CLIENTE: " + idPessoa + "\n" +
                "NOME: " + nome + "\n" +
                "E-MAIL: " + email + "\n" +
                "CARRO: " + carro + "\n";
    }
}
