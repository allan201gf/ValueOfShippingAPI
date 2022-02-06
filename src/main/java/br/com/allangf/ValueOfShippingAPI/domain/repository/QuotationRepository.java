package br.com.allangf.ValueOfShippingAPI.domain.repository;

import br.com.allangf.ValueOfShippingAPI.domain.entity.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotationRepository extends JpaRepository<Quotation, Integer> {
}
