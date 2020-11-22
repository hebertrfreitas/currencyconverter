package com.jayatech.currencyconverter.controller.dto;

import lombok.Data;

import javax.money.MonetaryAmount;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ConversionDto {

    @NotEmpty(message = "User id is required")
    private String userId;

    @NotEmpty(message = "from currency is required, check ISO 4217 for accepted values")
    private String fromCurrency;

    @NotEmpty(message = "to currency is required, check ISO 4217 for accepted values")
    private String toCurrency;

    @NotEmpty(message = "amount is required")
    private String amount;


}
