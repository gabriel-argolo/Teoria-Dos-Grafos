import java.util.ArrayList;
import java.util.Collections;

public class No <E>{
	ArrayList<Conexao<E>> ligadoA;
	E valor;
	boolean visitado;
	
	No (E valor) {
		ligadoA = new ArrayList<>();
		this.valor = valor;
	}
	
	void conectarA(No<E> no) {
		ligadoA.add(new Conexao<E>(no));
	}
	
	void conectarEspelho(No<E> no) {
		conectarA(no);
		no.conectarA(this);
	}

	void conectarA(No<E> no, double valor) {
		ligadoA.add(new Conexao<E>(no, valor));
	}
	
	void conectarEspelho(No<E> no, double valor) {
		conectarA(no, valor);
		no.conectarA(this, valor);
	}
	
	void remover(No<E> no) {
		ligadoA.removeAll(Collections.singleton(new Conexao<E>(no)));
	}
}
