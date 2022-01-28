package tech.romashov.chip.tests.e2e

import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.Suite
import tech.romashov.chip.tests.e2e.discount.CanAddDiscount
import tech.romashov.chip.tests.e2e.purchase.CanSellApples

@Suite
@SelectClasses(
        CanSellApples::class,
        CanAddDiscount::class
)
class MainSuite {
}