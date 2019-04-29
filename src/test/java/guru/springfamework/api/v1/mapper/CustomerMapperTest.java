package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.mapper.CustomerMapper;
import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerMapperTest {

    public static final long ID = 1L;
    private static final String FIRST_NAME ="Michael";
    private static final String LAST_NAME="Weston";
        CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() throws Exception{

        //given
        Customer customer=new Customer();
        customer.setFirstname(FIRST_NAME);
        customer.setLastname(LAST_NAME);
        customer.setId(ID);

        //when
        CustomerDTO customerDTO= customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(Long.valueOf(ID),customerDTO.getId());
        assertEquals(LAST_NAME,customerDTO.getLastname());
        assertEquals(FIRST_NAME,customerDTO.getFirstname());
    }


}