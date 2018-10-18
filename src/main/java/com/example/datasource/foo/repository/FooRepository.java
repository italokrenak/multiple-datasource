package com.example.datasource.foo.repository;

import com.example.datasource.bar.domain.Bar;
import com.example.datasource.foo.domain.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {

   /* @Query
    Optional<Foo> findById(Long id);*/
}
