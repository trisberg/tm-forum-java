/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ProductSpecification;
import io.swagger.model.ProductSpecificationCreate;
import io.swagger.model.ProductSpecificationUpdate;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-28T13:08:23.907Z")

@Validated
@Api(value = "productSpecification", description = "the productSpecification API")
@RequestMapping(value = "/tmf-api/productCatalogManagement/v4/")
public interface ProductSpecificationApi {

    @ApiOperation(value = "Creates a ProductSpecification", nickname = "createProductSpecification", notes = "This operation creates a ProductSpecification entity.", response = ProductSpecification.class, tags={ "productSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<ProductSpecification> createProductSpecification(@ApiParam(value = "The ProductSpecification to be created" ,required=true )  @Valid @RequestBody ProductSpecificationCreate productSpecification);


    @ApiOperation(value = "Deletes a ProductSpecification", nickname = "deleteProductSpecification", notes = "This operation deletes a ProductSpecification entity.", tags={ "productSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find ProductSpecification objects", nickname = "listProductSpecification", notes = "This operation list or find ProductSpecification entities", response = ProductSpecification.class, responseContainer = "List", tags={ "productSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<ProductSpecification>> listProductSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a ProductSpecification", nickname = "patchProductSpecification", notes = "This operation updates partially a ProductSpecification entity.", response = ProductSpecification.class, tags={ "productSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<ProductSpecification> patchProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductSpecification to be updated" ,required=true )  @Valid @RequestBody ProductSpecificationUpdate productSpecification);


    @ApiOperation(value = "Retrieves a ProductSpecification by ID", nickname = "retrieveProductSpecification", notes = "This operation retrieves a ProductSpecification entity. Attribute selection is enabled for all first level attributes.", response = ProductSpecification.class, tags={ "productSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<ProductSpecification> retrieveProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}
