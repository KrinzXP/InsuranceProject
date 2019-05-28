import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import enumLibrary.*;

public class Asuransi {
	
	public static HashMap<Integer, Prospect> prospect;
	public static HashMap<String, Nasabah> nasabah;
	public static HashMap<String, Product> product;
	
	public static void addProspect()
	{
		prospect = new HashMap<Integer, Prospect>();
		Prospect person = new Prospect();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println("Input Nama Depan: ");
		input = scanner.nextLine().trim();
		person.setNamaDepan(input);
		
		System.out.println("Input Nama Belakang: ");
		input = scanner.nextLine().trim();
		person.setNamaBelakang(input);
		
		try 
		{
			System.out.println("Input Tanggal Lahir(dd/MM/yyyy): ");
			input = scanner.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(input, formatter);
			person.setTanggalLahir(date);
		}
		catch(Exception exceptions)
		{
			System.out.println("Harap masukkan tanggal dengan format yang benar (dd/MM/yyyy)");
		}
		
		
		System.out.println("Input Tempat Lahir: ");
		input = scanner.nextLine();
		person.setTempatLahir(input);

		System.out.println("Input Jenis Kelamin (L/P): ");
		input = scanner.nextLine();
		switch(input)
		{
			case "L":
				person.setGender(Gender.MALE);
				break;
			case "P":
				person.setGender(Gender.FEMALE);
				break;
			default:
				System.out.println("Masukkan input L/P");
		}
		
		System.out.println("Input Pekerjaan: ");
		input = scanner.nextLine();
		person.setPekerjaan(input);
		
		person.setCustomerStatus(CustomerStatus.PROSPECT);

		person.setProspectID(prospect.size());
		
		((Map<Integer, Prospect>) person).put(person.getProspectID(), person);
		
	}
	
	public static void
	
	
}
