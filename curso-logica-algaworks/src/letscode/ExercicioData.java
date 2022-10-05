package letscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExercicioData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Meire";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		Locale brasil =new Locale("pt", "Brasil");
		 LocalDate hoje = LocalDate.now();
		 System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		 String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		 String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		if(agora.getHour() >=0 && agora.getHour() < 12) {
			saudacao = "bom dia!";
		}else if(agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "boa tarde!";
			
		} else if (agora.getHour() >=18 && agora.getHour() <24){
			saudacao = "boa noite!";
		} else {
			saudacao = "olá!";
		}
			System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase() );
;	}

}
