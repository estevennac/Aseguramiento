/*package ec.edu.espe.bookstore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LoginStepDefinitions extends BasicStepDefinition {

    @Given("el usuario ingresa a la página de login")
    public void elUsuarioIngresaALaPaginaDeLogin() {
        createPDF("Login");
        addText("Inicio de prueba: el usuario ingresa a la página de login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:12210/Acceso/Login");
    }

    @When("el usuario ingresa datos {string} {string}")
    public void elUsuarioIngresaDatos(String usuario, String contraseña) {
        addText("el usuario ingresa datos usuario: " + usuario + ", contraseña: " + contraseña);

        WebElement usernameInput = driver.findElement(By.name("NombreUsuario"));
        WebElement passwordInput = driver.findElement(By.name("Clave"));

        if (!usuario.isEmpty()) {
            usernameInput.sendKeys(usuario);
        }
        if (!contraseña.isEmpty()) {
            passwordInput.sendKeys(contraseña);
        }
        captureScreenShot();
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Iniciar Sesión']"));
        loginButton.click();
    }

    @Then("el resultado del login es {string}")
    public void elResultadoDelLoginEs(String resultadoEsperado) {
        addText("Verificación del resultado del login");
        wait(2);
        captureScreenShot();

        try {
            if (resultadoEsperado.equals("redirigido")) {
                String currentPage = driver.getCurrentUrl();
                assertEquals("http://localhost:12210/Home/Index", currentPage);
                addText("Prueba correcta: El usuario administrador ingresa de manera correcta a la página principal");
            } else if (resultadoEsperado.equals("No se encontraron coincidencias")) {
                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
                assertEquals("No se encontraron coincidencias", errorAlert.getText().trim());
                addText("Prueba correcta: Se muestra el mensaje de error esperado");
            } else if (resultadoEsperado.equals("Campos vacíos")) {
                WebElement usernameInput = driver.findElement(By.name("NombreUsuario"));
                WebElement passwordInput = driver.findElement(By.name("Clave"));
                assertEquals("true", usernameInput.getAttribute("required"));
                assertEquals("true", passwordInput.getAttribute("required"));
                addText("Prueba correcta: Los campos vacíos muestran los placeholders requeridos");
            } else if (resultadoEsperado.equals("Intento fallido de redirigir")) {
                String currentPage = driver.getCurrentUrl();
                assertEquals("http://localhost:12210/Acceso/Login", currentPage);
                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
                assertEquals("No se encontraron coincidencias", errorAlert.getText().trim());
                addText("Prueba correcta: El intento de redirigir con credenciales incorrectas falló y mostró el mensaje de error esperado");
            }
        } catch (AssertionError e) {
            if (resultadoEsperado.equals("Intento fallido de redirigir")) {
                addText("Prueba Fallida: Intento fallido de ingresar al sistema con credenciales inválidas");
            } else {
                addText("Prueba fallida: " + e.getMessage());
            }
            captureScreenShot();
            fail("Prueba Fallida: Intento fallido de ingresar al sistema con credenciales inválidas");
        } catch (Exception e) {
            addText("Excepción encontrada: " + e.getMessage());
            //captureScreenShot();
            fail("Excepción encontrada: " + e.getMessage());
        } finally {
            wait(1);
            this.driver.quit();
            closePDF();
        }
    }
}

*/