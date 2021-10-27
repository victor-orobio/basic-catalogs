package dev.neytor.basiccatalogs.city.adapter.out.persistence;

import dev.neytor.basiccatalogs.city.adapter.out.persistence.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepository extends JpaRepository<CityEntity, Long> {
    List<CityEntity> findAllByEstateCode(String code);
    List<CityEntity> findAllByCountryCode(String code);
}
