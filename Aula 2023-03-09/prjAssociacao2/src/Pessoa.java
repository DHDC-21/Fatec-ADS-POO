import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }


    // Atributos
    private int idPessoa;
    private String nomePessoa;
    private String email;
    private List<Carro> carros = new ArrayList<>(); // criar lista dinamica



    @Override
    public String toString() {
        return  "ID da Pessoa: " + idPessoa + "\n" +
                "Nome: " + nomePessoa + "\n" +
                "E-mail: " + email + "\n\n" +
                "CARROS: \n" + carros;
    }
}
