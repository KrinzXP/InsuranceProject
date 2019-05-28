import java.time.*;
import java.util.*;
import java.math.*;
import enumLibrary.*;

public class Nasabah extends Prospect{

	private String noKtp;
	private String statusKK;
	private PaymentMethod metodePembayaran;
	private LinkedList<Product> polis;
	
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
			String pekerjaan, CustomerStatus customerStatus, String noKtp, String statusKK, PaymentMethod metodePembayaran) {
		super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, gender, pekerjaan, customerStatus);
		// TODO Auto-generated constructor stub
		this.noKtp = noKtp;
		this.statusKK = statusKK;
		this.metodePembayaran = metodePembayaran;
	}
	
	
	
}
