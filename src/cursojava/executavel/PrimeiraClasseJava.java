package cursojava.executavel;


import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import cursojava.classes.aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/*new aluno = é uma instancia (crição de um objeto)*/
		/*aluno1 = (uma variavel) que precisa de uma referencia do objeto (aluno)*/
		
		/*=============================================================================================================================*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento ?");
		String RegistroGeral = JOptionPane.showInputDialog("Qual o seu RG ?");
		String NumeroCpf = JOptionPane.showInputDialog("Qual o seu CPF ?");
		String NomeMae = JOptionPane.showInputDialog("Qual o nome da sua mãe ?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome da sua pai");
		String DataMatricula = JOptionPane.showInputDialog("Quando se matriculou?");
		String nomeEscola = JOptionPane.showInputDialog("Nome onde estuda ?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual é a sua serie ?");
		
		String disciplina1 = JOptionPane.showInputDialog("Nome da disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Digite a sua primeira nota: ");
		
		String disciplina2 = JOptionPane.showInputDialog("Nome da disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Digite s sua segunda nota: ");
		
		String disciplina3 = JOptionPane.showInputDialog("Nome da disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Digite a sua terceira nota: ");
		
		String disciplina4 = JOptionPane.showInputDialog("Nome da disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Digite a sua quarta nota: ");

		
		/*set = inserir dados  */
		 /* get = retornar dados*/
		
		
		
		aluno aluno1 = new aluno(); //Joao// 
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(SerieMatriculado);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplin31(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println("Nome do primeiro aluno é " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos" + " e nasceu em " + aluno1.getDataNascimento());
		System.out.println("seu RG é: " + aluno1.getRegistroGeral());
		System.out.println("Numero do seu CPF é: " + aluno1.getNumeroCpf());
		System.out.println("Nome da sua mãe é: " + aluno1.getNomeMae());
		System.out.println("Nome do seu pai é: " + aluno1.getNomePai());
		System.out.println("Data da sua matricula: " + aluno1.getDataMatricula());
		System.out.println("Nome onde estuda: " + aluno1.getNomeEscola());
		System.out.println("Está matriculado na " + aluno1.getSerieMatriculado()+ " serie ");
		System.out.println("E sua média foi de: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		
		
		
		 /* metodo toString*/
		
		
		/*System.out.println(aluno1.toString()); /* Descrição do objeto na memoria*/
		/*System.out.println("Media do aluno é : " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2()); */
		
	
		/*metodo "Equals e Hashcode" (Diferenciar e comparar objetos*/
		/*não ativado são diferentes.. ativado são iguais*/
		/*Obs.. nomes podem ser iguais, mas CPF não*/
		
		
		
		/*aluno aluno1 = new aluno();
		aluno1.setNome("Gui");

		
		aluno aluno2 = new aluno();
		aluno2.setNome("Gui");
		
		
			if(aluno1.equals(aluno2)){
				System.out.println("Aluno são iguais");
			}
			else {
				System.out.println("Alunos não são iguais"); */
			}
	}

		
	
	
