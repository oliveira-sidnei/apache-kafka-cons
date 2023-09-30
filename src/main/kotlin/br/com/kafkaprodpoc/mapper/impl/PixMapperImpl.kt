package br.com.kafkaprodpoc.mapper.impl

import br.com.kafkaprodpoc.dto.PixDTO
import br.com.kafkaprodpoc.mapper.PixMapper
import br.com.kafkaprodpoc.model.Pix
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