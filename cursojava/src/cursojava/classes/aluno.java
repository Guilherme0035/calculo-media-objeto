package cursojava.classes;

public class aluno {

	/*esses são os atributos do aluno*/
	public String nome;
	public int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public aluno() { // Criando os dados na memoria//	
	}
	
	public aluno (String nomePadrao) {
		nome = nomePadrao;
}
		
	public aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	
	}
		/*metodo SETTERS e GETTERS*/
		/* SET adicionar ou receber dados para os atributos*/
		/* GET é para resgatar ou obter o valor do atributo*/
		  
	
		/*receber dados*/ 
		/* void = apenas recebe*/
		public void setNome (String nome) {
			this.nome = nome;
		}
		
		/*retornar dados*/
		
		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int i) {
			this.idade = i;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public double getNota3() {
			return nota3;
		}

		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}

		public double getNota4() {
			return nota4;
		}

		public void setNota4(double nota4) {
			this.nota4 = nota4;
		}
		
				/*metodo media do aluno*/
		public double getMediaNota() {
			return (nota1 + nota2 + nota3 + nota4) /4;
		}
		
		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();
				if(media >=70) {
					return true;
					}
				else {
					return false;
		}
}
			
		public String getAlunoAprovado2() {
			double media = this.getMediaNota();
				if(media>=70) {
					return "Aluno Aprovado";
					}
				else {
					return "Aluno reprovado";
		}
				
	}
		
}
					
		



