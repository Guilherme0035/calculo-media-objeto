package cursojava.executavel;


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
		String nota1 = JOptionPane.showInputDialog("Digite a sua primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Digite s sua segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite a sua terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite a sua quarta nota: ");

		
		
		
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
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
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
		
		/*======================================================================================================================================*/
		
	}
	
}