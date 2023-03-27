package jogadores;

public class JogadorDefensor extends Jogador {
    private int cobertura;
    private int desarme;

    public JogadorDefensor(String nome, int idade, int habilidade, int camisa, int cobertura, int desarme) {
        super(nome, idade, habilidade, camisa);
        super.gols = 0;
        this.cobertura = cobertura;
        this.desarme = desarme;
    }

    public int getCobertura() {
        return cobertura;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    public int getDesarme() {
        return desarme;
    }

    public void setDesarme(int desarme) {
        this.desarme = desarme;
    }

    public int getHabilidade() {
    	this.habilidade =  ((habilidade*5) + (cobertura*3) + (desarme*2) )/10;
    	if (this.habilidade > 100)
    		this.habilidade = 100;
    	else if (this.habilidade < 0)
    		this.habilidade = 0;
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    } 
    
    public int getGols() {
    	return gols;
    }
}
