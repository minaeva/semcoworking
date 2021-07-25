package ua.kiev.minaeva.semcoworking.controller;

import org.springframework.web.bind.annotation.*;
import ua.kiev.minaeva.semcoworking.controller.dto.UpdatePriceDto;
import ua.kiev.minaeva.semcoworking.dto.PriceDto;
import ua.kiev.minaeva.semcoworking.exception.SemCoworkingException;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @GetMapping("/{period}")
    public double getPrice(@PathVariable final String period) throws SemCoworkingException {
        //service.getPrice();
        return 1.0;
    }

    @PutMapping
    public PriceDto updatePrice(@RequestBody UpdatePriceDto newPrice) {
        // service.updatePrice(newPrice);
        return new PriceDto();
    }


}
