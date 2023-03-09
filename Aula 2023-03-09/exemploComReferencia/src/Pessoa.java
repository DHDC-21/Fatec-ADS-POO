public class Pessoa {
    public int idPessoa;
    public String nome;

    @Override
    public String toString() {
        return """\
Pessoa{
    idPessoa=$idPessoa, 
    nome='$nome'
}"""
    }
}