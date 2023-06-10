package commervedkr.ecommerse.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDTO {
	
	@NotNull(message = "Please enter your timeline!")
	@Column(nullable = false)
	private int deliveryTime;
		 
	@NotNull(message = "Please enter your company id!")
	@Column(nullable = false)
	private String deliveryPartnerId;
		 
	@NotNull(message = "Please enter your address!")
	@Column(nullable = false)
	private String address;
		 
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

	public DeliveryDTO(int deliveryTime, String deliveryPartnerId, String addres) {
      this.address = address;
      this.deliveryTime = deliveryTime;
      this.deliveryPartnerId = deliveryPartnerId;
  }

	@Override
	public String toString() {
		return "DeliveryDTO [deliveryTime=" + deliveryTime + ", deliveryPartnerId=" + deliveryPartnerId + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((deliveryPartnerId == null) ? 0 : deliveryPartnerId.hashCode());
		result = prime * result + deliveryTime;
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
		DeliveryDTO other = (DeliveryDTO) obj;
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
		return true;
	}
}
