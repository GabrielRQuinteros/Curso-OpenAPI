package io.swagger.api;

import io.swagger.model.Beer;
import io.swagger.model.BeerOrder;
import io.swagger.model.BeerPageList;
import io.swagger.model.Customer;
import io.swagger.model.CustomerPageList;
import io.swagger.model.LoginRequest;
import io.swagger.model.LoginResponse;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-22T16:13:55.210790119Z[GMT]")
@RestController
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createBeerV1(@Parameter(in = ParameterIn.DEFAULT, description = "Informacion de la cerveza", required=true, schema=@Schema()) @Valid @RequestBody Beer body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createCustomer(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteBeerV1(@Parameter(in = ParameterIn.PATH, description = "Id de Cerveza", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCustomerByIdV1(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Beer> getBeerByIdV1(@Parameter(in = ParameterIn.PATH, description = "Id de Cerveza", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Beer>(objectMapper.readValue("{\n  \"price\" : 0.8008282,\n  \"name\" : \"name\",\n  \"brewery\" : {\n    \"name\" : \"name\",\n    \"location\" : \"location\"\n  },\n  \"style\" : \"ALE\",\n  \"currency\" : \"ARS\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"stock\" : 6\n}", Beer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Beer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Beer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerByIdV1(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{\n  \"firstName\" : \"Gabriel\",\n  \"lastName\" : \"Martinez\",\n  \"address\" : {\n    \"zipCode\" : \"2734\",\n    \"streetName\" : \"San Martin\",\n    \"streetNumber\" : \"2345\",\n    \"city\" : \"San Justo\",\n    \"countryCode\" : \"AR\"\n  },\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BeerPageList> listBeersV1(@Parameter(in = ParameterIn.QUERY, description = "Numero de Pagina" ,schema=@Schema( defaultValue="1")) @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber
,@Parameter(in = ParameterIn.QUERY, description = "Tamaño de Pagina" ,schema=@Schema( defaultValue="30")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue="30") Integer pageSize
,@Parameter(in = ParameterIn.QUERY, description = "Prueba de un Parametro deprecado" ,schema=@Schema()) @Valid @RequestParam(value = "deprecated-parameter", required = false) String deprecatedParameter
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BeerPageList>(objectMapper.readValue("{\n  \"content\" : [ {\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"style\" : \"ALE\",\n    \"currency\" : \"ARS\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"stock\" : 6\n  }, {\n    \"price\" : 0.8008282,\n    \"name\" : \"name\",\n    \"brewery\" : {\n      \"name\" : \"name\",\n      \"location\" : \"location\"\n    },\n    \"style\" : \"ALE\",\n    \"currency\" : \"ARS\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"stock\" : 6\n  } ]\n}", BeerPageList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BeerPageList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BeerPageList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerPageList> listCustomersV1(@Parameter(in = ParameterIn.QUERY, description = "Numero de Pagina" ,schema=@Schema( defaultValue="1")) @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber
,@Parameter(in = ParameterIn.QUERY, description = "Tamaño de Pagina" ,schema=@Schema( defaultValue="30")) @Valid @RequestParam(value = "pageSize", required = false, defaultValue="30") Integer pageSize
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomerPageList>(objectMapper.readValue("{\n  \"content\" : [ {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  }, {\n    \"firstName\" : \"Gabriel\",\n    \"lastName\" : \"Martinez\",\n    \"address\" : {\n      \"zipCode\" : \"2734\",\n      \"streetName\" : \"San Martin\",\n      \"streetNumber\" : \"2345\",\n      \"city\" : \"San Justo\",\n      \"countryCode\" : \"AR\"\n    },\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n  } ]\n}", CustomerPageList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomerPageList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomerPageList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> listInvoicesV1() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LoginResponse> loginV1(@Parameter(in = ParameterIn.DEFAULT, description = "Credenciales de Usuario", required=true, schema=@Schema()) @Valid @RequestBody LoginRequest body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoginResponse>(objectMapper.readValue("{\n  \"expiresIn\" : 3600,\n  \"accessToken\" : \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...\",\n  \"tokenType\" : \"Bearer\",\n  \"user\" : {\n    \"roles\" : [ \"USER\", \"USER\" ],\n    \"id\" : 123,\n    \"username\" : \"gabrielquinteros\"\n  },\n  \"refreshToken\" : \"d2ViLmFwcC5yZWZyZXNoVG9rZW4uLi4u\"\n}", LoginResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoginResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoginResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateBeerV1(@Parameter(in = ParameterIn.PATH, description = "Id de Cerveza", required=true, schema=@Schema()) @PathVariable("beerId") UUID beerId
,@Parameter(in = ParameterIn.DEFAULT, description = "Informacion de la cerveza", required=true, schema=@Schema()) @Valid @RequestBody Beer body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCustomerV1(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Customer body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> v1CustomersCustomerIdOrdersPost(@Parameter(in = ParameterIn.PATH, description = "Customer Id", required=true, schema=@Schema()) @PathVariable("customerId") UUID customerId
,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody BeerOrder body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
