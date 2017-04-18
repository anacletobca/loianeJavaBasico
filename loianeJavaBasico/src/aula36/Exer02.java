package aula36;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso: ");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horario do curso: ");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.println("Entre com o departamento do professor: ");
		String depProf = scan.nextLine();
		
		System.out.println("Entre com o email do professor: ");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("----Alunos----");
		System.out.println("Informe quantos alunos serão cadastrados: ");
		
		int qntAlunos = scan.nextInt();
		
		Aluno[] alunos = new Aluno[qntAlunos];
		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println("Entre com o nome do aluno "+(i+1)+" :");
			String nomeAluno = scan.nextLine();
			System.out.println("Entre com a matricula: ");
			String matAluno = scan.nextLine();
			
			double [] notasAluno = new double[4];
			
			for (int j = 0; j < notasAluno.length; j++) {
				System.out.println("Entre com a " +(j+1)+"º nota: ");
				notasAluno[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notasAluno);
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		System.out.println(curso.obterInfo());
	}

}
