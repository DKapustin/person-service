package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person_data")
@Api(value = "API for person data")
public class PersonDataController {

    private PersonDataService personDataService;

    @Autowired
    public PersonDataController(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping
    @ApiOperation(value = "get all person data")
    public List<PersonData> getAllPersonData() {
        return personDataService.getAllPersonData();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get person data by id")
    public PersonData getPersonDataById(@PathVariable long id) {
        return personDataService.getPersonDataById(id);
    }

    @PostMapping
    @ApiOperation(value = "add new person data")
    public Integer addPersonData(@RequestBody PersonData personData) {
        return personDataService.addPersonData(personData);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete person data by id")
    public void deletePersonDataById(@PathVariable long id) { personDataService.deletePersonDataById(id);}
}
