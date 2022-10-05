package aula10_leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivoDeTexto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path arquivo = Paths.get
				("D:\\Doc_Meire Lopes\\Desktop\\NOVOS DOWLOADS\\Arquivo_texto.txt");
		
		List<String>linhas =Files.readAllLines(arquivo);
		for (int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			System.out.println("Tarefa "+i+": "+nome);
		}

	}

}
