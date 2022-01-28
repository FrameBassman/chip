package tech.romashov.chip.tests.e2e.purchase

import com.codeborne.selenide.Selenide
import org.junit.jupiter.api.Test

class CanSellApples {
    @Test
    fun openBrowser_sellApples() {
        Selenide.open("https://ya.ru")
    }
}