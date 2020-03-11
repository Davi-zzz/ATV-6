package atv6;

import java.util.*;

public class Exercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int controle = 0;

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		while (controle != 5) {
			System.out.println("|=======1=======CADASTRO DE ALUNOS===========|");
			System.out.println("|=======2======PESQUISAR POR ALUNOS==========|");
			System.out.println("|=======3========REMOVER CADASTRO============|");
			System.out.println("|=======4==========LISTAR TODOS==============|");
			System.out.println("|=======5==============SAIR==================|");
			controle = scan.nextInt();
			switch (controle) {
			case 1: {
				Aluno b = new Aluno();
				alunos.add(cadastrar(b));
				System.out.println(alunos.size());
				break;
			}
			case 2: {
				search(alunos);
				break;
			}
			case 3: {
				eraser(alunos);
				break;
			}
			case 4: {
				System.out.println(alunos.toString());
				break;
			}
			case 5: {
				System.out.println("BoN VoYaGe!!!");
			}
			}

		}
	}

	public static Aluno cadastrar(Aluno a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o nome do aluno: ");
		a.setNome(scan.next());
		System.out.println("digite a matricula do aluno: ");
		a.setMatricula(scan.nextInt());
		System.out.println("digite a data de nascimento do aluno: ");
		a.setBirthday(scan.next());
		System.out.println(a.getNome() + "|" + a.matricula + "|" + a.birthday);
		return a;
	}

	public static int search(ArrayList<Aluno> b) {
		System.out.println("digite a matrícula do aluno que quer procurar: ");
		Scanner scan = new Scanner(System.in);
		int compare = scan.nextInt();
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).getMatricula() == compare) {
				System.out.println(b.get(i));
			}
		}
		
		return compare;
	}

	public static ArrayList<Aluno> eraser(ArrayList<Aluno> b) {
		System.out.println("digite a matricula do aluno que deseja apagar: ");
		Scanner scan = new Scanner(System.in);
		int ref = scan.nextInt();

		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).getMatricula() == ref) {
				b.remove(i);
				
				return b;
			}
		}
		
		return b;
	}
}
