/**
 * 
 */
package com.iht.fbs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author User
 *
 */
@Entity
@Table(name = "Discount")
@Data
public class Discount implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "discount_id")
	private Long discountId;
	private String disCode;
	private String discription;
	private Double price;
	public Discount() {
		super();
	}
	
	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getDisCode() {
		return disCode;
	}

	public void setDisCode(String disCode) {
		this.disCode = disCode;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", disCode=" + disCode + ", discription=" + discription
				+ ", price=" + price + "]";
	}
	
}
