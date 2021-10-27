package dev.neytor.basiccatalogs.country.adapter.out.persistence;

import dev.neytor.basiccatalogs.country.adapter.out.persistence.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
