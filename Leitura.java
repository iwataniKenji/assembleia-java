// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {
  public String dataInput(String label) {

		System.out.println(label);
		
		String response = "";

		InputStreamReader keyboard = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(keyboard);

		try {
			response = buff.readLine();
		}
		catch (IOException exception) {
			System.out.println("\nErro de entrada de dados!");
		}

		return response;
  }
}