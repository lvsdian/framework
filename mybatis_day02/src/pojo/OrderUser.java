package pojo;

/**
 * 订单关联用户的pojo
 * @author LSD
 *
 */
public class OrderUser extends Order {
	private String username;
	private String adress;
	
	public OrderUser() {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "OrderUser [username=" + username + ", adress=" + adress + ", getId()=" + getId() + ", getUserId()="
				+ getUserId() + ", getNumber()=" + getNumber() + ", getCreatetime()=" + getCreatetime() + ", getNote()="
				+ getNote() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
