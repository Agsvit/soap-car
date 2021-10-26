package com.bootcamp.soapcar.model;

import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plate"
})
@XmlRootElement(name = "getCarRequest")
public class GetCarRequest {

    @XmlElement(required = true)
    protected int plate;
}