package br.com.allangf.ValueOfShippingAPI.rest.mapper;

import br.com.allangf.ValueOfShippingAPI.domain.entity.Quotation;
import br.com.allangf.ValueOfShippingAPI.rest.dto.InputQuotationDTO;
import br.com.allangf.ValueOfShippingAPI.rest.dto.OutputQuotationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class QuotationMapper {

    ModelMapper modelMapper = new ModelMapper();

    public OutputQuotationDTO quotationToOutputDTO(Quotation quotation) {
        return modelMapper.map(quotation, OutputQuotationDTO.class);
    }

    public Quotation inputDTOToQuotation(InputQuotationDTO inputQuotationDTO, LocalDate date, Double value) {
        Quotation quotation = new Quotation();
        quotation.setCepDestino(inputQuotationDTO.getCepDestino());
        quotation.setCepOrigem(inputQuotationDTO.getCepOrigem());
        quotation.setDataConsulta(LocalDate.now());
        quotation.setPeso(inputQuotationDTO.getPeso());
        quotation.setDataPrevistaEntrega(date);
        quotation.setNomeDestinatario(inputQuotationDTO.getNomeDestinatario());
        quotation.setVlTotalFrete(value);

        return quotation;
    }

}
