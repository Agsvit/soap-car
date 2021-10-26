package com.bootcamp.soapcar.model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "car"
})
@XmlRootElement(name = "getCarResponse")
public class GetCarResponse {

    @XmlElement(required = true)
    protected Car car;
}