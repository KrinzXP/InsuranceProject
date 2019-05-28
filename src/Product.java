import java.util.*;
import java.math.*;
import java.text.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import enumLibrary.*;

import enumLibrary.*;
public class Product {
	private String namaPolis;
	private String jenis;
	private String frekuensi;
	private BigDecimal iuranDuaPuluhKebawah;
	private BigDecimal iuranAtasDuaPuluh;
	private String manfaat;
	
	public String getNamaPolis()
	{
		return this.namaPolis;
	}
	
	public String getJenis()
	{
		return this.jenis;
	}
	
	public BigDecimal getIuranDuaPuluhKebawah() {
		return iuranDuaPuluhKebawah;
	}

	public void setIuranDuaPuluhKebawah(BigDecimal iuranDuaPuluhKebawah) {
		this.iuranDuaPuluhKebawah = iuranDuaPuluhKebawah;
	}

	public BigDecimal getIuranAtasDuaPuluh() {
		return iuranAtasDuaPuluh;
	}

	public void setIuranAtasDuaPuluh(BigDecimal iuranAtasDuaPuluh) {
		this.iuranAtasDuaPuluh = iuranAtasDuaPuluh;
	}
	
	
	public String getFrekuensi()
	{
		return this.frekuensi;
	}
	
	public String getManfaat()
	{
		return this.manfaat;
	}
	
	
	
	public Product(String namaPolis, String jenis, String frekuensi, BigDecimal iuranDuaPuluhKebawah, BigDecimal iuranAtasDuaPuluh, String manfaat)
	{
		this.namaPolis = namaPolis;
		this.jenis = jenis;
		this.frekuensi = frekuensi;
		this.iuranDuaPuluhKebawah = iuranDuaPuluhKebawah;
		this.iuranAtasDuaPuluh = iuranAtasDuaPuluh;
		this.manfaat = manfaat;
	}
	
	


	
	

	
	
	
}
