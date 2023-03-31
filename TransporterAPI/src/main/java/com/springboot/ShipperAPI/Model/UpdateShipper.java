package com.springboot.ShipperAPI.Model;

import com.springboot.ShipperAPI.Entity.Shipper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShipper {
	private String phoneNo;
	private String shipperName;
	private String companyName;
	private String kyc;
	private String shipperLocation;
	private Boolean companyApproved;
	private Shipper.ShipperStatus shipperStatus ;
	private Boolean accountVerificationInProgress;
}
