//package ec.edu.espe.bookstore;
//
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//
//public class EstudianteStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario está en la página de gestión de estudiantes")
//    public void elUsuarioEstaEnLaPaginaDeGestionDeEstudiantes() {
//        createPDF("Gestion Estudiantes");
//        addText("Inicio de prueba: el usuario ingresa a la página de gestión de estudiantes");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Estudiante/Index");
//    }
//
//    @When("el usuario agrega un estudiante con nombres {string} y apellidos {string}")
//    public void elUsuarioAgregaUnEstudiante(String nombres, String apellidos) {
//        addText("El usuario agrega un estudiante con nombres: " + nombres + ", apellidos: " + apellidos);
//
//        WebElement btnNuevoEstudiante = driver.findElement(By.id("btnNuevoEstudiante"));
//        btnNuevoEstudiante.click();
//
//        WebElement nombreInput = driver.findElement(By.id("txtNombres"));
//        WebElement apellidoInput = driver.findElement(By.id("txtApellidos"));
//
//        nombreInput.sendKeys(nombres);
//        apellidoInput.sendKeys(apellidos);
//
//        captureScreenShot();
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @Then("el resultado de agregar estudiante es {string}")
//    public void elResultadoDeAgregarEstudianteEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar estudiante");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Estudiante registrado")) {
//                WebElement successAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'Estudiante registrado!')]"));
//                assertEquals("Estudiante registrado!", successAlert.getText().trim());
//                addText("Prueba correcta: Estudiante registrado exitosamente");
//            } else if (resultadoEsperado.equals("Faltan completar datos")) {
//                WebElement errorAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'Faltan completar datos.')]"));
//                assertEquals("Faltan completar datos.", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error esperado por datos incompletos");
//            }
//        } catch (Exception e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//    @When("el usuario edita el estudiante con ID {int} con nombres {string} y apellidos {string}")
//    public void elUsuarioEditaElEstudiante(int idEstudiante, String nombres, String apellidos) {
//        addText("El usuario edita el estudiante con ID: " + idEstudiante + ", nuevos nombres: " + nombres + ", nuevos apellidos: " + apellidos);
//
//        WebElement btnEditarEstudiante = driver.findElement(By.cssSelector(".btn-outline-primary"));
//        btnEditarEstudiante.click();
//
//        WebElement nombreInput = driver.findElement(By.id("txtNombres"));
//        WebElement apellidoInput = driver.findElement(By.id("txtApellidos"));
//
//        nombreInput.clear();
//        apellidoInput.clear();
//
//        nombreInput.sendKeys(nombres);
//        apellidoInput.sendKeys(apellidos);
//
//        captureScreenShot();
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @Then("el resultado de editar estudiante es {string}")
//    public void elResultadoDeEditarEstudianteEs(String resultadoEsperado) {
//        addText("Verificación del resultado de editar estudiante");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Se guardaron los cambios")) {
//                WebElement successAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'Se guardaron los cambios!')]"));
//                assertEquals("Se guardaron los cambios!", successAlert.getText().trim());
//                addText("Prueba correcta: Cambios guardados exitosamente");
//            } else if (resultadoEsperado.equals("No se pudo editar")) {
//                WebElement errorAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'No se pudo editar.')]"));
//                assertEquals("No se pudo editar.", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error esperado al fallar la edición");
//            }
//        } catch (Exception e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//    @When("el usuario elimina el estudiante con ID {int}")
//    public void elUsuarioEliminaElEstudiante(int idEstudiante) {
//        addText("El usuario elimina el estudiante con ID: " + idEstudiante);
//
//        WebElement btnEliminarEstudiante = driver.findElement(By.cssSelector(".btn-outline-danger"));
//        btnEliminarEstudiante.click();
//
//        captureScreenShot();
//        WebElement confirmButton = driver.findElement(By.cssSelector(".swal2-confirm"));
//        confirmButton.click();
//    }
//
//    @Then("el resultado de eliminar estudiante es {string}")
//    public void elResultadoDeEliminarEstudianteEs(String resultadoEsperado) {
//        addText("Verificación del resultado de eliminar estudiante");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Eliminado")) {
//                WebElement successAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'El estudiante fue eliminado.')]"));
//                assertEquals("El estudiante fue eliminado.", successAlert.getText().trim());
//                addText("Prueba correcta: Estudiante eliminado exitosamente");
//            } else if (resultadoEsperado.equals("No se pudo eliminar")) {
//                WebElement errorAlert = driver.findElement(By.xpath("//div[@class='swal2-html-container' and contains(text(),'No se pudo eliminar.')]"));
//                assertEquals("No se pudo eliminar.", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error esperado al fallar la eliminación");
//            }
//        } catch (Exception e) {
//            addText("Prueba fallida: " + e.getMessage());
//            captureScreenShot();
//            fail("Prueba fallida: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//}
