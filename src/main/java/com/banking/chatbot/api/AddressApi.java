package com.banking.chatbot.api;

import com.banking.chatbot.model.Address;
import com.banking.chatbot.model.InlineResponse404;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-04-16T10:05:25.431528963Z[GMT]")
@Validated
public interface AddressApi {

    @Operation(summary = "Get the address for a specific account", description = "Retrieve the address information associated with a specific account", tags={ "Address" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Address information successfully retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))),
            @ApiResponse(responseCode = "404", description = "Account not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse404.class))) })
    @RequestMapping(value = "/accounts/{accountNumber}/address",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Address> getAddress(
            @Parameter(in = ParameterIn.PATH, description = "The account number for which to retrieve the address", required=true, schema=@Schema()) @PathVariable("accountNumber") String accountNumber
    );
}
