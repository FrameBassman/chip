package tech.romashov.chip.steps

import tech.romashov.chip.core.TestContext

class SellApplesSteps(private val context: TestContext) {
    fun addApple() {
        context.purchasePrice = context.purchasePrice + 5L
    }
}