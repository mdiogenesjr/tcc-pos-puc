package br.com.sigo.consumer;

import br.com.sigo.service.Rotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LegadoKafkaConsumer {

    @Autowired
    private Rotas rota;

    @KafkaListener(topics="agendar-etapa-processo", groupId="my_group_id")
    public void getMessage(String message){
        //chamarSOAPSAPLegado(message);
    }

}
