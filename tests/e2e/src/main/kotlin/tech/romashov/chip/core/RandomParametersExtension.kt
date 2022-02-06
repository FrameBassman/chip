package tech.romashov.chip.core

import org.junit.jupiter.api.extension.ParameterResolver
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterResolutionException
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.reflect.Parameter

class RandomParametersExtension : ParameterResolver {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(AnnotationTarget.VALUE_PARAMETER)
    annotation class Random

    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean {
        return parameterContext.isAnnotated(Random::class.java)
    }

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Any {
        return getRandomValue(parameterContext.parameter, extensionContext)
    }

    private fun getRandomValue(parameter: Parameter, extensionContext: ExtensionContext): Any {
        val type = parameter.type
        val random = extensionContext.root.getStore(ExtensionContext.Namespace.GLOBAL) //
                .getOrComputeIfAbsent(java.util.Random::class.java)
        if (Int::class.javaPrimitiveType == type) {
            return random.nextInt()
        }
        if (Double::class.javaPrimitiveType == type) {
            return random.nextDouble()
        }
        throw ParameterResolutionException("No random generator implemented for $type")
    }
}