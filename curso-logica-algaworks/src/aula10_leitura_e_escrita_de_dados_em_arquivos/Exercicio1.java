package aula10_leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<>();
		String nomeTarefa;
		int i=1;
		 while (true) {
			System.out.print("Informe tarefa "+i+" :");
			nomeTarefa = scanner.nextLine();
			if("x".equals(nomeTarefa)) {
				break;
			}else {
				linhas.add(nomeTarefa);
				i++;
			}

		}
		 scanner.close();
			Path arquivo = Paths.get
					("D:\\Doc_Meire Lopes\\Desktop\\NOVOS DOWLOADS\\Arquivo_texto.txt");
			
			Files.write(arquivo, linhas);
			
			System.out.println("FIM");

	}

}

