package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.Address;
import com.example.demo1.model.Employee;
@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {

}
