package entities;

public class Pessoa {
	private String name;
	private Integer idade;
	private Double salary;
	
	public void nothing() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setIdade(Integer idade) {
			this.idade = idade;	
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setSalary(Double salary) {
		if(salary == null) {
			this.salary = (double) 0;
		}else {
			this.salary = salary;
		};
	}
	
	public String toString() {
		return "Meu nome é: " 
				+ name
				+ " e tenho "
				+ idade
				+ " anos"
				+ ", sendo meu salário R$ "
				+ String.format("%.2f", salary);
	}
}
