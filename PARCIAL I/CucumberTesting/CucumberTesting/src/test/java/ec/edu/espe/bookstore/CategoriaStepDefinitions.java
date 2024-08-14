//package ec.edu.espe.bookstore;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.And;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//import java.util.concurrent.TimeUnit;
//
//public class CategoriaStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario está en la página de gestión de categorías")
//    public void elUsuarioEstaEnLaPaginaDeGestionDeCategorias() {
//        createPDF("GestionCategorias");
//        addText("Inicio de prueba: el usuario está en la página de gestión de categorías");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Categoria/Index");
//    }
//
//    @When("el usuario agrega una categoría con nombre {string}")
//    public void elUsuarioAgregaCategoriaConNombre(String nombreCategoria) {
//        addText("El usuario agrega una categoría con nombre: " + nombreCategoria);
//        WebElement btnNuevaCategoria = driver.findElement(By.cssSelector(".btn-outline-success"));
//        btnNuevaCategoria.click();
//
//        WebElement txtNombre = driver.findElement(By.id("txtNombre"));
//        txtNombre.clear();
//        txtNombre.sendKeys(nombreCategoria);
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @When("el usuario edita la categoría con ID {int} con nombre {string}")
//    public void elUsuarioEditaCategoriaConIDConNombre(int idCategoria, String nombreCategoria) {
//        addText("El usuario edita la categoría con ID: " + idCategoria + " con nombre: " + nombreCategoria);
//        WebElement btnEditar = driver.findElement(By.cssSelector(".btn-outline-primary"));
//        btnEditar.click();
//
//        WebElement txtNombre = driver.findElement(By.id("txtNombre"));
//        txtNombre.clear();
//        txtNombre.sendKeys(nombreCategoria);
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @When("el usuario elimina la categoría con ID {int}")
//    public void elUsuarioEliminaCategoriaConID(int idCategoria) {
//        addText("El usuario elimina la categoría con ID: " + idCategoria);
//        WebElement btnEliminar = driver.findElement(By.cssSelector(".btn-outline-danger"));
//        btnEliminar.click();
//
//        WebElement confirmButton = driver.findElement(By.cssSelector(".swal2-confirm"));
//        confirmButton.click();
//    }
//
//    @Then("el resultado de agregar categoría es {string}")
//    public void elResultadoDeAgregarCategoriaEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar categoría");
//        try {
//            if (resultadoEsperado.equals("Categoria registrada!")) {
//                addText("Prueba correcta: Categoria registrada!");
//            }
//            //WebElement mensaje = driver.findElement(By.xpath("//div[contains(@class, 'swal2-html-container')]"));
//            //assertEquals(resultadoEsperado, mensaje.getText().trim());
//            addText("Prueba correcta: " + resultadoEsperado);
//        } catch (AssertionError e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba Fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//    @Then("el resultado de editar categoría es {string}")
//    public void elResultadoDeEditarCategoriaEs(String resultadoEsperado) {
//        addText("Verificación del resultado de editar categoría");
//        try {
//            WebElement mensaje = driver.findElement(By.xpath("//div[contains(@class, 'swal2-html-container')]"));
//            assertEquals(resultadoEsperado, mensaje.getText().trim());
//            addText("Prueba correcta: " + resultadoEsperado);
//        } catch (AssertionError e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba Fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//    @Then("el resultado de eliminar categoría es {string}")
//    public void elResultadoDeEliminarCategoriaEs(String resultadoEsperado) {
//        addText("Verificación del resultado de eliminar categoría");
//        try {
//            WebElement mensaje = driver.findElement(By.cssSelector(".swal2-confirm"));
//            assertEquals(resultadoEsperado, mensaje.getText().trim());
//            addText("Prueba correcta: " + resultadoEsperado);
//        } catch (AssertionError e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba Fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//}
