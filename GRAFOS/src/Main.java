
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<>();
		No<String> a = grafo.inserirNo(new No<>("a"));
		No<String> b = grafo.inserirNo(new No<>("b"));
		No<String> c = grafo.inserirNo(new No<>("c"));
		No<String> d = grafo.inserirNo(new No<>("d"));
		No<String> e = grafo.inserirNo(new No<>("e"));
		No<String> f = grafo.inserirNo(new No<>("f"));
		No<String> g = grafo.inserirNo(new No<>("g"));
		No<String> h = grafo.inserirNo(new No<>("h"));
		No<String> i = grafo.inserirNo(new No<>("i"));


		a.conectarEspelho(b, 5);
		a.conectarEspelho(c, 10);

		b.conectarEspelho(c, 5);
		b.conectarEspelho(d, 3);

		c.conectarEspelho(d, 1);
		c.conectarEspelho(e, 4);
		
		d.conectarEspelho(e, 7);
		d.conectarEspelho(f, 3);

		e.conectarEspelho(f, 3);
		e.conectarEspelho(g, 8);
		e.conectarEspelho(i, 1);
		
		f.conectarEspelho(i, 10);
		f.conectarEspelho(h, 4);
		
		g.conectarEspelho(i, 2);	

		h.conectarEspelho(i, 5);

		ArrayList<Grafo<String>.CaminhoDijkstra> caminhos = grafo.dijkstraComDestino(c, i);

		for (@SuppressWarnings("rawtypes") Grafo.CaminhoDijkstra caminho: caminhos) {
			System.out.println(caminho.no.valor+"\t"+caminho.valor+"\t"+caminho.caminho.valor);
		}


	}

}
