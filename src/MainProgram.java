import java.util.*;
public class MainProgram {

	public static void main(String[] args) {
		// TODO implement Asuransi initialisation method
		Scanner scanner = new Scanner(System.in);
		mainMenu(scanner);
		scanner.close();
	}
	
	public static void printMainMenu()
	{
		String menu = "Vita Bona Insurance\n"
				+ "1. Menu Prospect\n"
				+ "2. Menu Customer\n"
				+ "3. Exit Application";
		System.out.println(menu);
	}
	
	public static void printMenuProspect()
	{
		String menu = "Menu Prospect\n"
				+ "1. Add Prospect\n"
				+ "2. Prospect to Customer\n"
				+ "3. Main Menu\n"
				+ "4. Exit Application";
		System.out.println(menu);
	}
	
	public static void printMenuCustomer()
	{
		String menu = "Menu Customer\n"
				+ "1. Buy Product\n"
				+ "2. Detail Policy\n"
				+ "3. Main Menu\n"
				+ "4. Exit Application";
		System.out.println(menu);
	}	
	
	public static boolean validasiInput(String input, int maxMenu)
	{
		boolean validation = false;
		try {
			int numericInput = Integer.parseInt(input);
			if(numericInput <= maxMenu && numericInput >= 1) {
				validation = true;
			} else {
				System.out.printf("Tolong masukan antara 1 - %d\n", maxMenu);
			}
		}catch(Exception exception) {
			System.out.println("Format yang anda masukan salah, coba lagi.");
		}
		return validation;
	}
	
	public static void mainMenu(Scanner scanner)
	{
		printMainMenu();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 3);
		if(validasi == false)
		{
			mainMenu(scanner);
		}
		
		switch(input)
		{
			case "1":
				menuProspect(scanner);
			case "2":
				menuCustomer(scanner);
			case "3":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
		}
		
	}
	
	public static void menuProspect(Scanner scanner)
	{
		//TODO function to printSummaryNasabah
		printMenuProspect();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 4);
		if(validasi == false)
		{
			mainMenu(scanner);
		}
		
		switch(input)
		{
			case "1":
				//TODO: Function buyProduct()
			case "2":
				//TODO: Function detailProduct()
			case "3":
				mainMenu(scanner);
			case "4":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
		}
	}
	
	public static void menuCustomer(Scanner scanner)
	{
		printMenuCustomer();
		String input = scanner.nextLine().trim();
		boolean validasi = validasiInput(input, 4);
		if(validasi == false)
		{
			mainMenu(scanner);
		}
		
		switch(input)
		{
			case "1":
				//menuProspect(scanner); TODO: Function to add a person into customer list (prospect and nasabah included)
			case "2":
				//menuCustomer(scanner); TODO: Function to flick the switch from Prospect to Nasabah
			case "3":
				mainMenu(scanner);
			case "4":
				System.exit(0);
			default:
				System.out.println("Ada Masalah Dengan Program Ini");
		}
	}
	
	public static void buyProduct()
	{
		
	}
	
	public static void detailProduct() 
	{
		
	}
}
