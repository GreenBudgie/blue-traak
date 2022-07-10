package com.rubin.bluetraak

import javax.persistence.*

@Entity
@Table(name = "item")
class Item {

    @Id
    @SequenceGenerator(name = "user_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private var id: Long? = null

    private var name: String? = null
    private var description: String? = null
    private var roomName: String? = null
    private var placeName: String? = null

}