package com.example.enterprise.api;

import com.example.enterprise.models.OrderRequest;
import com.example.enterprise.models.OrderResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/order")
public interface OrderApi {

    /*
    Define API level contract
    minimum setup url mapping get, post methods, http codes, response object, request object
     */
    /*
    Why @RequestBody--> tells spring read the http request body and converts json/xml input to given java object
    else, spring won't deserialize to our required object

    @Valid --> triggers bean validation, ensures request data is valid before business validation runs
    so basically it triggers

    ResponseEntity<T>, I return ResponseEntity to have full control over HTTP semantics such as status codes and headers, which is essential for production-grade APIs.

    ResponseEntity<T> is a Spring provided Wrapper class  that represents entire http response (header,body, status code)
    used in controllers for api responses to explicitly control, if you used plain dto object then header control, status code response will be limited.
     */

    // API to create order
    @RequestMapping(value = "/create",
    produces = {"application/json"},
    consumes = {"application/json"},
    method = RequestMethod.POST)
    ResponseEntity<OrderResponse> createOrder(@Valid @RequestBody OrderRequest request);

    // to cancel order takes path variable as orderId

    @RequestMapping(value = "/{orderId}/cancel",
            produces = {"application/json"},
            method = RequestMethod.POST
    )
    // can used @Postmapping
    ResponseEntity<String> cancelOrder( @NotBlank @PathVariable String orderId);

    // api to get orderDetails of specific orderId
    @RequestMapping(value ="/{orderId}" ,
    produces = {"application/json"},
    method = RequestMethod.GET)
    ResponseEntity<OrderResponse> getOrderByOrderId( @NotBlank @PathVariable String orderId);

    // api to get orderDetails using userId, multiple order possible
//    @RequestMapping(value = "",
//    produces = {"application/json"},
//    method = RequestMethod.GET)
    //@RequestParam(required = true (by default)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<OrderResponse>> getOrderByUserid(@RequestParam() String userId);


}
