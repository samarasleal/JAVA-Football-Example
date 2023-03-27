package jogadores;

public class JogadorGoleiro extends Jogador {
    private int reflexo;
    private float altura;
    
    public JogadorGoleiro(String nome, int idade, int habilidade, int camisa, int reflexo, float altura) {
        super(nome, idade, habilidade, camisa);
        this.reflexo = reflexo;
        this.altura = altura;
    }

    public int getReflexos() {
        return reflexo;
    }

    public void setReflexos(int reflexo) {
        this.reflexo = reflexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getHabilidade() {
    	this.habilidade =  ((habilidade*5) + (((int)(altura*100))*2) + (reflexo*3))/10;
    	if (this.habilidade > 100)
    		this.habilidade = 100;
    	else if (this.habilidade < 0)
    		this.habilidade = 0;
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
}
