package liga.medical.personservice.core.listner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.dto.MessageDto;
import liga.medical.personservice.core.api.RabbitSenderService;
import liga.medical.personservice.core.model.QueueNames;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitSenderServiceImpl implements RabbitSenderService {
    private final AmqpTemplate amqpTemplate;
    private final ObjectMapper objectMapper;

    public RabbitSenderServiceImpl(AmqpTemplate amqpTemplate, ObjectMapper objectMapper) {
        this.amqpTemplate = amqpTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    public void sendMessage(MessageDto messageDto, String queue) throws JsonProcessingException {
        String message = objectMapper.writeValueAsString(messageDto);
        amqpTemplate.convertAndSend(queue, message);
        System.out.println("Сообщение " + message + " отправлено в очередь: " + queue);
    }

    @Override
    public void sendError(String message) {
        amqpTemplate.convertAndSend(QueueNames.ERROR_QUEUE_NAME, message);
        System.out.println("Сообщение об ошибке " + message + " отправлено в очередь: " + QueueNames.ERROR_QUEUE_NAME);
    }
}
