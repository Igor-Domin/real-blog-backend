package com.domin.realblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class RealBlogApplication

fun main(args: Array<String>) {
    runApplication<RealBlogApplication>(*args)
}