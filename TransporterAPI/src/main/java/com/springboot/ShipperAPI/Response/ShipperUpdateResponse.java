package com.springboot.ShipperAPI.Response;

import java.sql.Timestamp;

import com.springboot.ShipperAPI.Entity.Shipper;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipperUpdateResponse {
	private String status;
	private String message;

	private String shipperId;
	private String shipperName;
	private String companyName;
	private String phoneNo;
	private String kyc;
	private String shipperLocation;
	private boolean companyApproved;
	private Shipper.ShipperStatus shipperStatus ;
	private boolean accountVerificationInProgress;
	public Timestamp timestamp;
}
