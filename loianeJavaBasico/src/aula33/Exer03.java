package aula33;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno: ");
		aluno.setNome(scan.next());
		
		System.out.println("Entre com o nome do curso: ");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Entre com a matrícula: ");
		aluno.setMatricula(scan.next());
		
		
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina: ");
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina " +aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
				System.out.println("Entre com a " + (j+1) + "° nota " );
				aluno.setNotaPosIJ(i, j, scan.nextDouble()); 
			}
		}
		aluno.mostraInfo();
		
		System.out.println("Informe o indice da disciplina: ");
		int indice = scan.nextInt();
		
		aluno.obterMedia(indice-1);
		if(aluno.verificarAprovado(indice - 1)){
			System.out.println("Aluno APROVADO na discipla "+ aluno.getNomeDisciplinas()[indice-1]);
		}else{
			System.out.println("Aluno REPROVADO na discipla "+ aluno.getNomeDisciplinas()[indice-1]);
		}
	}

}
