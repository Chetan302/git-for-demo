package com.dailykart.bo;

public class OrderDetails {

	private long awBillNo;
	private String currerntLocation;

	public long getAwBillNo() {
		return awBillNo;
	}

	public void setAwBillNo(long awBillNo) {
		this.awBillNo = awBillNo;
	}

	public String getCurrerntLocation() {
		return currerntLocation;
	}

	public void setCurrerntLocation(String currerntLocation) {
		this.currerntLocation = currerntLocation;
	}

	@Override
	public String toString() {
		return "OrderDetails [awBillNo=" + awBillNo + ", currerntLocation=" + currerntLocation + "]";
	}

}
