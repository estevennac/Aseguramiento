package ec.edu.espe.bookstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LibroStepDefinitions {

    WebDriver driver;

    @Given("el usuario está en la página de gestión de libros")
    public void elUsuarioEstaEnLaPaginaDeGestionDeLibros() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost:12210/Libro/Index");
    }

    @When("el usuario agrega un libro con código {string}, título {string}, autor {string}, categoría {string} y fecha de publicación {string}")
    public void elUsuarioAgregaUnLibro(String codigo, String titulo, String autor, String categoria, String fechaPublicacion) {
        WebElement btnNuevoLibro = driver.findElement(By.id("btnNuevoLibro"));
        btnNuevoLibro.click();

        WebElement codigoInput = driver.findElement(By.id("txtCodigo"));
        WebElement tituloInput = driver.findElement(By.id("txtTitulo"));
        WebElement autorInput = driver.findElement(By.id("txtAutor"));
        WebElement categoriaSelect = driver.findElement(By.id("cboCategoria"));
        WebElement fechaPublicacionInput = driver.findElement(By.id("txtFechaPublicacion"));
        WebElement cantidadInput = driver.findElement(By.id("txtCantidad"));

        codigoInput.sendKeys(codigo);
        tituloInput.sendKeys(titulo);
        autorInput.sendKeys(autor);
        categoriaSelect.sendKeys(categoria);  // Ajuste según sea necesario
        fechaPublicacionInput.sendKeys(fechaPublicacion);
        cantidadInput.sendKeys("1"); // Ajustar si se requiere

        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
        btnGuardar.click();
    }

    @Then("el resultado de agregar libro es {string}")
    public void elResultadoDeAgregarLibroEs(String resultadoEsperado) {
        WebElement alert = driver.findElement(By.cssSelector(".swal2-html-container"));
        String mensaje = alert.getText().trim();

        if (resultadoEsperado.equals("Libro registrado!")) {
            assertEquals("Libro registrado!", mensaje);
        } else if (resultadoEsperado.equals("Faltan completar datos")) {
            assertEquals("Faltan completar datos.", mensaje);
        } else {
            fail("Resultado inesperado: " + resultadoEsperado);
        }
    }

    @When("el usuario edita el libro con ID {int} con código {string}, título {string}, autor {string}, categoría {string} y fecha de publicación {string}")
    public void elUsuarioEditaElLibro(int idLibro, String codigo, String titulo, String autor, String categoria, String fechaPublicacion) {
        WebElement btnEditarLibro = driver.findElement(By.cssSelector(".btn-outline-primary")); // Se debe ajustar el selector si hay múltiples botones
        btnEditarLibro.click();

        WebElement codigoInput = driver.findElement(By.id("txtCodigo"));
        WebElement tituloInput = driver.findElement(By.id("txtTitulo"));
        WebElement autorInput = driver.findElement(By.id("txtAutor"));
        WebElement categoriaSelect = driver.findElement(By.id("cboCategoria"));
        WebElement fechaPublicacionInput = driver.findElement(By.id("txtFechaPublicacion"));
        WebElement cantidadInput = driver.findElement(By.id("txtCantidad"));

        codigoInput.clear();
        tituloInput.clear();
        autorInput.clear();
        fechaPublicacionInput.clear();
        cantidadInput.clear();

        codigoInput.sendKeys(codigo);
        tituloInput.sendKeys(titulo);
        autorInput.sendKeys(autor);
        categoriaSelect.sendKeys(categoria);  // Ajuste según sea necesario
        fechaPublicacionInput.sendKeys(fechaPublicacion);
        cantidadInput.sendKeys("1"); // Ajustar si se requiere

        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
        btnGuardar.click();
    }

    @Then("el resultado de editar libro es {string}")
    public void elResultadoDeEditarLibroEs(String resultadoEsperado) {
        WebElement alert = driver.findElement(By.cssSelector(".swal2-html-container"));
        String mensaje = alert.getText().trim();

        if (resultadoEsperado.equals("Se guardaron los cambios")) {
            assertEquals("Se guardaron los cambios!", mensaje);
        } else if (resultadoEsperado.equals("No se pudo editar")) {
            assertEquals("No se pudo editar.", mensaje);
        } else {
            fail("Resultado inesperado: " + resultadoEsperado);
        }
    }

    @When("el usuario elimina el libro con ID {int}")
    public void elUsuarioEliminaElLibro(int idLibro) {
        WebElement btnEliminarLibro = driver.findElement(By.cssSelector(".btn-outline-danger")); // Se debe ajustar el selector si hay múltiples botones
        btnEliminarLibro.click();

        WebElement confirmButton = driver.findElement(By.cssSelector(".swal2-confirm"));
        confirmButton.click();
    }

    @Then("el resultado de eliminar libro es {string}")
    public void elResultadoDeEliminarLibroEs(String resultadoEsperado) {
        WebElement alert = driver.findElement(By.cssSelector(".swal2-html-container"));
        String mensaje = alert.getText().trim();

        if (resultadoEsperado.equals("El libro fue eliminado.")) {
            assertEquals("El libro fue eliminado.", mensaje);
        } else if (resultadoEsperado.equals("No se pudo eliminar")) {
            assertEquals("No se pudo eliminar.", mensaje);
        } else {
            fail("Resultado inesperado: " + resultadoEsperado);
        }
    }
}
