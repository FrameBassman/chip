package tech.romashov.chip.app

import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.Suite
import tech.romashov.chip.app.discount.CanAddDiscount
import tech.romashov.chip.app.purchase.CanSellApples

@Suite
@SelectClasses(CanSellApples::class, CanAddDiscount::class)
class MainSuite {
}