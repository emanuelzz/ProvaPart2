import java.util.ArrayList;
import java.util.List;

public class Valores implements ValoresITF {
	public List<Integer> ValorInt = new ArrayList<Integer>();

	@Override
	// insere um valor; 
	// retorna true se o valor pode ser inserido;
	
	public boolean ins(int v) {
		if (ValorInt.size() < 10 && v > 0) {
			ValorInt.add(v);
			return true;
		} else {
			return false;
		}
	}


	@Override
	// remove/retorna valor de indice i;
	
	public int del(int v) {
		int i = 0, retornaValor = 0;
		if (ValorInt.size() == 0) {
			return -1;
		} else {
			for (int b : ValorInt) {
				if (v == b) {
					retornaValor = ValorInt.get(i);
					ValorInt.remove(i);
					break;
				}
				i++;
			}
			return retornaValor;
		}
	}

	@Override
	// retorna quantidade valores armazenados;
	
	public int size() {
		return ValorInt.size();
	}

	@Override
	// média dos valores armazenados;
	
	public double mean() {
		if (ValorInt.size() == 0) {
			return 0;
		} else {
			int somaValor = 0;
			int quantidade = ValorInt.size();
			for (Integer A : ValorInt) {
				somaValor += A;
			}
			return somaValor / quantidade;
		}
	}


	@Override
	// maior valor armazenado;
	
	public int greater() {
		if (ValorInt.size() == 0) {
			return -1;
		} else {
			int maiorValor = ValorInt.get(0);
			for (Integer A : ValorInt) {
				if (A > maiorValor) {
					maiorValor = A;
				}
			}
			return maiorValor;
		}
	}

	@Override
	// o menor valor armazenado;
	
	public int lower() {
		if (ValorInt.size() == 0) {
			return -1;
		} else {
			int menorValor = ValorInt.get(0);
			for (Integer A : ValorInt) {
				if (A < menorValor) {
					menorValor = A;
				}
			}
			return menorValor;
		}
	}

}
