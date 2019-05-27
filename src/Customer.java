import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

import enumLibrary.*;

public class Customer {
	protected String namaDepan;
	protected String namaBelakang;
	protected LocalDate tanggalLahir;
	protected String tempatLahir;
	protected String gender;
	protected String pekerjaan;
	
	public String getNamaDepan()
	{
		return this.namaDepan;
	}
	public String getNamaBelakang()
	{
		return this.namaBelakang;
	}
	
	public LocalDate getTanggalLahir()
	{
		return this.tanggalLahir;
	}
	
	public String getTempatLahir()
	{
		return this.tempatLahir;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	
	public String getPekerjaan()
	{
		return this.pekerjaan;
	}
	
	public Customer(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, String gender, String pekerjaan)
	{
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		this.tanggalLahir = tanggalLahir;
		this.tempatLahir = tempatLahir;
		this.gender = gender;
		this.pekerjaan = pekerjaan;
	}
	
	public long getAge()
	{
		long age = ChronoUnit.YEARS.between(this.tanggalLahir, LocalDate.now());
		return age;
	}
	
	
	
}
