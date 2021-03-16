package br.com.sigo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LegadoKafkaConsumer {

    /*@KafkaListener(topics="agendar-etapa-processo", groupId="my_group_id")
    public void getMessage(String message) throws Exception {
        //chamarSOAPSAPLegado(message);
    }*/

}
