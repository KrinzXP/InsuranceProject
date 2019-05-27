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
	private String manfaat;
	
	public String getNamaPolis()
	{
		return this.namaPolis;
	}
	
	public String getJenis()
	{
		return this.jenis;
	}
	
	public String getFrekuensi()
	{
		return this.frekuensi;
	}
	
	public String getManfaat()
	{
		return this.manfaat;
	}
	
	
	
	public Product(String namaPolis, String jenis, String frekuensi, String manfaat)
	{
		this.namaPolis = namaPolis;
		this.jenis = jenis;
		this.frekuensi = frekuensi;
		this.manfaat = manfaat;
	}
	
	
}
