package br.com.allangf.ValueOfShippingAPI.rest.controller;

import br.com.allangf.ValueOfShippingAPI.rest.dto.InputQuotationDTO;
import br.com.allangf.ValueOfShippingAPI.rest.dto.OutputQuotationDTO;
import br.com.allangf.ValueOfShippingAPI.rest.service.QuotationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/quotation")
public class QuotationController {

    @Autowired
    QuotationService quotationService;

    @PostMapping
    @ApiOperation("Get Quotation")
    private OutputQuotationDTO getQuotation(@RequestBody @Valid InputQuotationDTO inputQuotationDTO) {
        return quotationService.getQuotation(inputQuotationDTO);
    }

}
