package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendorMapperTest {

    public static final String HP = "HP";
    public static final long ID = 1L;
    public static final String HP_COM = "HP.com";
    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() throws Exception{
        //Given
        Vendor vendor = new Vendor();
        vendor.setName(HP);
        vendor.setId(ID);

        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        assertEquals(vendor.getName(),vendorDTO.getName());

    }

    @Test
    public void vendorDTOToVendor(){
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(HP);
        vendorDTO.setVendorUrl(HP_COM);

        Vendor vendor = vendorMapper.vendorDTOToVendor(vendorDTO);

        assertEquals(vendorDTO.getName(),vendor.getName());

    }
}
