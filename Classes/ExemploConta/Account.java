public class Account
{
	private String name;		//variável de instância da classe
	
	//método construtor da classe Account
	public Account(String name)
	{
		setName(name);
	}
	//método de recuperação da variável de nome
	public String getName()
	{
		return this.name;
	}

	//método de definição da variável de nome
	public void setName(String name)
	{
		this.name = name;
	}
}