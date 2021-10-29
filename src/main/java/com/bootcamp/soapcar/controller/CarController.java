package com.bootcamp.soapcar.controller;

import com.bootcamp.soapcar.model.GetCarRequest;
import com.bootcamp.soapcar.model.GetCarResponse;
import com.bootcamp.soapcar.service.CarService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @PayloadRoot(namespace = "http://bootcamp.com/", localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.findCarByName(request.getPlate()));
        return response;
    }

}
