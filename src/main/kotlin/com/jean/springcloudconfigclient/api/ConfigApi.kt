package com.jean.springcloudconfigclient.api

import com.jean.springcloudconfigclient.service.DynamicConfigService
import com.jean.springcloudconfigclient.service.StaticConfigService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigApi(
    private val staticConfigService: StaticConfigService,
    private val dynamicConfigService: DynamicConfigService
) {

    @GetMapping("/static")
    fun getConfigFromStatic(): Map<String, String> {
        return staticConfigService.getConfig()
    }

    @GetMapping("/dynamic")
    fun getConfigFromDynamic(): Map<String, String> {
        return dynamicConfigService.getConfig()
    }
}
