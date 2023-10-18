package com.example.catalogmicroservice.controller;

import com.example.catalogmicroservice.jpa.CatalogEntity;
import com.example.catalogmicroservice.service.CatalogService;
import com.example.catalogmicroservice.vo.ResponseCatalog;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog-service")
public class CatalogController {
    private final CatalogService catalogService;

    @GetMapping("/health_check")
    public String status(HttpServletRequest request) {
        return String.format("It's working in Catalog Service on Port %s", request.getServerPort());
    }

    @GetMapping("/catalogs")
    public ResponseEntity<List<ResponseCatalog>> getCatalogs() {
        Iterable<CatalogEntity> catalogList = catalogService.getAllCatalogs();

        List<ResponseCatalog> result = new ArrayList<>();
        catalogList.forEach(o -> result.add(new ModelMapper().map(o, ResponseCatalog.class)));

        return ResponseEntity.ok(result);
    }
}
