package com.commerce.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "credit-cards", path = "credit-cards")
public interface CreditCardRepository extends PagingAndSortingRepository<CreditCard, Long> {

}
