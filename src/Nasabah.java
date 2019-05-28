import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.math.*;
import enumLibrary.*;

public class Nasabah extends Prospect{

	private String idNasabah;
	private String noKtp;
	private String statusKK;
	private PaymentMethod metodePembayaran;
	private LinkedList<Product> polis;
	private LinkedList<Kendaraan> kendaraan;
	
	public String getNoKTP()
	{
		return this.noKtp;
	}
	
	public void setNoKTP(String noKtp)
	{
		this.noKtp = noKtp;
	}
	
	public String getStatusKK()
	{
		return this.statusKK;
	}
	
	public void setStatusKK(String statusKK)
	{
		this.statusKK = statusKK;
	}
	
	public PaymentMethod getMetodePembayaran()
	{
		return this.metodePembayaran;
	}
	
	public void setMetodePembayaran(PaymentMethod metodePembayaran)
	{
		this.metodePembayaran = metodePembayaran;
	}
	
	public Nasabah(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender gender,
			String pekerjaan, CustomerStatus customerStatus, String idNasabah,String noKtp, String statusKK, PaymentMethod metodePembayaran,
			LinkedList<Product> polis, LinkedList<Kendaraan> kendaraan) {
		super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, gender, pekerjaan, prospectID, customerStatus);
		// TODO Auto-generated constructor stub
		this.noKtp = noKtp;
		this.statusKK = statusKK;
		this.metodePembayaran = metodePembayaran;
	}
	
	public String getIDNasabah()
	{
		LocalDate now = LocalDate.now();
		String idNasabah = String.format("%d/%d/%d", now.getMonth(), now.getYear(), prospectID);
		return idNasabah;
	}
	
	public String printSummaryNasabah()
	{
		
		String formatNasabah = String.format("No: %s, %s %s, %s, %s, %s, %s, %s ", 
				getIDNasabah(), namaDepan, namaBelakang, birthSummary(),pekerjaan,noKtp,statusKK,metodePembayaran);
		return formatNasabah;
	}
	
//	public BigDecimal cekIuran()
//	{
//		//check age
//		long age = ChronoUnit.YEARS.between(tanggalLahir, LocalDate.now());
//		
//			if age > 20 actualIuran = iuranDuaPuluhKebawah
//			if age < 20 actuaalIuran = iuranAtasDuaPuluh
//		return actualIuran;
//	}
	
	/*
	 * Cek age untuk kendaraan
	 * if < 20 cannot get policy
	 */
	
}
