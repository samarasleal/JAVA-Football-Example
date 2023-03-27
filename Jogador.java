package jogadores;
import java.util.Random;

public class Jogador {
	protected String nome;
	protected int idade;
	protected int habilidade;
	protected int camisa;
	protected int gols = 0;
	Random random = new Random();

    public Jogador(String nome, int idade, int habilidade, int camisa) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.camisa = camisa;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
    
   public void somaGol(){
       this.gols = gols+1; 
   }
}
