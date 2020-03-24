package com.lirunhao.beans;

public class Type {
	//实体类
	private Integer tid;
	private String cname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Type(Integer tid, String cname) {
		super();
		this.tid = tid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", cname=" + cname + "]";
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
