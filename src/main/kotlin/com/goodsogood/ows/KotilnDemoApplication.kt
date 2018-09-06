package com.goodsogood.ows

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class KotilnDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotilnDemoApplication::class.java, *args)
}
