package br.com.kafkaconspoc.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "pix_tbl")
class Pix(@Column(name = "pix_ident")
          var identifier: String ? = null,

          @Column(name = "src_key")
          private var sourceKey: String ? = null,

          @Column(name = "dest_key")
          private var destinationKey: String ? = null,

          @Column(name = "transfer_amount")
          private var transferAmount: BigDecimal ? = null,

          @Column(name = "transfer_time")
          private var transferTime: LocalDateTime ? = null,

          @Enumerated(EnumType.STRING)
          @Column(name = "transfer_status")
          private var transferStatus: PixStatus ? = null) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pix_id")
    private var id: Long ? = null



}