package com.jean.springcloudconfigclient.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Service

@Service
@RefreshScope
class DynamicConfigService {

    @Value("\${fund.service.name}")
    lateinit var name: String

    fun getConfig(): Map<String, String> {
        var configMap = hashMapOf<String, String>()
        configMap["name"] = name

        return configMap
    }
}
