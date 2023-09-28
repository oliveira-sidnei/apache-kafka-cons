package br.com.kafkaconspoc.dto

import br.com.kafkaconspoc.model.PixStatus
import java.math.BigDecimal
import java.time.LocalDateTime


data class PixDTO (
    val identifier: String,
    var sourceKey: String,
    var destinationKey: String,
    var transferAmount: BigDecimal,
    var transferTime: LocalDateTime,
    var transferStatus: PixStatus
)