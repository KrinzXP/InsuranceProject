import java.time.LocalDate;
import enumLibrary.*;

public class Prospect extends Customer {
	protected CustomerStatus customerStatus;
	
	public CustomerStatus getCustomerStatus()
	{
		return this.customerStatus;
	}
	
	public void setCustomerStatus(CustomerStatus customerStatus)
	{
		this.customerStatus = customerStatus;
	}
	
	
	
	
	public Prospect(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, String gender,
			String pekerjaan, CustomerStatus customerStatus) {
		super(namaDepan, namaBelakang, tanggalLahir, tempatLahir, gender, pekerjaan);
		
		this.customerStatus = customerStatus;
	}

	
}
