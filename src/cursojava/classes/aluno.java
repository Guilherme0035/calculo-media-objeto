package cursojava.classes;

import java.util.Objects;

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
	
	private Disciplina disciplina = new Disciplina();
		
		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	
	
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

	
				/*metodo retorna media do aluno*/
		public double getMediaNota() {
			return (disciplina.getNota1() + disciplina.getNota2() 
			+ disciplina.getNota3() + disciplina.getNota4() ) /4;
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
			
		@Override
		public String toString() {
			return "aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplina + "]";
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

		@Override
		public int hashCode() {
			return Objects.hash(nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			aluno other = (aluno) obj;
			return Objects.equals(nome, other.nome);
		}

		
		}




		
		
		

					
		



