package com.kafka.springboot;

import com.kafka.springboot.entity.WikimediaData;
import com.kafka.springboot.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaDatabaseConsumer.class);

    private WikimediaDataRepository dataRepository;

    public kafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(
        topics = "wikimedia_recentchange",
        groupId = "myGroup"
    )
    public void consumer(String eventMessage){
        LOGGER.info(String.format("Event message received -> %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        dataRepository.save(wikimediaData);
    }

}
