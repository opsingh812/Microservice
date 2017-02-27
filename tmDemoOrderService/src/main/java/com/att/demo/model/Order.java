package com.att.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;

	private String oName;
	private String oDesc;
	private String oStatus;
	private ArrayList<String> oNotification;
	private int oId;
	
	
	
	public Order(String oName, String oDesc, String oStatus, ArrayList<String> oNotification, int oId) {
		
		this.oName = oName;
		this.oDesc = oDesc;
		this.oStatus = oStatus;
		this.oNotification = oNotification;
		this.oId = oId;
	}
	
	
	
	
	
	public Order() {
		
	}





	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoDesc() {
		return oDesc;
	}
	public void setoDesc(String oDesc) {
		this.oDesc = oDesc;
	}
	public String getoStatus() {
		return oStatus;
	}
	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}
	public ArrayList<String> getoNotification() {
		return oNotification;
	}
	public void setoNotification(ArrayList<String> oNotification) {
		this.oNotification = oNotification;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	
}
