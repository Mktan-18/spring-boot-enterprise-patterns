package com.example.enterprise.models;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderResponse {

    /*
    In api response i will return user about their

    userid, orderid, status, quantity and product Name
     */

    private String orderId; // can be UUID, for simplifying testing using String

    private String userId;

    private String productName;

    private Integer quantity;

    // For Status i will define and Enum

    private StatusEnum status;

}
