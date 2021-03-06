package dev.neytor.basiccatalogs.estate.adapter.out.persistence;

import dev.neytor.basiccatalogs.estate.adapter.out.persistence.entity.EstateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "estates", path = "estates")
@CrossOrigin(origins = "*")
public interface EstateRepository extends JpaRepository<EstateEntity, Long> {
    List<EstateEntity> findAllByCountryCode(String code);
}
