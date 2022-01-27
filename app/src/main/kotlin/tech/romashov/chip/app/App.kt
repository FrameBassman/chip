/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tech.romashov.chip.app

import org.junit.platform.console.options.CommandLineOptions;
import org.junit.platform.console.options.Details;
import org.junit.platform.console.options.Theme;
import org.junit.platform.console.tasks.ConsoleTestExecutor;

import java.io.PrintWriter;
import java.util.Collections;

fun main() {
    val options = CommandLineOptions()
    options.setSelectedClasses(Collections.singletonList("tech.romashov.chip.app.MainSuite"))
    options.setBannerDisabled(true)
    options.setTheme(Theme.UNICODE)
    options.setDetails(Details.TREE)

    ConsoleTestExecutor(options).execute(PrintWriter(System.out))
}
