package liga.medical.personservice.core.listner;

import liga.medical.personservice.core.api.RabbitRouterService;
import liga.medical.personservice.core.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitRouterListener {
    private final RabbitRouterService rabbitRouterService;

    public RabbitRouterListener(RabbitRouterService rabbitRouterService) {
        this.rabbitRouterService = rabbitRouterService;
    }

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receiveAndRedirectMessage(String message) {
        rabbitRouterService.routeMessage(message);
    }
}
