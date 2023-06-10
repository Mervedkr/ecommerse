package commervedkr.ecommerse.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import commervedkr.ecommerse.model.Delivery;
import commervedkr.ecommerse.model.DeliveryDTO;
import commervedkr.ecommerse.model.DeliveryPartner;
import commervedkr.ecommerse.repository.DeliveryPartnerRepository;
import commervedkr.ecommerse.repository.DeliveryRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceImpl {

	private final DeliveryRepository deliveryRepository;
	private final DeliveryPartnerRepository deliveryPartnerRepository;

	public ServiceImpl(DeliveryRepository deliveryRepository, DeliveryPartnerRepository deliveryPartnerRepository) {
		super();
		this.deliveryRepository = deliveryRepository;
		this.deliveryPartnerRepository = deliveryPartnerRepository;
	}

	public void addDelivery(DeliveryDTO deliveryDTO) {
		deliveryRepository.saveAll(deliveryDTO);
	}
	
	public Optional<Delivery> findDelivery(Long id) {
		return deliveryRepository.findById(id);
	}

	public void deleteDelivery(Long id) {
		deliveryRepository.deleteById(id);
	}
	
	
	public void addDeliveryPartner(DeliveryPartner partner) {
		deliveryPartnerRepository.save(partner);
	}

	public void deleteDeliveryartner(Long id) {
		deliveryPartnerRepository.deleteById(id);
	}

	public List<Delivery> listDelivery() {
		return deliveryRepository.findAll();
	}

}
