package br.com.allangf.ValueOfShippingAPI.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OutputQuotationDTO {

    @JsonProperty("cep_origem")
    private String cepOrigem;

    @JsonProperty("cep_destino")
    private String cepDestino;

    @JsonProperty("vl_total_frete")
    private Double vlTotalFrete;

    @JsonProperty("data_prevista_entrega")
    private LocalDate dataPrevistaEntrega;

}
