package ua.kiev.minaeva.semcoworking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kiev.minaeva.semcoworking.dto.ResponseMessage;
import ua.kiev.minaeva.semcoworking.dto.VisitorDto;
import ua.kiev.minaeva.semcoworking.exception.SemCoworkingException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/visitors")
public class VisitorController {

    @GetMapping
    public List<VisitorDto> getAllVisitors() {
        //service.getAll();
        return new ArrayList<>();
    }

    @GetMapping("/{visitorId}")
    public VisitorDto getVisitorById(@PathVariable final Integer visitorId) throws SemCoworkingException {
        //service.getVisitorById(visitorId);
        return new VisitorDto();
    }

    @PostMapping
    public VisitorDto addVisitor(@RequestBody VisitorDto visitorDto) throws SemCoworkingException {
        //service.createVisitor(visitorDto);
        return new VisitorDto();
    }

    @PutMapping
    public VisitorDto updateVisitor(@RequestBody VisitorDto visitorToUpdate) throws SemCoworkingException {
        //service.updateVisitor(visitorToUpdate);
        return new VisitorDto();
    }

    @DeleteMapping("/{visitorId}")
    public ResponseEntity<ResponseMessage> deleteVisitor(@PathVariable final Integer visitorId) throws SemCoworkingException {
        //service.deleteVisitor(visitorId);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Deleted " + "successfully: " + visitorId));
    }
}
