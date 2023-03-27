package jogadores;

public class JogadorAtacante extends Jogador {
    private int velocidade;
    private int tecnica;

    public JogadorAtacante(String nome, int idade, int habilidade, int camisa, int velocidade, int tecnica) {
        super(nome, idade, habilidade, camisa);
        super.gols = 0;
        this.velocidade = velocidade;
        this.tecnica = tecnica;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getTecnica() {
        return tecnica;
    }

    public void setTecnica(int tecnica) {
        this.tecnica = tecnica;
    }

    public int getHabilidade() {
    	this.habilidade = ((habilidade*5) + (velocidade*2) + (tecnica*3) )/10;
    	if (this.habilidade > 100)
    		this.habilidade = 100;
    	else if (this.habilidade < 0)
    		this.habilidade = 0;
        return habilidade;
    }
    
    public int getGols() {
    	return gols;
    }
}