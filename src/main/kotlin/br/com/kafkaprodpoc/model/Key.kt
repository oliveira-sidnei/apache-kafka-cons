package br.com.kafkaprodpoc.model

import jakarta.persistence.*
import lombok.Getter

@Entity
@Table(name = "key_tbl")
@Getter
class Key {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "key_id")
    var id: Long? = null

    @Column(name = "key_val")
    var keyValue: String? = null

}