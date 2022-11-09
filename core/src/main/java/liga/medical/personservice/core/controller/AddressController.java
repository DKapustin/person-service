package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.model.Address;
import liga.medical.personservice.core.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@Api(value = "API for address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    @ApiOperation(value = "get all address")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get address by id")
    public Address getAddressById(@PathVariable long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    @ApiOperation(value = "add new address")
    public Integer addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete address by id")
    public void deleteAddressById(@PathVariable long id){addressService.deleteAddressById(id);}
}
