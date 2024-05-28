package br.com.br.poo4;

public class Main {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("pedro", 22, "M");
		p[1] = new Pessoa("marta", 25,"F");
		
		l[0] = new Livro("Rei da rua", "desconhecido", 150, p[0]);
		l[1] = new Livro("Segre Da Casa Amarela", "desconhecido", 125, p[1]);		
		l[2] = new Livro("Pequeno Principe", "desconhecido", 110, p[0]);		
				
		l[0].abrir();
		l[0].folhear(35);
		System.out.println(l[0].detalhes());		
	}

}
