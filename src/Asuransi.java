import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import enumLibrary.*;
import java.math.*;

public class Asuransi {
	
	private static HashMap<Integer, Prospect> prospect;
	private static HashMap<String, Nasabah> nasabah;
	private static HashMap<String, Product> product;
	private static Gender gender;
	
	
	public static void setProduct()
	{
		product = new HashMap<String, Product>();
		Product sehatBersama = new Product("Sehat Bersama", "Kesehatan", "Bulanan", new BigDecimal(200000), new BigDecimal(400000),
				"Claim perawatan kelas 1");
		
		Product sehatExtra = new Product("Sehat Extra", "Kesehatan", "Bulanan", new BigDecimal(300000), new BigDecimal(500000),
				"Claim perawatan kelas VIP");
		
		Product lifeKeluarga = new Product("Life Keluarga", "Jiwa", "Bulanan", new BigDecimal(250000), new BigDecimal(450000),
				"Mendapatkan 500.000.000 apabila terjadi sesuatu dengan tertanggung");
		
		Product lifeSpecial = new Product("Life Special", "Jiwa", "Tahunan", new BigDecimal(3600000), new BigDecimal(4800000),
				"Mendapatkan 800.000.000 apabila terjadi sesuatu pada tertanggung.");
		
		Product protection = new Product("Protection", "Kendaraan", "Tahunan", null, new BigDecimal(2000000),
				"Mendapat ganti rugi sampai 100.000.000 bila terjadi sesuatu.");
		
		Product protectionPlus = new Product("Protection Plus", "Kendaraan", "Tahunan", null, new BigDecimal(2500000),
				"Mendapat ganti rugi total lost apa bila terjadi sesuatu.");
		
		product.put("SB", sehatBersama);
		product.put("SX", sehatExtra);
		product.put("LK", lifeKeluarga);
		product.put("LS", lifeSpecial);
		product.put("PR", protection);
		product.put("PRP", protectionPlus);
	}
	
	
//	public void printAllProspect()
//	{
//		for(Prospect prospects : prospect.values())
//		{
//			Prospect.printSummary();
//		}
//		
//	}
	
	
	
	public static void addProspect()
	{
		prospect = new HashMap<Integer, Prospect>();
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Input Nama Depan: ");
		input = scanner.nextLine().trim();
		String namaDepan = input;
		
		System.out.println("Input Nama Belakang: ");
		input = scanner.nextLine().trim();
		String namaBelakang = input;
		
		
		System.out.println("Input Tanggal Lahir(dd/MM/yyyy): ");
		input = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(input, formatter);
		
		System.out.println("Input Tempat Lahir: ");
		input = scanner.nextLine();
		String tempatLahir = input;

		System.out.println("Input Jenis Kelamin (L/P): ");
		input = scanner.nextLine();
		if(input.equals("L"))
		{
			Gender gender = Gender.MALE;
		}
		else if (input.equals("P"))
		{
			Gender gender = Gender.FEMALE;
		}
		
		
		
		System.out.println("Input Pekerjaan: ");
		input = scanner.nextLine();
		String pekerjaan = input;
		
		CustomerStatus customerStatus = CustomerStatus.PROSPECT;
		
		int prospectID = prospect.size();
		
		
		Prospect person = new Prospect();
		
		person.setNamaDepan(namaDepan);
		person.setNamaBelakang(namaBelakang);
		person.setTanggalLahir(date);
		person.setTempatLahir(tempatLahir);
		person.setGender(gender);
		person.setPekerjaan(pekerjaan);
		person.setProspectID(prospectID + 1);
		person.setCustomerStatus(customerStatus);
		
		prospect.put(0, person);
		System.out.println(prospectID);
		//printAllProspect();
		
	}
	
	
	
	public static void addNasabah()
	{
		System.out.println("Ketik nomor prospect  yang ingin dijadikan nasabah: ");
		System.out.println("NomorKTP: ");
		System.out.println("StatusKK");
		System.out.println("Payment Method(CC/AC/VP");
	}
	
	
//	public void printAllNasabah(HashMap)
//	{
//		
//		for(Nasabah nasabah : nasabah.values())
//			{
//				Nasabah.printSummary();
//			}
//			
//		
//	}
	
	
}
