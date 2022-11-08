package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.service.MedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/medical_card")
@Api(value = "API for medical card")
public class MedicalCardController {

    private MedicalCardService medicalCardService;

    @Autowired
    public MedicalCardController(MedicalCardService medicalCardService) {
        this.medicalCardService = medicalCardService;
    }

    @GetMapping
    @ApiOperation(value = "get all medical card")
    public List<MedicalCard> getAllMedicalCard() {
        return medicalCardService.getAllMedicalCard();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get medical card by id")
    public MedicalCard getMedicalCardById(@PathVariable long id) {
        return medicalCardService.getMedicalCardById(id);
    }

    @PostMapping
    @ApiOperation(value = "add new medical card")
    public Integer addMedicalCard(@RequestBody MedicalCard medicalCard) {
        return medicalCardService.addMedicalCard(medicalCard);
    }
}
