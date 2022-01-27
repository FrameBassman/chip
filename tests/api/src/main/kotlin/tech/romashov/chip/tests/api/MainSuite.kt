package tech.romashov.chip.tests.api

import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.Suite
import tech.romashov.chip.tests.api.discount.CanAddDiscount
import tech.romashov.chip.tests.api.purchase.CanSellApples

@Suite
@SelectClasses(CanSellApples::class, CanAddDiscount::class)
class MainSuite {
}
