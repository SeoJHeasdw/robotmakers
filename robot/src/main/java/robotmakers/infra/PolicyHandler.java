package robotmakers.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import robotmakers.config.kafka.KafkaProcessor;
import robotmakers.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    InventoryRepository inventoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InstallStarted'"
    )
    public void wheneverInstallStarted_DecreaseStock(
        @Payload InstallStarted installStarted
    ) {
        InstallStarted event = installStarted;
        System.out.println(
            "\n\n##### listener DecreaseStock : " + installStarted + "\n\n"
        );

        // Sample Logic //
        Inventory.decreaseStock(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
