package tech.romashov.chip.tests.e2e.discount

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestReporter
import org.junit.jupiter.api.extension.ExtendWith
import tech.romashov.chip.core.Store
import tech.romashov.chip.core.TestContext
import tech.romashov.chip.core.TestContextResolver
import tech.romashov.chip.steps.DiscountSteps
import tech.romashov.chip.steps.SellApplesSteps
import tech.romashov.chip.steps.YaSteps
import tech.romashov.chip.steps.YandexSteps

@ExtendWith(TestContextResolver::class)
class CanAddDiscount {
    val context: TestContext
    val yandexSteps: YandexSteps
    val yaSteps: YaSteps
    val sellApplesSteps: SellApplesSteps
    val discountSteps: DiscountSteps

    constructor(@Store testContext: TestContext) {
        context = testContext
        yandexSteps = YandexSteps(context)
        yaSteps = YaSteps(context)
        sellApplesSteps = SellApplesSteps(context)
        discountSteps = DiscountSteps(context)
    }

    @Test
    fun openBrowser_canAddDiscount(logger: TestReporter) {
        logger.publishEntry("want to open browser")
        sellApplesSteps.addApple()
        sellApplesSteps.addApple()
        discountSteps.addDiscount()
        assertThat(context.purchasePrice, equalTo(8L))
    }
}
