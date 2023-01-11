package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)
public class Runner {

    /*
    @runwith projemize cucumber-junit dependency den gelir
    bu sayede dasyalarımız cucumber ile callısır

    @CucucmberOptions notasyonu ile istediğimiz özellikleri Runner class'ına ekleyebiliriz
    raporlama gibiextra option ları da ekleyeceğiz
    features ile stepdefinitions ları ilişkilendiririz

    tags : features folder ı içerisinde yazılan tagları aratıp bulduğu tüm features veya senaryoları çalıştırır

    dryRun iki değer alır true olursa verilen tag ile işaretli olan feature veya senaryodaki eksik step definitions ları bulup
    ilgili methodları olusturur hiçbir sekilde testi calıstırmaz eksik adım yoksa test passed olarak işeretler
     */


}
