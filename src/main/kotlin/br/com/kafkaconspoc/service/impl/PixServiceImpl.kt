package br.com.kafkaconspoc.service.impl

import br.com.kafkaconspoc.dto.PixDTO
import br.com.kafkaconspoc.mapper.PixMapper
import br.com.kafkaconspoc.repository.PixRepository
import br.com.kafkaconspoc.service.PixService
import lombok.RequiredArgsConstructor
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class PixServiceImpl(private val repository: PixRepository, private val kafkaTemplate: KafkaTemplate<String, PixDTO>, private val pixMapper : PixMapper) : PixService{


    override fun savePixTransaction(dtoObject: PixDTO) : PixDTO {
        this.repository.save(pixMapper.convertDtoObjectToEntity(dtoObject))
        this.kafkaTemplate.send("pix-topic", dtoObject.identifier, dtoObject)

        return dtoObject
    }
}