package cl.duoc.ms_characters.client;

import cl.duoc.ms_characters.dto.ItemFeignDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-item", url = "http://localhost:8092/api/v1/items")
public interface ItemClient {
    @GetMapping("/{id}")
    ItemFeignDto getItemById(@PathVariable("/getItemId/id") Long id);
}