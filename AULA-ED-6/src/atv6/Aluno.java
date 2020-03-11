package atv6;

public class Aluno {
	
	String nome;
	int matricula;
	String birthday;
	
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + getNome() + ", matricula=" + getMatricula() + ", birthday=" + getBirthday() + "]"+"\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	

}
