package com.fsd.dataserver.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK")
public class Stock {

//		1.4.	Stock Price details Excel:
//		1.	Company Code – to which Company this Stock Price Info belongs to
//		2.	Stock Exchange – the Stock Price of the Company in this Stock Exchange 
//		3.	Current Price – Stock Price
//		4.	Date – Date of the Stock Price
//		5.	Time – Stock Price at this Specific time
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "stockcode")
	private String stockcode;

	@Column(name = "companycode")
	private String companycode;

	@Column(name = "stockexchange")
	private String stockexchange;

	@Column(name = "price")
	private float price;

	@Column(name = "date")
	private Date date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockcode() {
		return stockcode;
	}

	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}

	public String getCompanycode() {
		return companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
