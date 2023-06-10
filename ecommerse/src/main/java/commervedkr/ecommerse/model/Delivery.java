package commervedkr.ecommerse.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;



@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "deliveries")
public class Delivery {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	 
	 @NotNull(message = "Please enter your timeline!")
	 @Column(nullable = false)
    private int deliveryTime;
	 
	 @NotNull(message = "Please enter your company id!")
	 @Column(nullable = false)
    private String deliveryPartnerId;
	 
	 @NotNull(message = "Please enter your address!")
	 @Column(nullable = false)
    private String address;

	 @NotNull(message = "Please enter deliver's prise!")
	 @Column(nullable = false)
    private String prise;
	 

	public int getDeliveryTime() {
		return deliveryTime;
	}


	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


	public String getDeliveryPartnerId() {
		return deliveryPartnerId;
	}


	public void setDeliveryPartnerId(String deliveryPartnerId) {
		this.deliveryPartnerId = deliveryPartnerId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPrise() {
		return prise;
	}


	public void setPrise(String prise) {
		this.prise = prise;
	}


	@Override
	public String toString() {
		return "Delivery [id=" + id + ", deliveryTime=" + deliveryTime + ", deliveryPartnerId=" + deliveryPartnerId
				+ ", address=" + address + ", prise=" + prise + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((deliveryPartnerId == null) ? 0 : deliveryPartnerId.hashCode());
		result = prime * result + deliveryTime;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((prise == null) ? 0 : prise.hashCode());
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
		Delivery other = (Delivery) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (deliveryPartnerId == null) {
			if (other.deliveryPartnerId != null)
				return false;
		} else if (!deliveryPartnerId.equals(other.deliveryPartnerId))
			return false;
		if (deliveryTime != other.deliveryTime)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (prise == null) {
			if (other.prise != null)
				return false;
		} else if (!prise.equals(other.prise))
			return false;
		return true;
	}
	

}
