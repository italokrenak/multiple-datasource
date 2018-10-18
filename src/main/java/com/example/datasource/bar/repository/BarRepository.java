package com.example.datasource.bar.repository;

import com.example.datasource.bar.domain.Bar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {

    /*@Query
    Optional<Bar> findById(Long id);*/

}
