package br.com.kafkaprodpoc.service.impl

import br.com.kafkaprodpoc.dto.PixDTO
import br.com.kafkaprodpoc.mapper.PixMapper
import br.com.kafkaprodpoc.repository.PixRepository
import br.com.kafkaprodpoc.service.PixService
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