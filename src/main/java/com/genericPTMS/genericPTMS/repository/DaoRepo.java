package com.genericPTMS.genericPTMS.repository;

import com.genericPTMS.genericPTMS.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface DaoRepo<T extends BaseEntity> extends JpaRepository<T, Long> {
}
