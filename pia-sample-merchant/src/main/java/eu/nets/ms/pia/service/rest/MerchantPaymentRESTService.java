package eu.nets.ms.pia.service.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import eu.nets.ms.pia.service.model.PaymentMethods;
import eu.nets.ms.pia.service.model.PaymentProcessResponse;
import eu.nets.ms.pia.service.model.PaymentRegisterRequest;
import eu.nets.ms.pia.service.model.PaymentRegisterResponse;
import eu.nets.ms.pia.service.model.ProcessingError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value = "payment")
@Path("payment")
public interface MerchantPaymentRESTService {
    static final String API_VERSION="1.2";
    
    
    @Path("/{merchantId : (([^/])+/)?}register")
    @Produces({ "application/vnd.nets.pia.v"+API_VERSION+"+json;charset=utf-8"})
    @Consumes({ "application/vnd.nets.pia.v"+API_VERSION+"+json;charset=utf-8"})
    @POST 
    @ApiOperation(value = "Registers a payment request")
    @ApiResponses(value = { 
    		@ApiResponse(code = 201, message = "Payment request created OK", response = PaymentRegisterResponse.class),
    		@ApiResponse(code = 400, message = "The server did not understand or could not validate the input parameters.", response = ProcessingError.class),
            @ApiResponse(code = 500, message = "Error processing the request. Try again later.", response = ProcessingError.class),
    		@ApiResponse(code = 503, message = "Downstream PSP error.", response = ProcessingError.class)
    		})
    public Response register(@ApiParam(value = "Payment request", required = true)PaymentRegisterRequest request, @PathParam("merchantId") String merchantId, @Context HttpServletRequest httpServletRequest);
   
    
    
    @Path("/{merchantId : (([^/])+/)?}{transactionId}/commit")
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8;version="+API_VERSION})
    @PUT 
    @ApiOperation(value = "Performs the payment")
    @ApiResponses(value = { 
    		@ApiResponse(code = 202, message = "Payment processing started OK",response = PaymentProcessResponse.class),
    		@ApiResponse(code = 404, message = "Payment not found.", response = ProcessingError.class),
            @ApiResponse(code = 500, message = "Error processing the request. Try again later.", response = ProcessingError.class),
    		@ApiResponse(code = 503, message = "Downstream PSP error.", response = ProcessingError.class)
    		})
    public Response commitPayment(@PathParam(value = "transactionId")String paymentId, @PathParam("merchantId") String merchantId, @Context HttpServletRequest httpServletRequest);
   
    @Path("/{merchantId : (([^/])+/)?}{transactionId}/rollback")
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8;version="+API_VERSION})
    @DELETE
    @ApiOperation(value = "")
    @ApiResponses(value = { 
    		@ApiResponse(code = 204, message = "Payment deleted"),
    		@ApiResponse(code = 404, message = "Payment not found.", response = ProcessingError.class),
            @ApiResponse(code = 500, message = "Error processing the request. Try again later.", response = ProcessingError.class),
    		@ApiResponse(code = 503, message = "Downstream PSP error.", response = ProcessingError.class)
    		})
    public Response rollbackPayment(@PathParam(value = "transactionId")String paymentId, @PathParam("merchantId") String merchantId, @Context HttpServletRequest httpServletRequest);
    
    @Path("/{merchantId : (([^/])+/)?}{transactionId}/storecard")
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8;version="+API_VERSION})
    @PUT 
    @ApiOperation(value = "Validates a card and stores for future use")
    @ApiResponses(value = { 
    		@ApiResponse(code = 202, message = "Card stored OK",response = PaymentProcessResponse.class),
            @ApiResponse(code = 404, message = "Transaction not found.", response = ProcessingError.class),
            @ApiResponse(code = 500, message = "Error processing the request. Try again later.", response = ProcessingError.class),
            @ApiResponse(code = 503, message = "Downstream PSP error.", response = ProcessingError.class)
            })
    public Response validateAndStoreCard(@PathParam(value = "transactionId")String paymentId, @PathParam("merchantId") String merchantId, @Context HttpServletRequest httpServletRequest);

    @Path("/methods")
    @Produces({ MediaType.APPLICATION_JSON + ";charset=utf-8;version="+API_VERSION})
    @GET 
    @ApiOperation(value = "Retrieves supported payment methods")
    @ApiResponses(value = { 
    		@ApiResponse(code = 200, message = "List created ok", response = PaymentMethods.class),
    		@ApiResponse(code = 400, message = "The server did not understand or could not validate the input parameters.", response = ProcessingError.class),
            @ApiResponse(code = 500, message = "Error processing the request. Try again later.", response = ProcessingError.class)
    		})
    public Response getPaymentMethods(@ApiParam(value = "Id of enrolled consumer") @QueryParam("consumerId") String consumerId, @Context HttpServletRequest httpServletRequest);
    }
