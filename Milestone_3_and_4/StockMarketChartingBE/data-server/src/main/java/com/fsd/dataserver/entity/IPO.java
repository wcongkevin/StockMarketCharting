package com.fsd.dataserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "IPO")
public class IPO {

	/**
	 * 1.5. IPOs planned: 1. id 2. Company Name 3. Stock Exchange 4. Price per share
	 * 5. Total number of Shares 6. Open Date Time 7. Remarks
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "companyname")
	private String companyname;

	@Column(name = "stockexchange")
	private String stockexchange;

	@Column(name = "price")
	private float price;

	@Column(name = "totalnumber")
	private long totalnumber;

	@Column(name = "opendate")
	private Date opendate;

	@Column(name = "remarks")
	private String remarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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

	public float getTotalnumber() {
		return totalnumber;
	}

	public void setTotalnumber(long totalnumber) {
		this.totalnumber = totalnumber;
	}

	public Date getOpendate() {
		return opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
