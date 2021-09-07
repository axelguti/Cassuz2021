package com.example.ca.interfaces;



import com.example.ca.DTO.CajaDTO;

import java.util.List;

public interface CajaInterface extends EntidadInterface<CajaDTO>{
    public List<CajaDTO> listacaja();
    public List<CajaDTO> litacajaMontoTotal();
}
