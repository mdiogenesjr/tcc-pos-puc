package net.techtter.springkafkadocker.springkafkadockerint.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LegadoKafkaConsumer {

    @KafkaListener(topics="separar-material", groupId="my_group_id")
    public void getMessage(String message){

        System.out.println(message);
        //chamar interface rest do legado.

    }
}
