package com.rubin.bluetraak

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/api/item")
class ItemController @Autowired constructor(
    private val itemRepository: ItemRepository
){

    @PostMapping
    fun addItem(@RequestBody item: Item) {
        itemRepository.save(item)
    }

    @DeleteMapping
    fun removeItem(@RequestParam("id") id: Long) {
        itemRepository.deleteById(id)
    }

    @PutMapping
    fun updateItem(@RequestBody item: Item) {
        itemRepository.save(item)
    }

    @GetMapping
    fun getItem(@RequestParam("id") id: Long): Item {
        return itemRepository.findById(id).get()
    }

}