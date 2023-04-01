package com.springboot.ShipperAPI.Entity;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "Shipper")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
	@Id
	private String shipperId;
	private String shipperName;
	private String companyName;
	@Column(unique=true)
	@NotBlank(message = "Phone no. cannot be blank!")
	//	"^[6-9]\\d{9}$", "(^$|[0-9]{10})"
	@Pattern(regexp="(^[6-9]\\d{9}$)", message="Please enter a valid mobile number") 
	private String phoneNo;
	private String kyc;
	private String shipperLocation;

	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
	private boolean companyApproved;

	@Enumerated(EnumType.STRING)
	private Shipper.ShipperStatus shipperStatus ;

	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
	private boolean accountVerificationInProgress;
	
	@CreationTimestamp
	public Timestamp timestamp;

	public enum ShipperStatus {
		VERIFIED, NOT_VERIFIED, REJECTED, IN_PROGRESS
	}
}
