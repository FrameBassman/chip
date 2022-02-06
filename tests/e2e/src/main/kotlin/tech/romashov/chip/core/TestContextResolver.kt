package tech.romashov.chip.core

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver

class TestContextResolver : ParameterResolver {
    var context: TestContext = TestContext()

    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean {
        return parameterContext.isAnnotated(Store::class.java)
    }

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): TestContext {
        return context
//        return extensionContext.root.getStore(ExtensionContext.Namespace.GLOBAL) //
//                .getOrComputeIfAbsent(TestContext::class.java)
    }
}