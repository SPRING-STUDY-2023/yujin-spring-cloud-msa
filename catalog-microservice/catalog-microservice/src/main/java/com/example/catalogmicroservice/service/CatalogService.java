package com.example.catalogmicroservice.service;

import com.example.catalogmicroservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}