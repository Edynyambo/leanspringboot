package com.mbokamall.mbookamalldb.Entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long productId;
    @NotNull(message = "name can not be null")
    private String name;
    @NotNull(message = "description can not be null")
    private String description;
    @NotNull(message = "image can not be null")
    private String image;
    @NotNull(message = "price can not be null")
    private double price;
    
}
