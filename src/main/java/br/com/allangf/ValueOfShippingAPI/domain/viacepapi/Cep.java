package br.com.allangf.ValueOfShippingAPI.domain.viacepapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cep {

    private String ddd;
    private String uf;

}
