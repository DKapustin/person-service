package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.model.Contact;
import liga.medical.personservice.core.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
@Api(value = "API for contact")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    @ApiOperation(value = "get all contact")
    public List<Contact> getAllContact() {
        return contactService.getAllContact();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get contact by id")
    public Contact getContactById(@PathVariable long id) {
        return contactService.getContactById(id);
    }

    @PostMapping
    @ApiOperation(value = "add new contact")
    public Integer addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete contact by id")
    public void deleteContactById(@PathVariable long id) { contactService.deleteContractById(id);}
}
