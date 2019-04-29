package guru.springfamework.services;


import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.api.v1.model.VendorListDTO;
import guru.springfamework.domain.Vendor;

import java.util.Arrays;
import java.util.List;

public interface VendorService {

    public VendorListDTO getAllVendors();

    VendorDTO getVendorById(Long l);

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id1, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id1, VendorDTO vendorDTO);

    void deleteVendorById(Long l);
}
