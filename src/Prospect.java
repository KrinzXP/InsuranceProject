import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import enumLibrary.*;

public class Prospect extends Customer {
	protected static CustomerStatus customerStatus;
	protected static Integer prospectID;
	
	public CustomerStatus getCustomerStatus()
	{
		return this.customerStatus;
	}
	
	public static void setCustomerStatus(CustomerStatus customerStatus)
	{
		customerStatus = customerStatus;
	}
	
	public Integer getProspectID()
	{
		return prospectID;
	}
	
	public void setProspectID(Integer prospectID)
	{
		this.prospectID = prospectID;
	}
	
	
	
	
	public Prospect(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender gender,
			String pekerjaan, int prospectID,CustomerStatus customerStatus) {
		super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, gender, pekerjaan);
		
		this.customerStatus = customerStatus;
		this.prospectID = prospectID;
	}
	
	public Prospect() {
		// TODO Auto-generated constructor stub
	}

//	public LinkedList<Customer> addProspect()
//	{
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		Prospect person = new Prospect();
//		LinkedList<Customer> listProspect = new LinkedList<Customer>();
//		
//		System.out.println("Input Nama Depan: ");
//		input = scanner.nextLine().trim();
//		person.setNamaDepan(input);
//		
//		System.out.println("Input Nama Belakang: ");
//		input = scanner.nextLine().trim();
//		person.setNamaBelakang(input);
//		
//		try 
//		{
//			System.out.println("Input Tanggal Lahir(dd/MM/yyyy): ");
//			input = scanner.nextLine();
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			LocalDate date = LocalDate.parse(input, formatter);
//			person.setTanggalLahir(date);
//		}
//		catch(Exception exceptions)
//		{
//			System.out.println("Harap masukkan tanggal dengan format yang benar (dd/MM/yyyy)");
//		}
//		
//		
//		System.out.println("Input Tempat Lahir: ");
//		input = scanner.nextLine();
//		person.setTempatLahir(input);
//
//		System.out.println("Input Jenis Kelamin (L/P): ");
//		input = scanner.nextLine();
//		switch(input)
//		{
//			case "L":
//				person.setGender(Gender.MALE);
//				break;
//			case "P":
//				person.setGender(Gender.FEMALE);
//				break;
//			default:
//				System.out.println("Masukkan input L/P");
//		}
//		
//		System.out.println("Input Pekerjaan: ");
//		input = scanner.nextLine();
//		person.setPekerjaan(input);
//		
//		person.setCustomerStatus(CustomerStatus.PROSPECT);
//		
//		listProspect.add(listProspect.size(), person);
//		
//		return listProspect;
//	}
	
	public static long getAge()
	{
		long age = ChronoUnit.YEARS.between(tanggalLahir, LocalDate.now());
		return age;
	}
	
	public static String birthSummary()
	{
		String birthSummary = String.format("%s (%s tahun)", tanggalLahir, getAge());
		return birthSummary;
	}
	
	public static String printSummary()
	{
		String summary = String.format("No: %d, %s %s, %s, %s, %s, %s", 
				prospectID, namaDepan, namaBelakang, birthSummary(), gender ,pekerjaan, customerStatus);
		return summary;
	}
	
	public static void switchProspectStatus()
	{
		setCustomerStatus(CustomerStatus.NASABAH);
	}


	
}
