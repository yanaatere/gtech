package com.test.gtech.controller;

import com.test.gtech.dto.ResponseDTO;
import com.test.gtech.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/{startDate}/{endDate}")
    public List<ResponseDTO> getTransaction(@PathVariable String startDate, @PathVariable String endDate){

       return transactionService.getReport(startDate, endDate);
    }


}
