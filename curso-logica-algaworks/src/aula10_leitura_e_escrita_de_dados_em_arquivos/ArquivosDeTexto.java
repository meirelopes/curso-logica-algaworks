package aula10_leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ArquivosDeTexto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> linhas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o nome ["+i+"]: ");
			String nome = scanner.nextLine();
			linhas.add(nome);
		}
		 scanner.close();
		Path arquivo = Paths.get
				("D:\\Doc_Meire Lopes\\Desktop\\NOVOS DOWLOADS\\Arquivo_texto.txt");
		
		Files.write(arquivo, linhas);
		
		System.out.println("FIM");

	}

}
