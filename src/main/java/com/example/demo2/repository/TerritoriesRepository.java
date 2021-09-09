package com.example.demo2.repository;
import com.example.demo2.entidades.Territories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerritoriesRepository extends JpaRepository<Territories, String> {
}
