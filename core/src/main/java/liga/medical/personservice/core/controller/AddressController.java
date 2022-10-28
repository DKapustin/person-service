package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Integer addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }
}
