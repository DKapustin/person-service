package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.ContactMapper;
import liga.medical.personservice.core.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContactMapper contactMapper;

    public ContactService(ContactMapper contactMapper) {
        this.contactMapper = contactMapper;
    }

    public List<Contact> getAllContact() {
        return contactMapper.getAllContact();
    }

    public Contact getContactById(long id) {
        return contactMapper.getContactById(id);
    }

    public int addContact(Contact contact) {
        return contactMapper.addContact(contact);
    }

    public void deleteContractById(long id){ contactMapper.deleteContactById(id);}
}
