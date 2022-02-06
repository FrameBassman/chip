package tech.romashov.chip.steps

import com.codeborne.selenide.Selenide
import tech.romashov.chip.core.TestContext

class DiscountSteps(private val context: TestContext) {
    fun addDiscount() {
        context.purchasePrice = context.purchasePrice - 2L
    }
}
