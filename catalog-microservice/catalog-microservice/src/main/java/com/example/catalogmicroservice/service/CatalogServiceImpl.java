package com.example.catalogmicroservice.service;

import com.example.catalogmicroservice.jpa.CatalogEntity;
import com.example.catalogmicroservice.jpa.CatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {
    private final CatalogRepository repository;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return repository.findAll();
    }
}