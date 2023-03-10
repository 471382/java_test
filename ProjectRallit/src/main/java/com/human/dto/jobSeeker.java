package com.human.dto;

public class jobSeeker {
	private String seeker_id;
	private String pw;
	private String phone;
	private String city;
	private String address;
	private int cvnum;
	@Override
	public String toString() {
		return "jobSeeker [seeker_id=" + seeker_id + ", pw=" + pw + ", phone=" + phone + ", city=" + city + ", address="
				+ address + ", cvnum=" + cvnum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seeker_id == null) ? 0 : seeker_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		jobSeeker other = (jobSeeker) obj;
		if (seeker_id == null) {
			if (other.seeker_id != null)
				return false;
		} else if (!seeker_id.equals(other.seeker_id))
			return false;
		return true;
	}
	public String getSeeker_id() {
		return seeker_id;
	}
	public void setSeeker_id(String seeker_id) {
		this.seeker_id = seeker_id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCvnum() {
		return cvnum;
	}
	public void setCvnum(int cvnum) {
		this.cvnum = cvnum;
	}
}
