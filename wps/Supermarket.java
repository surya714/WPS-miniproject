package com.onlineslot.getslots;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supermarkets")
public class Supermarket {
	 @Id
	 @GeneratedValue(generator = "customer_generator")
	    @SequenceGenerator(
	            name = "customer_generator",
	            sequenceName = "customer_sequence",
	            initialValue = 1
	    )
	 private Long marketid;
	public Long getMarketid() {
		return marketid;
	}

	public void setMarketid(Long marketid) {
		this.marketid = marketid;
	}

	public String getMarket_name() {
		return market_name;
	}

	public void setMarket_name(String market_name) {
		this.market_name = market_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

		private String market_name;
	    private String address;
	 
	 private double lattitude;
	 
	 private double longitude;
	 private Long location;

	public Long getLocation() {
		return location;
	}

	public void setLocation(Long location) {
		this.location = location;
	}
	 private String starttime;
	 private String endtime;
	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

}
