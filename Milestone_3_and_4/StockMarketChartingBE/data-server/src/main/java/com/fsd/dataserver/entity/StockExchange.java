package com.fsd.dataserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stockexchange")
public class StockExchange {
	/**
	 * 1.8. Stock Exchange Data Fields: 1. Id 2. Stock Exchange 3. Brief 4. Contact
	 * Address 5. Remarks
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "stockexchange")
	private String stockexchange;

	@Column(name = "brief")
	private String brief;

	@Column(name = "contactaddress")
	private String contactaddress;

	@Column(name = "remarks")
	private String remarks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactaddress() {
		return contactaddress;
	}

	public void setType(String contactaddress) {
		this.contactaddress = contactaddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
