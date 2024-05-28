package br.com.br.poo4;

public class Livro implements Publicação {

		private String titulo;
		private String autor;	
		private Integer totPaginas;
		private Integer pagAtual;
		private boolean aberto;
		private Pessoa nome;
		
		
		
		
		public Livro(String titulo, String autor, Integer totPaginas, Pessoa nome) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.totPaginas = totPaginas;
			this.aberto = false;
			this.pagAtual = 0;
			this.nome = nome;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public Integer getTotPaginas() {
			return totPaginas;
		}


		public void setTotPaginas(Integer totPaginas) {
			this.totPaginas = totPaginas;
		}


		public Integer getPagAtual() {
			return pagAtual;
		}


		public void setPagAtual(Integer pagAtual) {
			this.pagAtual = pagAtual;
		}


		public boolean isAberto() {
			return aberto;
		}


		public void setAberto(boolean aberto) {
			this.aberto = aberto;
		}


		public Pessoa getNome() {
			return nome;
		}


		public void setNome(Pessoa nome) {
			this.nome = nome;
		}



		public Livro() {
			
		this.setPagAtual(0);
		this.setAberto(false);		
			
		}
		
		
		


		
		public String detalhes() {
			return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual="
					+ pagAtual + "\n, aberto=" + aberto + "\n, nome=" + nome.getNome() + "]";
		}


		@Override
		public void abrir() {
			
			this.setAberto(true);
			
		}


		@Override
		public void fechar() {
			
			this.setAberto(false);
		}


		@Override
		public void folhear(int p) {
		if(p > getTotPaginas()) {
			this.setPagAtual(0);
		}
		
			if(isAberto()) {
			this.setPagAtual(this.getPagAtual() + p);
			
		}else {
			System.out.println("o livro nao esta aberto");
		}

		}
			

		@Override
		public void avançarPag() {
			
			if(isAberto()) {
				
				this.setPagAtual(this.getPagAtual() + 1);
				
			}
			else {
				System.out.println("o livro nao esta aberto");
			}
			
		}


		@Override
		public void voltarPag() {
			
			if(isAberto()) {
				
				this.setPagAtual(this.getPagAtual() - 1 );
				
			}
			else {
				System.out.println("o livro nao esta aberto");
			}
			
			
		}
		
		
		
		
		
}
