package cursojava.executavel;


import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;
import cursojava.classes.aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno = é uma instancia (crição de um objeto)*/
		/*aluno1 = (uma variavel) que precisa de uma referencia do objeto (aluno)*/
		
		/*=============================================================================================================================*/
		
		List<aluno> alunos = new ArrayList<>();                                    /*criando a lista aluno*/
		
		for (int qtd =1; qtd <=2; qtd ++) {
		
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? "+qtd+" ? ");
		/*String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento ?");
		String RegistroGeral = JOptionPane.showInputDialog("Qual o seu RG ?");
		String NumeroCpf = JOptionPane.showInputDialog("Qual o seu CPF ?");
		String NomeMae = JOptionPane.showInputDialog("Qual o nome da sua mãe ?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome da sua pai");
		String DataMatricula = JOptionPane.showInputDialog("Quando se matriculou?");
		String nomeEscola = JOptionPane.showInputDialog("Nome onde estuda ?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual é a sua serie ?");*/
		
		
		/*set = inserir dados  */
		 /* get = retornar dados*/
		
		aluno aluno1 = new aluno(); 
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(SerieMatriculado);*/
		
		for (int pos = 1; pos <=4; pos ++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Desejar remover alguma disciplina");
		
		if (escolha == 0) {
		
			int continuaRemover = 0;
			int posicao = 1;
				while ( continuaRemover == 0) {
				
					String DisciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(DisciplinaRemover).intValue()- posicao);
					posicao ++;
				continuaRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina ?");
				}
		
			}

		alunos.add(aluno1);             /* adicionando aluno na lista*/
		}
		
		for (aluno aluno : alunos) {       /*comando (foreach) para percorrer a lista*/
			
			
			if(aluno.getNome().equalsIgnoreCase("Gui")) {							/*procurar um nome na lista*/
					alunos.remove(aluno);											/*remover da lista*/		
					break;
			}
					
					else {
			System.out.println(aluno); /* Descrição do objeto na memoria*/
			System.out.println("Media do aluno é : " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
			
					}
		}
			for (aluno aluno : alunos) {
				System.out.println("Aluno que sobraram da lista");
				System.out.println(aluno.getNome());
				System.out.println("sua materias são ");
				
				for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
				}
			}
		}
		

		
		
	}

		
	
	

	
	



		
	
	
