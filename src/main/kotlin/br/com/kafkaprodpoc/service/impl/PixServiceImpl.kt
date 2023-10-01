package br.com.kafkaprodpoc.service.impl

import br.com.kafkaprodpoc.dto.PixDTO
import br.com.kafkaprodpoc.mapper.PixMapper
import br.com.kafkaprodpoc.model.PixStatus
import br.com.kafkaprodpoc.repository.PixRepository
import br.com.kafkaprodpoc.service.PixService
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class PixServiceImpl(private val repository: PixRepository, private val kafkaTemplate: KafkaTemplate<String, PixDTO>, private val pixMapper : PixMapper) : PixService{


    override fun savePixTransaction(dtoObject: PixDTO) : PixDTO {
        dtoObject.identifier = UUID.randomUUID().toString()
        dtoObject.transferTime = LocalDateTime.now()
        dtoObject.transferStatus = PixStatus.PROCESSING

        this.repository.save(pixMapper.convertDtoObjectToEntity(dtoObject))
        this.kafkaTemplate.send("pix-topic", dtoObject.identifier, dtoObject)

        return dtoObject
    }
}