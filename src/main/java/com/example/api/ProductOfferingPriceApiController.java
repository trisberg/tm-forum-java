package com.example.api;

import com.example.model.ProductOfferingPrice;
import com.example.model.ProductOfferingPriceCreate;
import com.example.model.ProductOfferingPriceUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-28T13:08:23.907Z")

@Controller
public class ProductOfferingPriceApiController implements ProductOfferingPriceApi {

    private static final Logger log = LoggerFactory.getLogger(ProductOfferingPriceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductOfferingPriceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProductOfferingPrice> createProductOfferingPrice(@ApiParam(value = "The ProductOfferingPrice to be created" ,required=true )  @Valid @RequestBody ProductOfferingPriceCreate productOfferingPrice) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOfferingPrice>(objectMapper.readValue("{}", ProductOfferingPrice.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductOfferingPrice>> listProductOfferingPrice(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductOfferingPrice>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOfferingPrice> patchProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductOfferingPrice to be updated" ,required=true )  @Valid @RequestBody ProductOfferingPriceUpdate productOfferingPrice) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOfferingPrice>(objectMapper.readValue("{}", ProductOfferingPrice.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOfferingPrice> retrieveProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOfferingPrice>(objectMapper.readValue("{}", ProductOfferingPrice.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

}
