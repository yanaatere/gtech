package com.test.gtech.service;

import com.test.gtech.dto.ResponseDTO;
import com.test.gtech.entity.Transaction;
import com.test.gtech.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    private final BigDecimal percentage = new BigDecimal("0.05");

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<ResponseDTO> getReport(String startDate, String endDate){
        List<ResponseDTO> responseDTOs = new ArrayList<ResponseDTO>();
        List<Transaction> transactionList = transactionRepository.findAllByTransactionDateBetween(convertStringToDate(startDate), convertStringToDate(endDate));
        if(transactionList.size() > 0){
            for (int i = 0; i < transactionList.size(); i++) {
                Transaction transaction = transactionList.get(i);
                ResponseDTO responseDTO = new ResponseDTO(i + 1, transaction.getProduct().getId(), transaction.getProduct().getProductname(), transaction.getProduct().getProductType(),
                        transaction.getProduct().getPrice(), (percentage.multiply(transaction.getProduct().getPrice())));
                responseDTOs.add(responseDTO);
            }
        }
        return responseDTOs;
    }

    private Date convertStringToDate(String strDate) {
        // Define the date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parse the string to Date
            Date date = dateFormat.parse(strDate);
            return date;
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
        return null;
    }
}
