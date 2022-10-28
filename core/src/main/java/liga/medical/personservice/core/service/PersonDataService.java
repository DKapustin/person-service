package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.PersonDataMapper;
import liga.medical.personservice.core.model.PersonData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonDataService {
    private PersonDataMapper personDataMapper;

    public PersonDataService(PersonDataMapper personDataMapper) {
        this.personDataMapper = personDataMapper;
    }

    public List<PersonData> getAllPersonData() {
        return personDataMapper.getAllPersonData();
    }

    public PersonData getPersonDataById(long id) {
        return personDataMapper.getPersonDataById(id);
    }

    public int addPersonData(PersonData personData) {
        return personDataMapper.addPersonData(personData);
    }
}
