package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.IllnessMapper;
import liga.medical.personservice.core.model.Illness;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IllnessService {

    private IllnessMapper illnessMapper;

    public IllnessService(IllnessMapper illnessMapper) {
        this.illnessMapper = illnessMapper;
    }

    public List<Illness> getAllIllness() {
        return illnessMapper.getAllIllness();
    }

    public Illness getIllnessById(long id) {
        return illnessMapper.getIllnessById(id);
    }

    public int addIllness(Illness illness) {
        return illnessMapper.addIllness(illness);
    }
}
