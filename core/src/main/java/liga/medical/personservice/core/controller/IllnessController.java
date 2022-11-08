package liga.medical.personservice.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.service.IllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/illness")
@Api(value = "API for illness")
public class IllnessController {
    private IllnessService illnessService;

    @Autowired
    public IllnessController(IllnessService illnessService) {
        this.illnessService = illnessService;
    }

    @GetMapping
    @ApiOperation(value = "get all illness")
    public List<Illness> getAllIllness() {
        return illnessService.getAllIllness();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get illness by id")
    public Illness getIllnessById(@PathVariable long id) {
        return illnessService.getIllnessById(id);
    }

    @PostMapping
    @ApiOperation(value = "add new illness")
    public Integer addIllness(@RequestBody Illness illness) {
        return illnessService.addIllness(illness);
    }
}
