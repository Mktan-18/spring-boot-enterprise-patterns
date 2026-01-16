package com.example.enterprise.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderRequest {

    /*
    Say my user sends me product name, gives userid, and Quantity
     */

    @NotBlank
    private String userId;

    @NotBlank // checks both null and empty
    private String productName;

    @Size(min = 1)
    private Integer quantity;

    // now for standard getter setter to String hascode I will use lombok to avoid broiler plate code



}
