package com.commerce.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "holders", path = "holders")
public interface HolderRepository extends PagingAndSortingRepository<Holder, Long> {

}
