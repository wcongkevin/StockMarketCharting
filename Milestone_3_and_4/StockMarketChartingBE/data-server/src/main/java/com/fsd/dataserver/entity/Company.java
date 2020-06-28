package com.fsd.dataserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "COMPANY")
public class Company {
//		1.3.	Company related Data Fields:
//		1.	Company Name
//		2.	Turnover
//		3.	CEO
//		4.	Board of Directors
//		5.	Listed in Stock Exchanges
//		6.	Sector
//		7.	Brief writeup, about companies Services/Product, etc…
//		8.	Stock code in each Stock Exchange

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "turnover")
	private float turnover;

	@Column(name = "CEO")
	private String CEO;

	@Column(name = "director")
	private String director;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = StockExchange.class)
	@JoinColumn(name = "stockexchangeid", referencedColumnName = "id", nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private StockExchange stockexchange;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Sector.class)
	@JoinColumn(name = "sectorsid", referencedColumnName = "id", nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Sector sectors;

	@Column(name = "brief")
	private String brief;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Sector.class)
	@JoinColumn(name = "stockid", referencedColumnName = "id", nullable = false, updatable = false)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Stock stock;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTurnover() {
		return turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String CEO) {
		this.CEO = CEO;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public StockExchange getStockExchange() {
		return stockexchange;
	}

	public void setStockExchange(StockExchange stockexchange) {
		this.stockexchange = stockexchange;
	}

	public Sector getSectors() {
		return sectors;
	}

	public void setSectors(Sector sectors) {
		this.sectors = sectors;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
}
