package campeonatofutebol;
import java.util.ArrayList;
import java.util.Random;
import jogadores.Jogador;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	private int vitorias;
    private int empates;
    private int derrotas;
    private int habilidade_geral;
    private int aux_gol_jogador;
    private Random random = new Random();
    
    public Time(String nome) {
    	this.nome = nome;
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setJogador(Jogador jogador) {
    	this.jogadores.add(jogador);
    }
    
    public void GetResultados() {
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
    }
    
    public Jogador GolJogador() {
    	aux_gol_jogador = 1 + random.nextInt(4);
    	return jogadores.get(aux_gol_jogador);
    }
    
    public int GetHabilidadeGeral() {
    	for (Jogador j: jogadores) {
    		this.habilidade_geral += j.getHabilidade();
    	}
    	this.habilidade_geral = this.habilidade_geral / 5;
    	return habilidade_geral;
    }
}