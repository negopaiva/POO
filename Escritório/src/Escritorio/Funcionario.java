package Escritorio;

public abstract class Funcionario {
	
	private String nome;
	private int matricula;
	protected double salario_base; 
	

	public Funcionario(String nome, int matricula, double salario_base) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public  int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", salario_base=" + salario_base + "]";
	}
	
	

	abstract double CalculaSalario(); 
	
	

}
