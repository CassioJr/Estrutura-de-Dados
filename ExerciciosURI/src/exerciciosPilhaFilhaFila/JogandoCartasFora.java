package exerciciosPilhaFilhaFila;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class JogandoCartasFora {
	
	    public static void main(String[] args) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int topo, cartas,qtdCartas;
			String[] baralho = new String[50];

			for (int i = 0; i < 50; i++) {
				StringBuilder saida = new StringBuilder();
				cartas = i + 1;
				ArrayList<Integer> pilha = new ArrayList<Integer>();
				for (int x = 0; x < cartas; x++) {
					pilha.add(x + 1);
				}

				saida.append("Discarded cards: ");

				topo = 0;
				while (cartas > 1) {
					if (topo > 0) {
						saida.append(", ");
					}
					saida.append(String.valueOf(pilha.get(topo)));
					topo++;
					cartas--;
					int carta = pilha.get(topo);
					pilha.add(carta);
					topo++;
				}

				saida.append("\nRemaining card: " + pilha.get(topo) + "\n");

				baralho[i] = saida.toString();

			}

			 qtdCartas = leitor(br);

			while (qtdCartas != 0) {
				bw.write(baralho[qtdCartas - 1]);
				qtdCartas = leitor(br);
			}

			bw.flush();
			bw.close();
		}

		static int leitor(BufferedReader br) throws IOException {
			int n;
			int resp = 0;
			int index = 1;
			while (true) {
				n = br.read();
				if (n >= '0' && n <= '9') {
					break;
				} else if (n == '-') {
					index = -1;
				} else if (n == '+') {
					index = 1;
				}
			}
			while (true) {
				resp = resp * 10 + n - '0';
				n = br.read();
				if (n < '0' || n > '9') {
					break;
				}
			}

			return resp * index;
		}
	}