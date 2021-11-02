package com.example.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vehicles", path = "vehicle")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Long> {

	List<Vehicle> findByMotor(@Param("motor") String motor);

}
