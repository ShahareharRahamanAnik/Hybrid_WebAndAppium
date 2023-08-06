

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/1AddCustomer.feature",
        "src/test/resources/Feature/2OpenAccount.feature",
        "src/test/resources/Feature/3CustomerLogIn.feature",
        "src/test/resources/Feature/4CustomerDelete.feature",
        "src/test/resources/Feature/5Android.feature",
        "src/test/resources/Feature/6Andriod.feature",
        "src/test/resources/Feature/7Andriod.feature",
        "src/test/resources/Feature/8Andriod.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/feature.html"
        }
        )

@Test
class CucomberRunner extends AbstractTestNGCucumberTests{
        }
