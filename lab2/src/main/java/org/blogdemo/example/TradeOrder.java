package org.blogdemo.example;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TradeOrder implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 804173675942189068L;
	String name; 
	 String custId; 
	 Integer vip; 
	 String stockId; 
	 Integer shares;  
	 Double cost;
	 
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public Integer getVip() {
		return vip;
	}
	public void setVip(Integer vip) {
		this.vip = vip;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public Integer getShares() {
		return shares;
	}
	public void setShares(Integer shares) {
		this.shares = shares;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "TradeOrder [name=" + name + ", custId=" + custId + ", vip=" + vip + ", stockId=" + stockId + ", shares="
				+ shares + ", cost=" + cost + "]";
	}
	 
	 
	 
}
