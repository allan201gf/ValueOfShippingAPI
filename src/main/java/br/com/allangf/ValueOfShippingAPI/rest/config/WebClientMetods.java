package br.com.allangf.ValueOfShippingAPI.rest.config;

import br.com.allangf.ValueOfShippingAPI.domain.exception.RuleOfException;
import br.com.allangf.ValueOfShippingAPI.domain.viacepapi.Cep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
@RequiredArgsConstructor
public class WebClientMetods {

    @Autowired
    private WebClient webClient;

    public Cep getDDD(String searchCep) {
        try {
            Cep cep = this.webClient
                    .method(HttpMethod.GET)
                    .uri("/ws/{searchCep}/json", searchCep)
                    .retrieve()
                    .bodyToMono(Cep.class)
                    .block();

            assert cep != null;
            return cep;
        } catch (WebClientResponseException ex) {
            throw new RuleOfException("Invalid cep");
        }
    }
}
