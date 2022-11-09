package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.MedicalCardMapper;
import liga.medical.personservice.core.model.MedicalCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalCardService {
    private final MedicalCardMapper medicalMapper;

    public MedicalCardService(MedicalCardMapper medicalCardMapper) {
        this.medicalMapper = medicalCardMapper;
    }

    public List<MedicalCard> getAllMedicalCard() {
        return medicalMapper.getAllMedicalCard();
    }

    public MedicalCard getMedicalCardById(long id) {
        return medicalMapper.getMedicalCardById(id);
    }

    public Integer addMedicalCard(MedicalCard medicalCard) {
        return medicalMapper.addMedicalCard(medicalCard);
    }

    public void deleteMedicalCardById(long id){ medicalMapper.deleteMedicalCardById(id);}
}
