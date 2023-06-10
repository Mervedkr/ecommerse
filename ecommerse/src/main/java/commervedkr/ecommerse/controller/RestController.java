package commervedkr.ecommerse.controller;

import commervedkr.ecommerse.model.Delivery;
import commervedkr.ecommerse.model.DeliveryDTO;
import commervedkr.ecommerse.model.DeliveryPartner;
import commervedkr.ecommerse.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@AllArgsConstructor
@Controller
//@Produces(MediaType.APPLICATION_JSON)
@RequestMapping("/delivery")
public class RestController {

    private final Service deliveryService;

    public RestController(Service deliveryService) {
		super();
		this.deliveryService = deliveryService;
	}

	@PostMapping("/add")
    public ResponseEntity<Map<String, Boolean>> createDelivery(@RequestBody DeliveryDTO deliveryDTO, Long partnerId) {
		Map<String, Boolean> map = new HashMap<>();
    	if(partnerId.equals(deliveryDTO.getDeliveryPartnerId())){
    		deliveryService.createDelivery(deliveryDTO);
    		map.put("Delivery has been added successfully!", true);
    		return new ResponseEntity<>(map, HttpStatus.CREATED);
    	}
    	else
    		return new ResponseEntity<>(map, HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Delivery>> listDelivery() {
        List<Delivery> deliveryList = deliveryService.listDelivery();
        return new ResponseEntity<>(deliveryList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteDelivery(@PathVariable Long id, Long partnerId) {
    	Optional<Delivery> delivery = deliveryService.findDelivery(id);
		Map<String, Boolean> map = new HashMap<>();
    	if(delivery.get().getDeliveryPartnerId().equals(partnerId)) {
    		deliveryService.removeById(id);
    		map.put("Delivery has been deleted successfully!", true);
    		return new ResponseEntity<>(map, HttpStatus.OK);
    	}
    	else
    		return new ResponseEntity<>(map, HttpStatus.UNAUTHORIZED);
    }
    
    @PostMapping("/addPartner")
    //@PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Map<String, Boolean>> createDeliveryPartner(@RequestBody DeliveryPartner deliveryPartner) {
    	deliveryService.createDeliveryPartner(deliveryPartner);
        Map<String, Boolean> map = new HashMap<>();
        map.put("Company has been added successfully!", true);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/deletePartner/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteDeliveryPartner(@PathVariable Long id) {

    	deliveryService.removeDeliveryPartnerById(id);
        Map<String, Boolean> map = new HashMap<>();
        map.put("Company has been deleted successfully!", true);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}