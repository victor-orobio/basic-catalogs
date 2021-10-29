package dev.neytor.basiccatalogs.operativecenter.adapter.out.persistence;

import dev.neytor.basiccatalogs.operativecenter.adapter.out.persistence.entity.OperativeCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "operative-centers", path = "operative-centers")
@CrossOrigin(origins = "*")
public interface OperativeCenterRepository extends JpaRepository<OperativeCenterEntity, Long> {
    Optional<OperativeCenterEntity> findByCode(String code);
}
