package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.model.Address;
import com.example.demo1.repository.IAddressRepository;

@Service
public class AddressService {
	@Autowired
	private IAddressRepository addressRepository;

	public Address addAddress(Address address) {
		Address addressSavedToDB = this.addressRepository.save(address);
		return addressSavedToDB;
	}
}
