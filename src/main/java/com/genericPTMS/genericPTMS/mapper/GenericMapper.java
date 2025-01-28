package com.genericPTMS.genericPTMS.mapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface GenericMapper<E, D> {
    // Entity to DTO
    D toDto(E entity);

    // DTO to Entity
    E toEntity(D dto);

    // List of entities to list of DTOs
    List<D> toDtoList(List<E> entities);

    // List of DTOs to list of entities
    List<E> toEntityList(List<D> dtos);

    // Update an existing entity from a DTO
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(D dto, @MappingTarget E entity);
}
