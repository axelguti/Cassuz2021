package com.example.ca.interfaces;


import com.example.ca.DTO.CatalogoDTO;


import java.util.List;

public interface CatalogoInterface extends EntidadInterface<CatalogoDTO> {
    public List<CatalogoDTO> listarCatalogos();
}
