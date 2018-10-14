
public class Conexao<E> {
	double valor;
	No<E> no;
	
	public Conexao(No<E> no) {
		this.no = no;
		valor = 0;
	}
	
	public Conexao(No<E> no, Double valor) {
		this.no = no;
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return no.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return arg0.hashCode() == this.hashCode();
	}
}
