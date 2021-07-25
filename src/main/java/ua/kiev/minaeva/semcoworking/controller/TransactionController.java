package ua.kiev.minaeva.semcoworking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kiev.minaeva.semcoworking.dto.TransactionDto;
import ua.kiev.minaeva.semcoworking.dto.VisitorDto;
import ua.kiev.minaeva.semcoworking.exception.SemCoworkingException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @PostMapping
    public TransactionDto addTransaction(@RequestBody TransactionDto transactionDto) throws SemCoworkingException {
        //service.addTransaction(transactionDto);
        return new TransactionDto();
    }

    @PutMapping
    public TransactionDto updateTransaction(@RequestBody TransactionDto transactionToUpdate) throws SemCoworkingException {
        //service.updateTransaction(transactionToUpdate);
        return new TransactionDto();
    }

    @GetMapping
    public List<TransactionDto> getAllTransactions() {
        //service.getAll();
        return new ArrayList<>();
    }

    @GetMapping("/{transactionId}")
    public TransactionDto getTransactionById(@PathVariable final Integer transactionId) throws SemCoworkingException {
        //service.getTransactionById(transactionId);
        return new TransactionDto();
    }

    @GetMapping("/visitor/{visitorId}")
    public List<TransactionDto> getTransactionsByVisitorId(@PathVariable final Integer visitorId) throws SemCoworkingException {
        //service.getTransactionsByVisitorId(visitorId);
        return new ArrayList<>();
    }

    @GetMapping("/date/{date}")
    public List<TransactionDto> getTransactionsByStartDate(@PathVariable final String date) throws SemCoworkingException {
        //service.getTransactionsByStartDate(date);
        return new ArrayList<>();
    }

}

