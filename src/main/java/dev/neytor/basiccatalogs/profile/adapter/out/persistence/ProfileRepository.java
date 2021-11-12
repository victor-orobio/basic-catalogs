package dev.neytor.basiccatalogs.profile.adapter.out.persistence;

import dev.neytor.basiccatalogs.profile.adapter.out.persistence.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "profiles", path = "profiles")
@CrossOrigin(origins = "*")
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
    Optional<ProfileEntity> findByCode(String code);

    @Override
    @RestResource(exported = false)
    <S extends ProfileEntity> S save(S entity);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(ProfileEntity entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends ProfileEntity> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
