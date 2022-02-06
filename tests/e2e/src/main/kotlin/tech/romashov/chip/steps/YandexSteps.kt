package tech.romashov.chip.steps

import com.codeborne.selenide.Selenide
import tech.romashov.chip.core.TestContext

class YandexSteps(private val context: TestContext) {
    fun openIt() {
        context.address = "https://yandex.ru"
        Selenide.open(context.address)
    }
}