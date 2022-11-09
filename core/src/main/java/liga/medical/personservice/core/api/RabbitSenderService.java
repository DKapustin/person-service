package liga.medical.personservice.core.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import liga.medical.dto.MessageDto;

public interface RabbitSenderService {
    void sendMessage(MessageDto messageDto, String queue) throws JsonProcessingException;

    void sendError(String message);
}
