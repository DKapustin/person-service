package liga.medical.personservice.core.listner;

import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.dto.MessageDto;
import liga.medical.dto.MessageType;
import liga.medical.personservice.core.api.RabbitRouterService;
import liga.medical.personservice.core.api.RabbitSenderService;
import liga.medical.personservice.core.model.QueueNames;
import org.springframework.stereotype.Service;

@Service
public class RabbitRouterServiceImpl implements RabbitRouterService {
    private final ObjectMapper objectMapper;
    private final RabbitSenderService rabbitSenderService;

    public RabbitRouterServiceImpl(ObjectMapper objectMapper, RabbitSenderService rabbitSenderService) {
        this.objectMapper = objectMapper;
        this.rabbitSenderService = rabbitSenderService;
    }

    @Override
    public void routeMessage(String message) {
        try {
            MessageDto messageDto = objectMapper.readValue(message, MessageDto.class);
            MessageType messageType = messageDto.getMessageType();
            switch (messageType) {
                case DAILY:
                    rabbitSenderService.sendMessage(messageDto, QueueNames.DAILY_QUEUE_NAME);
                    break;
                case ALERT:
                    rabbitSenderService.sendMessage(messageDto, QueueNames.ALERT_QUEUE_NAME);
                    break;
                case ERROR:
                    rabbitSenderService.sendMessage(messageDto, QueueNames.ERROR_QUEUE_NAME);
                    break;
                default:
                    return;
            }
        } catch (Exception e) {
            rabbitSenderService.sendError(e.getMessage());
        }
    }
}
