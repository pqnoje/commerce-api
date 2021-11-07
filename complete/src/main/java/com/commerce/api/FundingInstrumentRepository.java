package com.commerce.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "funding-instruments", path = "holders")
public interface FundingInstrumentRepository extends PagingAndSortingRepository<FundingInstrument, Long> {

}
