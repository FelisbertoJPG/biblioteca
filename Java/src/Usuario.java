public class Usuario {
    private String nome;
    private int idade;
    private Locacao locacao;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    //revisar o pq de ser assim
    //TODO: SEMPRE VOID, pois só altera um valor
    public void setIdade(int idade){
    //TODO: SERVE PRA INICIALIZAR: this.idade é 0 e recebe o valor passado dentro dos parametros
        this.idade = idade;
    }
    //pega inteiro pq a variavel é do tipo INT
    //TODO: TIPO VARIA DE ACORDO COM A VARIAVEL
    //TODO: TRABALHO DELE É APENAS RETORNAR
    public int getIdade(){
        return idade;
    }

}
