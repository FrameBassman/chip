package tech.romashov.chip.tests.e2e.discount

import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.Test

class CanAddDiscount {
    @Test
    fun openBrowser_canAddDiscount() {
        Selenide.open("https://ya.ru")
    }
}