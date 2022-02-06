package br.com.allangf.ValueOfShippingAPI.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InputQuotationDTO {

    @JsonProperty("peso")
    private Double peso;

    @JsonProperty("cep_origem")
    @NotEmpty(message = "cep_origem is required")
    private String cepOrigem;

    @JsonProperty("cep_destino")
    @NotEmpty(message = "cep_destino is required")
    private String cepDestino;

    @JsonProperty("nome_destino")
    @NotEmpty(message = "nome_destino is required")
    private String nomeDestinatario;

}
