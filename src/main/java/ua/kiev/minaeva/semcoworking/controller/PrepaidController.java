package ua.kiev.minaeva.semcoworking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kiev.minaeva.semcoworking.dto.PrepaidDto;
import ua.kiev.minaeva.semcoworking.dto.PriceDto;
import ua.kiev.minaeva.semcoworking.dto.ResponseMessage;
import ua.kiev.minaeva.semcoworking.dto.VisitorDto;
import ua.kiev.minaeva.semcoworking.exception.SemCoworkingException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/prepaids")
public class PrepaidController {

    @GetMapping
    public List<PrepaidDto> getAllPrepaid() {
        //service.getAllPrepaid();
        return new ArrayList<>();
    }

    @GetMapping("/{prepaidId}")
    public List<PrepaidDto> getPrepaidById(@PathVariable final Integer prepaidId) {
        //service.getPrepaidById(prepaidId);
        return new ArrayList<>();
    }

    @PostMapping
    public PrepaidDto addPrepaid(@RequestBody PrepaidDto prepaidDto) throws SemCoworkingException {
        //service.createPrepaid(prepaidDto);
        return new PrepaidDto();
    }

    @PutMapping
    public PrepaidDto updatePrepaid(@RequestBody PrepaidDto prepaidDto) throws SemCoworkingException {
        //service.updatePrepaid(prepaidDto);
        return new PrepaidDto();
    }

    @DeleteMapping("/{prepaidId}")
    public ResponseEntity<ResponseMessage> deletePrepaid(@PathVariable final Integer prepaidId) throws SemCoworkingException {
        //service.deletePrepaid(visitorId);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Deleted " + "successfully: " + prepaidId));
    }

}
