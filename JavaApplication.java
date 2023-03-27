package campeonatofutebol;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import jogadores.JogadorAtacante;
import jogadores.JogadorDefensor;
import jogadores.JogadorGoleiro;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        String nome;
        int idade;
        int habilidade;
        int camisa;
        int reflexo;
        float altura;
        int cobertura;
        int desarme;
        int velocidade;
        int tecnica;
        float aux;
        
        System.out.println("CAMPEONATO DE FUTEBOL\nNOME DO TIME DA CASA: ");
        nome = entrada.next();
        Time t1 = new Time(nome);
        System.out.println("\nPreencha as informaÁıes dos jogadores do " + nome + "\nGOLEIRO");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nAltura (m): ");
        altura = entrada.nextFloat();
        System.out.println("\nReflexo (0-100): ");
        reflexo = entrada.nextInt();
        JogadorGoleiro CG1 = new JogadorGoleiro(nome, idade, habilidade, camisa, reflexo, altura);
        t1.setJogador(CG1);
        System.out.println("Jogador cadastrado! Habilidade = " + CG1.getHabilidade());

        System.out.println("\n\nDEFENSOR 1:");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nCobertura (0-100): ");
        cobertura = entrada.nextInt();
        System.out.println("\nDesarme (0-100): ");
        desarme = entrada.nextInt();
        JogadorDefensor CD1 = new JogadorDefensor(nome, idade, habilidade, camisa, cobertura, desarme);
        t1.setJogador(CD1);
        System.out.println("Jogador cadastrado! Habilidade = " + CD1.getHabilidade());

        System.out.println("\n\nDEFENSOR 2:");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nCobertura (0-100): ");
        cobertura = entrada.nextInt();
        System.out.println("\nDesarme (0-100): ");
        desarme = entrada.nextInt();
        JogadorDefensor CD2 = new JogadorDefensor(nome, idade, habilidade, camisa, cobertura, desarme);
        t1.setJogador(CD2);
        System.out.println("Jogador cadastrado! Habilidade = " + CD2.getHabilidade());

        System.out.println("\n\nATACANTE 1: ");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nVelocidade (0-100): ");
        velocidade = entrada.nextInt();
        System.out.println("\nTÈcnica (0-100): ");
        tecnica = entrada.nextInt();
        JogadorAtacante CA1 = new JogadorAtacante(nome, idade, habilidade, camisa, velocidade, tecnica);
        t1.setJogador(CA1);
        System.out.println("Jogador cadastrado! Habilidade = " + CA1.getHabilidade());

        System.out.println("\n\nATACANTE 2: ");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nVelocidade (0-100): ");
        velocidade = entrada.nextInt();
        System.out.println("\nTÈcnica (0-100): ");
        tecnica = entrada.nextInt();
        JogadorAtacante CA2 = new JogadorAtacante(nome, idade, habilidade, camisa, velocidade, tecnica);
        t1.setJogador(CA2);
        System.out.println("Jogador cadastrado! Habilidade = " + CA2.getHabilidade());
        
        System.out.println("O " + t1.getNome().toUpperCase() + " EST¡ DEFINIDO PARA A PARTIDA! HABILIDADE GERAL: " + t1.GetHabilidadeGeral() + "\n\n\nNOME DO TIME VISITANTE: ");
        nome = entrada.next();
        Time t2 = new Time(nome);
        System.out.println("\nPreencha as informaÁıes dos jogadores do " + nome + "\nGOLEIRO");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nAltura (m): ");
        altura = entrada.nextFloat();
        System.out.println("\nReflexo (0-100): ");
        reflexo = entrada.nextInt();
        JogadorGoleiro VG1 = new JogadorGoleiro(nome, idade, habilidade, camisa, reflexo, altura);
        t2.setJogador(VG1);
        System.out.println("Jogador cadastrado! Habilidade = " + VG1.getHabilidade());

        System.out.println("\n\nDEFENSOR 1:");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nCobertura (0-100): ");
        cobertura = entrada.nextInt();
        System.out.println("\nDesarme (0-100): ");
        desarme = entrada.nextInt();
        JogadorDefensor VD1 = new JogadorDefensor(nome, idade, habilidade, camisa, cobertura, desarme);
        t2.setJogador(VD1);
        System.out.println("Jogador cadastrado! Habilidade = " + VD1.getHabilidade());

        System.out.println("\n\nDEFENSOR 2:");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nCobertura (0-100): ");
        cobertura = entrada.nextInt();
        System.out.println("\nDesarme (0-100): ");
        desarme = entrada.nextInt();
        JogadorDefensor VD2 = new JogadorDefensor(nome, idade, habilidade, camisa, cobertura, desarme);
        t2.setJogador(VD2);
        System.out.println("Jogador cadastrado! Habilidade = " + VD2.getHabilidade());

        System.out.println("\n\nATACANTE 1: ");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nVelocidade (0-100): ");
        velocidade = entrada.nextInt();
        System.out.println("\nTÈcnica (0-100): ");
        tecnica = entrada.nextInt();
        JogadorAtacante VA1 = new JogadorAtacante(nome, idade, habilidade, camisa, velocidade, tecnica);
        t2.setJogador(VA1);
        System.out.println("Jogador cadastrado! Habilidade = " + VA1.getHabilidade());

        System.out.println("\n\nATACANTE 2: ");
        System.out.println("Nome: ");
        nome = entrada.next();
        System.out.println("\nIdade: ");
        idade = entrada.nextInt();
        System.out.println("\nHabilidade (0-100): ");
        habilidade = entrada.nextInt();
        System.out.println("\nCamisa: ");
        camisa = entrada.nextInt();
        System.out.println("\nVelocidade (0-100): ");
        velocidade = entrada.nextInt();
        System.out.println("\nTÈcnica (0-100): ");
        tecnica = entrada.nextInt();
        JogadorAtacante VA2 = new JogadorAtacante(nome, idade, habilidade, camisa, velocidade, tecnica);
        t2.setJogador(VA2);
        System.out.println("Jogador cadastrado! Habilidade = " + VA2.getHabilidade());
        
        System.out.println("O " + t2.getNome().toUpperCase() + " EST¡ DEFINIDO PARA A PARTIDA! HABILIDADE GERAL: " + t2.GetHabilidadeGeral());
        
        System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n");

        System.out.println("\nPARTIDA DE IDA\nESCALA«√O COMPLETA DO TIME DA CASA");
        System.out.println("Goleiro: " + CG1.getNome() + "\nHabilidade: " + CG1.getHabilidade() + "\nCamisa: " + CG1.getCamisa() + "\n");
        System.out.println("Defensor: " + CD1.getNome() + "\nHabilidade: " + CD1.getHabilidade() + "\nCamisa: " + CD1.getCamisa() + "\nGols: " + CD1.getGols() + "\n");
        System.out.println("Defensor: " + CD2.getNome() + "\nHabilidade: " + CD2.getHabilidade() + "\nCamisa: " + CD2.getCamisa() + "\nGols: " + CD2.getGols() + "\n");
        System.out.println("Atacante: " + CA1.getNome() + "\nHabilidade: " + CA1.getHabilidade() + "\nCamisa: " + CA1.getCamisa() + "\nGols: " + CA1.getGols() + "\n");
        System.out.println("Atacante: " + CA2.getNome() + "\nHabilidade: " + CA2.getHabilidade() + "\nCamisa: " + CA2.getCamisa() + "\nGols: " + CA2.getGols() + "\n");
        
        System.out.println("\nESCALA«√O COMPLETA DO TIME VISITANTE");
        System.out.println("Goleiro: " + VG1.getNome() + "\nHabilidade: " + VG1.getHabilidade() + "\nCamisa: " + VG1.getCamisa() + "\n");
        System.out.println("Defensor: " + VD1.getNome() + "\nHabilidade: " + VD1.getHabilidade() + "\nCamisa: " + VD1.getCamisa() + "\nGols: " + VD1.getGols() + "\n");
        System.out.println("Defensor: " + VD2.getNome() + "\nHabilidade: " + VD2.getHabilidade() + "\nCamisa: " + VD2.getCamisa() + "\nGols: " + VD2.getGols() + "\n");
        System.out.println("Atacante: " + VA1.getNome() + "\nHabilidade: " + VA1.getHabilidade() + "\nCamisa: " + VA1.getCamisa() + "\nGols: " + VA1.getGols() + "\n");
        System.out.println("Atacante: " + VA2.getNome() + "\nHabilidade: " + VA2.getHabilidade() + "\nCamisa: " + VA2.getCamisa() + "\nGols: " + VA2.getGols() + "\n");

        Calendar calendario = Calendar.getInstance();
        Date date = new Date();
		calendario.setTime(date);
        Partida ida = new Partida(t1, t2, date);
        
        //PROBABILIDADE DE GOL DE TIME
        for (int i = 0; i < 6; i++) { //O JOGO POSSUI 6 MOMENTOS DE PROBABILIDADE DE GOL DURANTE UMA PARTIDA
        	aux = random.nextFloat();
        	if (aux <= ida.ProbabilidadeCasa(t1, t2)){ //EXEMPLO: PROBABILIDADE CASA = 0.6 > QUALQUER N⁄MERO GERADO ENTRE 0 E 0.6 ACRESCENTAR¡ UM GOL AO TIME DA CASA
        		t1.GolJogador().somaGol();
        		ida.GolCasa();
        	}
        	else if (aux > ida.ProbabilidadeCasa(t1, t2) && aux < 0.8) { // SEGUINDO O EXEMPLO, UM NUMERO ENTRE 0.6 E 0.8 ACRESCENTAR¡ UM GOL AO TIME VISITANTE (20% DE CHANCE DE GOL A CADA MOMENTO DE 15M DO JOGO)
        		t2.GolJogador().somaGol();
        		ida.GolVisitante();
        	}
        	else if (aux > 0.8) // A CADA 15M DE JOGO, H¡ SEMPRE 20% DE CHANCE DE NENHUM DOS TIMES FAZER GOL
        		continue;
        }
        
        
        System.out.println("\n----- Resultado da partida de ida-----");
        ida.GetPlacar();
        System.out.println("GOLS ACUMULADOS JOGADORES " + t1.getNome().toUpperCase() + ": \n" + CD1.getNome().toUpperCase() + " " + CD1.getGols() + " gols");
        System.out.println(CD2.getNome().toUpperCase() + " " + CD2.getGols() + " gols");
        System.out.println(CA1.getNome().toUpperCase() + " " + CA1.getGols() + " gols");
        System.out.println(CA2.getNome().toUpperCase() + " " + CA2.getGols() + " gols");
        System.out.println("\nGOLS ACUMULADOS JOGADORES " + t2.getNome().toUpperCase() + ": \n" + VD1.getNome().toUpperCase() + " " + VD1.getGols() + " gols");
        System.out.println(VD2.getNome().toUpperCase() + " " + VD2.getGols() + " gols");
        System.out.println(VA1.getNome().toUpperCase() + " " + VA1.getGols() + " gols");
        System.out.println(VA2.getNome().toUpperCase() + " " + VA2.getGols() + " gols");

        System.out.println("\n ----- Tabela do Campeonato -----");
        System.out.println(t1.getNome());
        t1.GetResultados();
        System.out.println("\n" + t2.getNome());
        t2.GetResultados();
        
        System.out.println("\n ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n");
        
        System.out.println("PARTIDA DE VOLTA\nESCALA«√O COMPLETA DO TIME DA CASA");
        System.out.println("Goleiro: " + VG1.getNome() + "\nHabilidade: " + VG1.getHabilidade() + "\nCamisa: " + VG1.getCamisa() + "\n");
        System.out.println("Defensor: " + VD1.getNome() + "\nHabilidade: " + VD1.getHabilidade() + "\nCamisa: " + VD1.getCamisa() + "\nGols: " + VD1.getGols() + "\n");
        System.out.println("Defensor: " + VD2.getNome() + "\nHabilidade: " + VD2.getHabilidade() + "\nCamisa: " + VD2.getCamisa() + "\nGols: " + VD2.getGols() + "\n");
        System.out.println("Atacante: " + VA1.getNome() + "\nHabilidade: " + VA1.getHabilidade() + "\nCamisa: " + VA1.getCamisa() + "\nGols: " + VA1.getGols() + "\n");
        System.out.println("Atacante: " + VA2.getNome() + "\nHabilidade: " + VA2.getHabilidade() + "\nCamisa: " + VA2.getCamisa() + "\nGols: " + VA2.getGols() + "\n");
        
        System.out.println("\nESCALA«√O COMPLETA DO TIME VISITANTE");
        System.out.println("Goleiro: " + CG1.getNome() + "\nHabilidade: " + CG1.getHabilidade() + "\nCamisa: " + CG1.getCamisa() + "\n");
        System.out.println("Defensor: " + CD1.getNome() + "\nHabilidade: " + CD1.getHabilidade() + "\nCamisa: " + CD1.getCamisa() + "\nGols: " + CD1.getGols() + "\n");
        System.out.println("Defensor: " + CD2.getNome() + "\nHabilidade: " + CD2.getHabilidade() + "\nCamisa: " + CD2.getCamisa() + "\nGols: " + CD2.getGols() + "\n");
        System.out.println("Atacante: " + CA1.getNome() + "\nHabilidade: " + CA1.getHabilidade() + "\nCamisa: " + CA1.getCamisa() + "\nGols: " + CA1.getGols() + "\n");
        System.out.println("Atacante: " + CA2.getNome() + "\nHabilidade: " + CA2.getHabilidade() + "\nCamisa: " + CA2.getCamisa() + "\nGols: " + CA2.getGols() + "\n");
        
        Partida volta = new Partida(t2, t1, date); //TIME VISITANTE NA PARTIDA DE VOLTA … INSTANCIADO PRIMEIRO POIS AGORA EST¡ EM CASA
        
      //PROBABILIDADE DE GOL DE TIME
        for (int i = 0; i < 6; i++) { //O JOGO POSSUI 6 MOMENTOS DE PROBABILIDADE DE GOL DURANTE UMA PARTIDA
        	aux = random.nextFloat();
        	if (aux <= volta.ProbabilidadeCasa(t2, t1)){ //EXEMPLO: PROBABILIDADE CASA = 0.6 > QUALQUER N⁄MERO GERADO ENTRE 0 E 0.6 ACRESCENTAR¡ UM GOL AO TIME DA CASA
        		t2.GolJogador().somaGol();
        		volta.GolCasa();
        	}
        	else if (aux > volta.ProbabilidadeCasa(t2, t1) && aux < 0.8) { // SEGUINDO O EXEMPLO, UM NUMERO ENTRE 0.6 E 0.8 ACRESCENTAR¡ UM GOL AO TIME VISITANTE (20% DE CHANCE DE GOL A CADA MOMENTO DE 15M DO JOGO)
        		t1.GolJogador().somaGol();
        		volta.GolVisitante();
        	}
        	else if (aux > 0.8) // A CADA 15M DE JOGO, H¡ SEMPRE 20% DE CHANCE DE NENHUM DOS TIMES FAZER GOL
        		continue;
        }
        
        
        System.out.println("\n----- Resultado da partida de volta-----");
        volta.GetPlacar();
        System.out.println("GOLS ACUMULADOS JOGADORES " + t2.getNome().toUpperCase() + ": \n" + VD1.getNome().toUpperCase() + " " + VD1.getGols() + " gols");
        System.out.println(VD2.getNome().toUpperCase() + " " + VD2.getGols() + " gols");
        System.out.println(VA1.getNome().toUpperCase() + " " + VA1.getGols() + " gols");
        System.out.println(VA2.getNome().toUpperCase() + " " + VA2.getGols() + " gols");
        System.out.println("\nGOLS ACUMULADOS JOGADORES " + t1.getNome().toUpperCase() + ": \n" + CD1.getNome().toUpperCase() + " " + CD1.getGols() + " gols");
        System.out.println(CD2.getNome().toUpperCase() + " " + CD2.getGols() + " gols");
        System.out.println(CA1.getNome().toUpperCase() + " " + CA1.getGols() + " gols");
        System.out.println(CA2.getNome().toUpperCase() + " " + CA2.getGols() + " gols");

        System.out.println("\n ----- Tabela do Campeonato -----");
        System.out.println(t1.getNome());
        t1.GetResultados();
        System.out.println("\n" + t2.getNome());
        t2.GetResultados();
    }

}
