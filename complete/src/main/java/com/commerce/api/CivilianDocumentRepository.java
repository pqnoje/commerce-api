package com.commerce.api;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "civilian-documents", path = "civilian-documents")
public interface CivilianDocumentRepository extends PagingAndSortingRepository<CivilianDocument, Long> {

}
