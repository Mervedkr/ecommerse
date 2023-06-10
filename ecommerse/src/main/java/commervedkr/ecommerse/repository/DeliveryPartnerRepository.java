package commervedkr.ecommerse.repository;

import commervedkr.ecommerse.model.DeliveryPartner;
import commervedkr.ecommerse.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface DeliveryPartnerRepository extends JpaRepository<DeliveryPartner, Long> {
	    Optional<DeliveryPartner> findById(String id);

	    Boolean existsByName(String name) throws ResourceNotFoundException;

	    boolean existsById(Long id) throws ResourceNotFoundException;

}
