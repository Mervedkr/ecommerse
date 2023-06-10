package commervedkr.ecommerse.repository;

import commervedkr.ecommerse.model.Delivery;
import commervedkr.ecommerse.model.DeliveryDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

	void saveAll(DeliveryDTO deliveryDTO);

}
