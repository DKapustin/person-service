package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/person_data")
public class PersonDataController {

    private PersonDataService personDataService;

    @Autowired
    public PersonDataController(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping
    public List<PersonData> getAllPersonData() {
        return personDataService.getAllPersonData();
    }

    @GetMapping("/{id}")
    public PersonData getPersonDataById(@PathVariable long id) {
        return personDataService.getPersonDataById(id);
    }

    @PostMapping
    public Integer addPersonData(@RequestBody PersonData personData) {
        return personDataService.addPersonData(personData);
    }
}
