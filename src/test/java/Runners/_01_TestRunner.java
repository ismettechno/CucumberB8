package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    features = {"src/test/java/FeatureFiles/_01_Login.feature"},  //buraya feature files ın path i verilecek.
    glue = {"StepDefinitions"}    // Step definitions ın klasörü adı yazılıyor.
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
    //Bu class tiplerine Runner Class lar denir.
}

// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.