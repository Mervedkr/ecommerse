package commervedkr.ecommerse.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "partners")
public class DeliveryPartner {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(nullable = false)
	private int numberOfOrders;
	
	@NotNull
	@Column(nullable = false)
	private String partnerName;

	public DeliveryPartner(Long id, String partnerName) {
	    this.id = id;
	    this.numberOfOrders = 0;
	    this.partnerName = partnerName;
	}

	@Override
	public String toString() {
		return "DeliveryPartner [id=" + id + ", numberOfOrders=" + numberOfOrders + ", partnerName=" + partnerName
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + numberOfOrders;
		result = prime * result + ((partnerName == null) ? 0 : partnerName.hashCode());
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
		DeliveryPartner other = (DeliveryPartner) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberOfOrders != other.numberOfOrders)
			return false;
		if (partnerName == null) {
			if (other.partnerName != null)
				return false;
		} else if (!partnerName.equals(other.partnerName))
			return false;
		return true;
	}

}
