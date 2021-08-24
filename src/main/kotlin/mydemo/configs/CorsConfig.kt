package mydemo.configs

import mydemo.configs.properties.CorsOrigins
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig (val corsProperties: CorsOrigins) {

    @Bean
    fun addCorsConfig(): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                val allowedOrigins = corsProperties.originPatterns.split(",").toTypedArray()
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOriginPatterns(*allowedOrigins)
                        .allowCredentials(true)
            }
        }
    }
}