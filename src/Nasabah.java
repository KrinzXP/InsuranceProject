import java.time.LocalDate;

import enumLibrary.*;

public class Nasabah extends Prospect{

	private String noKtp;
	private String statusKK;
	private PaymentMethod metodePembayaran;
	
	public String getNoKTP()
	{
		return this.noKtp;
	}
	
	public void setNoKTP(String noKtp)
	{
		this.noKtp = noKtp;
	}
	
	public Nasabah(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, String gender,
			String pekerjaan, CustomerStatus customerStatus, String noKtp, String statusKK, PaymentMethod metodePembayaran) {
		super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, gender, pekerjaan, customerStatus);
		// TODO Auto-generated constructor stub
		this.noKtp = noKtp;
		this.statusKK = statusKK;
		this.metodePembayaran = metodePembayaran;
	}
	
	
	
}
