package com.employe.adminRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employe.adminModel.adminModel;

@Repository
public interface adminRepository extends JpaRepository<adminModel, Long> {

}
