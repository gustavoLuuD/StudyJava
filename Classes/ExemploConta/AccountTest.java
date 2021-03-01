import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("Arnold Shwarzenegger");
		Account account2 = new Account("Bruce Willis");

		System.out.println("Current account1 name: " + account1.getName());
		System.out.println("Current account2 name: " + account2.getName());
	}
}//fim da classe Account test