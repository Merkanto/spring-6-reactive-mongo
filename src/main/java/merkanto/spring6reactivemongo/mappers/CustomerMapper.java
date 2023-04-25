package merkanto.spring6reactivemongo.mappers;

import merkanto.spring6reactivemongo.domain.Customer;
import merkanto.spring6reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}
