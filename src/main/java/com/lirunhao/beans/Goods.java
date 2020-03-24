package com.lirunhao.beans;

public class Goods {
	//实体类
	private Integer id;
	private String name;
	private String datea;
	private Integer tid;
	private Integer price;
	private String status;
	private String cname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Goods(Integer id, String name, String datea, Integer tid, Integer price, String status, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.tid = tid;
		this.price = price;
		this.status = status;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", datea=" + datea + ", tid=" + tid + ", price=" + price
				+ ", status=" + status + ", cname=" + cname + "]";
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
