package br.com.kafkaprodpoc.dto

import br.com.kafkaprodpoc.model.PixStatus
import java.math.BigDecimal
import java.time.LocalDateTime


data class PixDTO (
    var identifier: String,
    var sourceKey: String,
    var destinationKey: String,
    var transferAmount: BigDecimal,
    var transferTime: LocalDateTime,
    var transferStatus: PixStatus
)