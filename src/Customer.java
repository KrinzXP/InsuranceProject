import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

import enumLibrary.*;

public class Customer {
	protected static String namaDepan;
	protected static String namaBelakang;
	protected static LocalDate tanggalLahir;
	protected static String tempatLahir;
	protected static Gender gender;
	protected static String pekerjaan;
	
	public String getNamaDepan()
	{
		return this.namaDepan;
	}
	
	public void setNamaDepan(String namaDepan)
	{
		this.namaDepan = namaDepan;
	}
	
	
	public String getNamaBelakang()
	{
		return this.namaBelakang;
	}
	
	public void setNamaBelakang(String namaBelakang)
	{
		this.namaBelakang = namaBelakang;
	}
	
	public LocalDate getTanggalLahir()
	{
		return this.tanggalLahir;
	}
	
	public void setTanggalLahir(LocalDate tanggalLahir)
	{
		this.tanggalLahir = tanggalLahir;
	}
	
	public String getTempatLahir()
	{
		return this.tempatLahir;
	}
	
	public void setTempatLahir(String tempatLahir)
	{
		this.tempatLahir = tempatLahir;
	}
	
	public Gender getGender()
	{
		return this.gender;
	}
	
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	
	public String getPekerjaan()
	{
		return this.pekerjaan;
	}
	
	public void setPekerjaan(String pekerjaan)
	{
		this.pekerjaan = pekerjaan;
	}
	
	public Customer(String namaDepan, String namaBelakang, LocalDate tanggalLahir, String tempatLahir, Gender gender, String pekerjaan)
	{
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		this.tanggalLahir = tanggalLahir;
		this.tempatLahir = tempatLahir;
		this.gender = gender;
		this.pekerjaan = pekerjaan;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
//	public long getAge()
//	{
//		long age = ChronoUnit.YEARS.between(this.tanggalLahir, LocalDate.now());
//		return age;
//	}
	
	
	
}
