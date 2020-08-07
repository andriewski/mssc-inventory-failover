package guru.sfg.brewery.inventoryfailover.web;

import guru.sfg.brewery.inventoryfailover.model.BeerInventoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RestController
public class InventoryFailOverController {

    @GetMapping(path = "/inventory-failover")
    public ResponseEntity<List<BeerInventoryDto>> getStubInventory() {
        return ResponseEntity.ok(List.of(
                BeerInventoryDto.builder()
                        .id(UUID.randomUUID())
                        .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                        .createdDate(OffsetDateTime.now())
                        .lastModifiedDate(OffsetDateTime.now())
                        .quantityOnHand(999)
                        .build()
        ));
    }
}
