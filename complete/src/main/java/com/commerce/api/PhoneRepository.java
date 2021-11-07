package com.commerce.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "phones", path = "phones")
public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {

}
