/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tech.romashov.tests.e2e

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import tech.romashov.chip.tests.e2e.Library

class LibraryTest {
    @Test
    fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}
