package com.genericPTMS.genericPTMS.service;

import com.genericPTMS.genericPTMS.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<E extends BaseEntity, D>{
    D create(D dto);
    D get(Long id);
    List<D> getAll();
    D update(Long id, D dto);
    void delete(Long id);
}
