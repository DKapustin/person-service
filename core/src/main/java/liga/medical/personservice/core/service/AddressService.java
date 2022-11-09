package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.AddressMapper;
import liga.medical.personservice.core.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressMapper addressMapper;

    public AddressService(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public List<Address> getAllAddress() {
        return addressMapper.getAllAddress();
    }

    public Address getAddressById(long id) {
        return addressMapper.getAddressById(id);
    }

    public int addAddress(Address address) { return addressMapper.addAddress(address);}

    public void deleteAddressById(long id){ addressMapper.deleteAddressById(id);}
}
