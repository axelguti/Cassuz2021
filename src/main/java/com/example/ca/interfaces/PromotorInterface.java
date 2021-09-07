package com.example.ca.interfaces;


import com.example.ca.DTO.PromotorDTO;


public interface PromotorInterface extends EntidadInterface<PromotorDTO>{
    public PromotorDTO buscar(Object id);
}
