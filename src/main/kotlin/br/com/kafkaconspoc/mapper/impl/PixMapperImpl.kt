package br.com.kafkaconspoc.mapper.impl

import br.com.kafkaconspoc.dto.PixDTO
import br.com.kafkaconspoc.mapper.PixMapper
import br.com.kafkaconspoc.model.Pix
import org.springframework.stereotype.Component

@Component
class PixMapperImpl: PixMapper {


    override fun convertDtoObjectToEntity(dtoObject: PixDTO): Pix {
        return Pix(
                identifier = dtoObject.identifier,
                sourceKey = dtoObject.sourceKey,
                destinationKey = dtoObject.destinationKey,
                transferAmount = dtoObject.transferAmount,
                transferTime = dtoObject.transferTime,
                transferStatus = dtoObject.transferStatus
        )
    }
}