package com.g09.reto3.entity.custom;

import com.g09.reto3.entity.Clients;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountClients {

    private Long total;
    private Clients client;

    public CountClients(Clients client, Long total ){
        this.total=total;
        this.client=client;

    }

   /* 
   @Getters
   @Setters
   private Integer total;
    private Categoria categoria;

    public CountCategoria (Integer total, Categoria categoria){
        this.total = total;
        this.categoria = categoria;
    }

    */
}
