package com.psa.springmvcrest.api.v1.mapper;

import com.psa.springmvcrest.api.v1.model.VendorDTO;
import com.psa.springmvcrest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by PSA at 7/3/2021
 */
@Mapper
public interface VendorMapper {
    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
