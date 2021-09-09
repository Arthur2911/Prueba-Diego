package com.example.demo2.repository;

import com.example.demo2.entidades.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//El repositorio ShipperRepository gestiona la entidad Shipper que tiene un primarykey Integer


@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer> {
    // Con esta línea estamos creando un nuevo método para buscar en la base de datos, al igual que es
    // el findByID o los demas
    List<Shipper> findByCompanyname(String companyName);
}
