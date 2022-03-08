package com.robsom.controle.repository;

import com.robsom.controle.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository <TipoData, Long> {
}
