package com.acoustic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acoustic.entity.AnnualGross;

@Repository
public interface AnnualGrossRepository extends JpaRepository<AnnualGross, Integer> {



}
