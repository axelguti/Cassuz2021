package com.example.ca.interfaces;


import com.example.ca.DTO.ListaPreciosDTO;

import java.io.File;
import java.io.IOException;

public interface ListaPrecioInterface extends EntidadInterface<ListaPreciosDTO> {
    public String Importar(File file) throws IOException;
}
