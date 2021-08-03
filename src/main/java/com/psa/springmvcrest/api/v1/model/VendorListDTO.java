package com.psa.springmvcrest.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by PSA at 7/3/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {
    private List<VendorDTO> vendors;
}
