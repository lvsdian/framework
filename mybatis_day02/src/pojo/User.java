package pojo;

import java.util.Date;
import java.util.List;

public class User {
	private Integer id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;
	private String uuid2;
	
	private List<Order> orders;

	public User(String username, String sex, Date birthday, String address) {
		this.username = username;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
	}
	public User() {
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getUuid2() {
		return uuid2;
	}

	public void setUuid2(String uuid2) {
		this.uuid2 = uuid2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + ", uuid2=" + uuid2 + ", orders=" + orders + "]";
	}
}
