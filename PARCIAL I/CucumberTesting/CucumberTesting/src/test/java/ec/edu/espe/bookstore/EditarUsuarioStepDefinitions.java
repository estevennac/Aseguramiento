///*package ec.edu.espe.bookstore;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//
//public class EditarUsuarioStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario accede a la página de gestión de usuarios")
//    public void elUsuarioAccedeALaPaginaDeGestionDeUsuarios() {
//        createPDF("ActualizarUsuarios");
//        addText("Inicio de prueba: el usuario accede a la página de gestión de usuarios");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Usuario/Index");
//        captureScreenShot();
//    }
//
//    @When("selecciona al usuario con nombre {string} para editar")
//    public void seleccionaAlUsuarioConNombreParaEditar(String nombreCompleto) {
//        addText("Selecciona al usuario con nombre: " + nombreCompleto);
//        WebElement usuarioRow = driver.findElement(By.xpath("//td[contains(text(), '" + nombreCompleto + "')]"));
//        WebElement editarButton = usuarioRow.findElement(By.xpath("following-sibling::td/button[@onclick]"));
//        editarButton.click();
//        captureScreenShot();
//    }
//
//    @When("modifica el campo {string} con el valor {string}")
//    public void modificaElCampoConElValor(String campo, String valor) {
//        addText("Modifica el campo " + campo + " con el valor: " + valor);
//        String fieldId = "txt" + campo.replace(" ", "");
//        WebElement field = driver.findElement(By.id(fieldId));
//        field.clear();
//        field.sendKeys(valor);
//        captureScreenShot();
//    }
//
//    @When("guarda los cambios realizados")
//    public void guardaLosCambiosRealizados() {
//        addText("Guarda los cambios realizados");
//        WebElement guardarButton = driver.findElement(By.id("btnGuardar"));
//        guardarButton.click();
//        captureScreenShot();
//    }
//
//    @Then("el resultado de la edición muestra un mensaje {string} con el texto {string}")
//    public void elResultadoDeLaEdicionMuestraUnMensajeConElTexto(String tipoMensaje, String textoMensaje) {
//        addText("Verificación del mensaje: " + textoMensaje);
//        wait(2);
//        captureScreenShot();
//
//        try {
//            WebElement mensajeElement;
//            if (tipoMensaje.equals("éxito")) {
//                mensajeElement = driver.findElement(By.id("swal2-html-container"));
//                assertEquals(textoMensaje, mensajeElement.getText().trim());
//                addText("Mensaje de éxito verificado correctamente: " + textoMensaje);
//            } else if (tipoMensaje.equals("error")) {
//                mensajeElement = driver.findElement(By.id("swal2-html-container"));
//                assertEquals(textoMensaje, mensajeElement.getText().trim());
//                addText("Mensaje de error verificado correctamente: " + textoMensaje);
//            }
//        } catch (AssertionError e) {
//            addText("Error en la verificación: " + e.getMessage());
//            captureScreenShot();
//            fail("Verificación fallida: " + e.getMessage());
//        } catch (Exception e) {
//            addText("Excepción encontrada: " + e.getMessage());
//            captureScreenShot();
//            fail("Excepción al intentar verificar el resultado: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//    @Then("el campo {string} debería mostrar el valor {string} en la tabla")
//    public void elCampoDeberiaMostrarElValorEnLaTabla(String campoValidado, String valorEsperado) {
//        addText("Verificación del valor del campo: " + campoValidado);
//        wait(2);
//        captureScreenShot();
//
//        try {
//            WebElement usuarioRow = driver.findElement(By.xpath("//td[contains(text(), '" + valorEsperado + "')]"));
//            assertEquals(valorEsperado, usuarioRow.getText().trim());
//            addText("Valor verificado correctamente en la tabla: " + valorEsperado);
//        } catch (AssertionError e) {
//            addText("Error en la verificación: " + e.getMessage());
//            captureScreenShot();
//            fail("Verificación fallida: " + e.getMessage());
//        } catch (Exception e) {
//            addText("Excepción encontrada: " + e.getMessage());
//            captureScreenShot();
//            fail("Excepción al intentar verificar el resultado: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//}
//*/
//
//
///*
//package ec.edu.espe.bookstore;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.assertEquals;
//
//public class EditarUsuarioStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario accede a la página de gestión de usuarios")
//    public void elUsuarioAccedeALaPaginaDeGestionDeUsuarios() {
//        createPDF("EditarUsuarios");
//        addText("Inicio de prueba: el usuario accede a la página de gestión de usuarios");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Usuario/Index");
//        captureScreenShot();
//    }
//
//    @When("el usuario intenta editar un usuario con datos {string} {string} {string} {string}")
//    public void elUsuarioIntentaEditarUnUsuarioConDatos(String nombreCompleto, String nombreUsuario, String contraseña, String repetirContraseña) {
//        addText("Intento de editar un usuario con datos: Nombre Completo - " + nombreCompleto + ", Nombre Usuario - " + nombreUsuario + ", Contraseña - " + contraseña + ", Repetir Contraseña - " + repetirContraseña);
//        WebElement btnEditarUsuario = driver.findElement(By.cssSelector(".btn-outline-primary"));
//        btnEditarUsuario.click();
//
//        WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//        WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//        WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//        WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//        nombreCompletoInput.clear();
//        nombreCompletoInput.sendKeys(nombreCompleto);
//        nombreUsuarioInput.clear();
//        nombreUsuarioInput.sendKeys(nombreUsuario);
//        contraseniaInput.clear();
//        contraseniaInput.sendKeys(contraseña);
//        repetirContraseniaInput.clear();
//        repetirContraseniaInput.sendKeys(repetirContraseña);
//
//        captureScreenShot();
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @Then("el resultado de editar usuario es {string}")
//    public void elResultadoDeEditarUsuarioEs(String resultadoEsperado) {
//        try {
//            if (resultadoEsperado.equals("Usuario editado exitosamente")) {
//                addText("Prueba correcta: Usuario editado exitosamente");
//            }
//        } catch (AssertionError e) {
//            addText("Error en la prueba: " + e.getMessage());
//            captureScreenShot();
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//}*/
//
//package ec.edu.espe.bookstore;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.fail;
//
//public class EditarUsuarioStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario accede a la página de gestión de usuarios")
//    public void elUsuarioAccedeALaPaginaDeGestionDeUsuarios() {
//        createPDF("EditarUsuarios");
//        addText("Inicio de prueba: el usuario accede a la página de gestión de usuarios");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Usuario/Index");
//        captureScreenShot();
//    }
//
//    @When("el usuario intenta editar un usuario con datos {string} {string} {string} {string}")
//    public void elUsuarioIntentaEditarUnUsuarioConDatos(String nombreCompleto, String nombreUsuario, String contraseña, String repetirContraseña) {
//        addText("Intento de editar un usuario con datos: Nombre Completo - " + nombreCompleto + ", Nombre Usuario - " + nombreUsuario + ", Contraseña - " + contraseña + ", Repetir Contraseña - " + repetirContraseña);
//        WebElement btnEditarUsuario = driver.findElement(By.cssSelector(".btn-outline-primary"));
//        btnEditarUsuario.click();
//
//        WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//        WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//        WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//        WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//        nombreCompletoInput.clear();
//        nombreCompletoInput.sendKeys(nombreCompleto);
//        nombreUsuarioInput.clear();
//        nombreUsuarioInput.sendKeys(nombreUsuario);
//        contraseniaInput.clear();
//        contraseniaInput.sendKeys(contraseña);
//        repetirContraseniaInput.clear();
//        repetirContraseniaInput.sendKeys(repetirContraseña);
//
//        captureScreenShot();
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
///*
//    @Then("el resultado de editar usuario es {string}")
//    public void elResultadoDeEditarUsuarioEs(String resultadoEsperado) {
//        try {
//            // Aquí vamos a obtener el mensaje de error o éxito después de hacer clic en guardar
//            WebElement resultadoElement = driver.findElement(By.id("resultadoOperacion"));
//            String resultadoActual = resultadoElement.getText();
//
//            // Comparar el resultado actual con el esperado
//            assertEquals(resultadoEsperado, resultadoActual);
//
//            if (resultadoEsperado.equals("Usuario editado exitosamente")) {
//                addText("Prueba correcta: Usuario editado exitosamente");
//            } else {
//                addText("Error en la prueba: " + resultadoActual);
//                captureScreenShot();
//            }
//        } catch (Exception e) {
//            addText("Error en la prueba: " + e.getMessage());
//            captureScreenShot();
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }*/
//
//    @Then("el resultado de editar usuario es {string}")
//    public void elResultadoDeEditarUsuarioEs(String resultadoEsperado) {
//        try {
//            // Aquí vamos a obtener el mensaje de error o éxito después de hacer clic en guardar
//            WebElement resultadoElement = driver.findElement(By.id("resultadoOperacion"));
//            String resultadoActual = resultadoElement.getText();
//
//            // Comparar el resultado actual con el esperado
//            assertEquals(resultadoEsperado, resultadoActual);
//
//            if (resultadoEsperado.equals("Usuario editado exitosamente")) {
//                addText("Prueba correcta: Usuario editado exitosamente");
//            } else {
//                addText("Error en la prueba: " + resultadoActual);
//                captureScreenShot();
//            }
//        } catch (Exception e) {
//            addText("Error en la prueba: " + e.getMessage());
//
//            captureScreenShot();
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//
//}
//
