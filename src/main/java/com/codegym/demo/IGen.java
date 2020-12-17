package com.codegym.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IGen<T> {
Page<T> findAll(Pageable pageable);
T save(T t);
Optional<T> findbyId(Long id);
void remove(Long id);
}