package tech.romashov.chip.steps

import com.codeborne.selenide.Selenide
import tech.romashov.chip.core.TestContext

class YaSteps (private val context: TestContext) {
    fun openIt() {
        context.address = "https://ya.ru"
        Selenide.open(context.address)
    }

    fun getAddress(): String {
        return context.address
    }
}