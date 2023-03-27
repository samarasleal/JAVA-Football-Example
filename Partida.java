package campeonatofutebol;
import java.util.Date;
import java.util.Random;
import jogadores.Jogador;

public class Partida {
    private Date data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;
    Random random = new Random();
    private float aux;

    public Partida(Time timeCasa, Time timeVisitante, Date data) {
    	this.timeCasa = timeCasa;
    	this.timeVisitante = timeVisitante;
    	this.data = data;
    	this.placarCasa = 0;
    	this.placarVisitante = 0;
	}
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(int placarCasa) {
        this.placarCasa = placarCasa;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }
    
    public void GolCasa()  {
        this.placarCasa++;
    }

    public void GolVisitante() {
        this.placarVisitante++;
    }
    
    public String GetPlacar()  {
        System.out.println("\n" + timeCasa.getNome()+ " " + placarCasa + " x " + placarVisitante + " " + timeVisitante.getNome()+"\n");
        
        if(placarCasa > placarVisitante){
			this.timeCasa.setVitorias(this.timeCasa.getVitorias()+1);
			this.timeVisitante.setDerrotas(this.timeVisitante.getDerrotas()+1);
		}
		
		else if(placarVisitante > placarCasa){ 
			this.timeVisitante.setVitorias(this.timeVisitante.getVitorias()+1);
			this.timeCasa.setDerrotas(this.timeCasa.getDerrotas()+1);		
		}

		else if (placarVisitante == placarCasa) { 
			this.timeVisitante.setEmpates(this.timeVisitante.getEmpates()+1);
			this.timeCasa.setEmpates(this.timeCasa.getEmpates()+1);
		}
        
        return null;
    }
    
    //M…TODO QUE D¡ UMA PROBABILIDADE MAIOR DE VITORIA PARA O TIME COM MELHOR HABILIDADE GERAL (UM TIME COM 10 HABILIDADES A MAIS TEM 20% MAIS CHANCE DE FAZER UM GOL
    public float ProbabilidadeCasa(Time tc, Time tv) {
    	aux = tc.GetHabilidadeGeral() - tv.GetHabilidadeGeral();
    	aux = aux / 100; //DIFEREN«A DE PROBABILIDADE PARA MARCAR GOL (UM N⁄MERO SER¡ GERADO ENTRE 0 E 1. EM UM CONFRONTO DE DOIS TIMES DE IGUAL FOR«A, UM N⁄MERO GERADO ENTRE 0 E 0.4 AUMENTA UM GOL PARA O TIME DA CASA; 0.4 E 0.8, TIME VISITANTE; 0.8 E 1, NENHUM DOS DOIS TIMES FAZ GOL.
    	if (aux < -0.4) //O AUX N√O PODE SER MENOR DO QUE -0.4 POIS O MENOR N⁄MERO GERADO NA MAIN PELO RANDOM … 0.
    		aux = (float)-0.4;	
    	else if (aux > 0.4) //O AUX N√O PODE SER MAIOR DO QUE 0.4 POIS O MAIOR N⁄MERO GERADO NA MAIN PELO RANDOM PARA UM GOL … 0.8.
    		aux = (float) 0.4;
    	aux = (float)0.4 + aux;
    	return aux;
    }
}
