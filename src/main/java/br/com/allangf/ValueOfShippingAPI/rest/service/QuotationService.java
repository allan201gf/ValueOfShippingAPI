package br.com.allangf.ValueOfShippingAPI.rest.service;

import br.com.allangf.ValueOfShippingAPI.domain.entity.Quotation;
import br.com.allangf.ValueOfShippingAPI.domain.repository.QuotationRepository;
import br.com.allangf.ValueOfShippingAPI.domain.viacepapi.Cep;
import br.com.allangf.ValueOfShippingAPI.rest.config.WebClientMetods;
import br.com.allangf.ValueOfShippingAPI.rest.dto.InputQuotationDTO;
import br.com.allangf.ValueOfShippingAPI.rest.dto.OutputQuotationDTO;
import br.com.allangf.ValueOfShippingAPI.rest.mapper.QuotationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class QuotationService {

    @Autowired
    private QuotationRepository quotationRepository;

    @Autowired
    private QuotationMapper quotationMapper;

    @Autowired
    private WebClientMetods webClientMetods;

    public OutputQuotationDTO getQuotation(InputQuotationDTO inputQuotationDTO) {

        Cep cepOrigem = webClientMetods.getDDD(inputQuotationDTO.getCepOrigem());
        Cep cepDestino = webClientMetods.getDDD(inputQuotationDTO.getCepDestino());

        Double vlTotal = inputQuotationDTO.getPeso() * 1;
        LocalDate dataPrevistaEntrega = LocalDate.now();

        if (cepOrigem.getDdd().equals(cepDestino.getDdd())) {
            vlTotal = vlTotal * 0.5;
            dataPrevistaEntrega = dataPrevistaEntrega.plusDays(1);
        } else if (cepOrigem.getUf().equals(cepDestino.getUf())) {
            vlTotal = vlTotal * 0.25;
            dataPrevistaEntrega = dataPrevistaEntrega.plusDays(3);
        } else {
            dataPrevistaEntrega = dataPrevistaEntrega.plusDays(10);
        }

        Quotation quotation = quotationMapper.inputDTOToQuotation(inputQuotationDTO, LocalDate.now(), vlTotal);

        quotationRepository.save(quotation);

        return quotationMapper.quotationToOutputDTO(quotation);

    }

}
