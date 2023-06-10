package commervedkr.ecommerse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import commervedkr.ecommerse.model.*;
import commervedkr.ecommerse.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class Service {   
	
	private final ServiceImpl serviceImpl;

	public Service(ServiceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}

	public void createDelivery(DeliveryDTO deliveryDTO) {
		serviceImpl.addDelivery(deliveryDTO);
	}
	
	public Optional<Delivery> findDelivery(Long id) {
		return serviceImpl.findDelivery(id);
	}

	public void removeById(Long id) {
		serviceImpl.deleteDelivery(id);
	}

	public List<Delivery> listDelivery() {
		return serviceImpl.listDelivery();
	}

	public void createDeliveryPartner(DeliveryPartner deliveryPartner) {
		serviceImpl.addDeliveryPartner(deliveryPartner);
	}

	public void removeDeliveryPartnerById(Long id) {
		serviceImpl.deleteDeliveryartner(id);
	}

}
