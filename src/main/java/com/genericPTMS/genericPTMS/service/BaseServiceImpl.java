package com.genericPTMS.genericPTMS.service;

import com.genericPTMS.genericPTMS.mapper.GenericMapper;
import com.genericPTMS.genericPTMS.model.BaseEntity;
import com.genericPTMS.genericPTMS.repository.DaoRepo;

import java.util.List;
public class BaseServiceImpl<E extends BaseEntity, D> implements BaseService<E, D> {

    private final DaoRepo<E> daoRepo;
    private final GenericMapper<E, D> mapper;
    public BaseServiceImpl(DaoRepo<E> daoRepo , GenericMapper<E, D> mapper) {
        this.daoRepo = daoRepo;
        this.mapper = mapper;
    }
    @Override
    public D create(D dto) {
        E entity = mapper.toEntity(dto);
        E savedEntity = daoRepo.save(entity);
        return mapper.toDto(savedEntity);
    }

    @Override
    public D get(Long id) {
        E entity = daoRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Entity not found with ID: " + id));
        return mapper.toDto(entity);
    }

//    @Override
//    public List<D> getAll() {
//        return daoRepo.findAll()
//                .stream()
//                .map(mapper::toDto)
//                .toList();
//    }

    @Override
    public List<D> getAll() {
        return mapper.toDtoList(daoRepo.findAll());
    }

    @Override
    public D update(Long id, D dto) {
        if (!daoRepo.existsById(id)) {
            throw new RuntimeException("Entity not found with ID: " + id);
        }
        E existingEntity = daoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found with ID: " + id));

        mapper.updateEntityFromDto(dto, existingEntity);
        E savedEntity = daoRepo.save(existingEntity);
        return mapper.toDto(savedEntity);
    }

    @Override
    public void delete(Long id) {
        if (!daoRepo.existsById(id)) {
            throw new RuntimeException("Entity not found with ID: " + id);
        }
        daoRepo.deleteById(id);
    }
}
