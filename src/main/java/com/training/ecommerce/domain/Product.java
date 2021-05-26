package com.training.ecommerce.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory productCategory;
	
	@Column(name="sku")
	private String sku;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="unit_Price")
	private BigDecimal unitPrice;
	
	@Column(name="image_Url")
	private String imageUrl;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="units_In_Stock")
	private int unitsInStock;
	
	@Column(name="date_Created")
	@CreationTimestamp
	private Date dateCreated;
	
	@Column(name="last_Updated")
	@UpdateTimestamp
	private Date lastUpdated;

}
