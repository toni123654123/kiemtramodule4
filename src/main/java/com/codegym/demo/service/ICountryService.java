package com.codegym.demo.service;


import com.codegym.demo.model.Country;

public interface ICountryService {
    Iterable<Country> findAll();
    Country findById(Long id);
}
