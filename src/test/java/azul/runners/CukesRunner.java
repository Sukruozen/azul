package azul.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.plugin.Plugin;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
    },
        features = "src/test/resources/features",
        glue = "azul/step_definitions",
        dryRun = true,
        tags = "@smoke",
        publish = false

)
public class CukesRunner {
}


