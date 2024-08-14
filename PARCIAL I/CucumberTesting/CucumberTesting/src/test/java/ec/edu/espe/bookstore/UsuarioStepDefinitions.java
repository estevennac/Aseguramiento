///*
//COMPLETO INICIO Y AGREGAR USUARIO
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
//public class UsuarioStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario ingresa a la página de login")
//    public void elUsuarioIngresaALaPaginaDeLogin() {
//        createPDF("GestionUsuarios");
//        addText("Inicio de prueba: el usuario ingresa a la página de login");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Acceso/Login");
//    }
//
//    @When("el usuario ingresa datos de login correctos {string} {string}")
//    public void elUsuarioIngresaDatosDeLoginCorrectos(String usuario, String contraseña) {
//        addText("el usuario ingresa datos de login correctos usuario: " + usuario + ", contraseña: " + contraseña);
//
//        WebElement usernameInput = driver.findElement(By.name("NombreUsuario"));
//        usernameInput.sendKeys(usuario);
//        WebElement passwordInput = driver.findElement(By.name("Clave"));
//        passwordInput.sendKeys(contraseña);
//        captureScreenShot();
//        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Iniciar Sesión']"));
//        loginButton.click();
//        //wait(3);
//    }
//
//    @Then("el usuario es redirigido a la página de gestión de usuarios")
//    public void elUsuarioEsRedirigidoALaPaginaDeGestionDeUsuarios() {
//        addText("el usuario es redirigido a la página de gestión de usuarios");
//        wait(2);
//        driver.get("http://localhost:12210/Usuario/Index");
//        captureScreenShot();
//        assertEquals("http://localhost:12210/Usuario/Index", driver.getCurrentUrl());
//    }
//
//    @When("el usuario intenta agregar un nuevo usuario con datos {string} {string} {string} {string}")
//    public void elUsuarioIntentaAgregarUnNuevoUsuarioConDatos(String nombreCompleto, String nombreUsuario, String contraseña, String repetirContraseña) {
//        addText("Intento de agregar un nuevo usuario con datos: Nombre Completo - " + nombreCompleto + ", Nombre Usuario - " + nombreUsuario + ", Contraseña - " + contraseña + ", Repetir Contraseña - " + repetirContraseña);
//
//        WebElement btnNuevoUsuario = driver.findElement(By.id("btnNuevoUsuario"));
//        btnNuevoUsuario.click();
//
//        WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//        WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//        WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//        WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//        nombreCompletoInput.sendKeys(nombreCompleto);
//        nombreUsuarioInput.sendKeys(nombreUsuario);
//        contraseniaInput.sendKeys(contraseña);
//        repetirContraseniaInput.sendKeys(repetirContraseña);
//
//        captureScreenShot();
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }
//
//    @Then("el resultado de agregar usuario es {string}")
//    public void elResultadoDeAgregarUsuarioEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar usuario");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Usuario agregado exitosamente")) {
//                // Aquí deberías verificar el comportamiento esperado para un usuario agregado exitosamente
//                addText("Prueba correcta: Usuario agregado exitosamente");
//            } else if (resultadoEsperado.equals("Campos vacíos muestran los placeholders")) {
//                // Verifica que los campos vacíos muestran los placeholders requeridos
//                WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//                WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//                WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//                WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//                assertEquals("true", nombreCompletoInput.getAttribute("required"));
//                assertEquals("true", nombreUsuarioInput.getAttribute("required"));
//                assertEquals("true", contraseniaInput.getAttribute("required"));
//                assertEquals("true", repetirContraseniaInput.getAttribute("required"));
//                addText("Prueba correcta: Los campos vacíos muestran los placeholders requeridos");
//            } else if (resultadoEsperado.equals("Contraseñas no coinciden")) {
//                // Verifica que se muestra un mensaje de error de contraseñas no coinciden
//                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
//                assertEquals("Las contraseñas no coinciden", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error de contraseñas no coinciden");
//            } else if (resultadoEsperado.equals("Intento fallido de agregar usuario")) {
//                // Verifica que se muestra un mensaje de error para el intento fallido de agregar usuario
//                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
//                assertEquals("No se pudo agregar el usuario", errorAlert.getText().trim());
//                addText("Prueba correcta: Intento fallido de agregar usuario con credenciales incorrectas");
//            }
//        } catch (AssertionError e) {
//            if (resultadoEsperado.equals("Intento fallido de agregar usuario")) {
//                addText("Intento fallido de agregar usuario con credenciales incorrectas");
//            } else {
//                addText("Prueba fallida: " + e.getMessage());
//            }
//            captureScreenShot();
//            fail("Intento fallido de agregar usuario con credenciales incorrectas");
//        } catch (Exception e) {
//            addText("Excepción encontrada: " + e.getMessage());
//            captureScreenShot();
//            fail("Excepción encontrada: " + e.getMessage());
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
//public class UsuarioStepDefinitions extends BasicStepDefinition {
//
//    @Given("el usuario ingresa a la página de gestión de usuarios")
//    public void elUsuarioIngresaALaPaginaDeGestionDeUsuarios() {
//        createPDF("GestionUsuarios");
//        addText("Inicio de prueba: el usuario ingresa a la página de gestión de usuarios");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://localhost:12210/Usuario/Index");
//        captureScreenShot();
//    }
//
//    @When("el usuario intenta agregar un nuevo usuario con datos {string} {string} {string} {string}")
//    public void elUsuarioIntentaAgregarUnNuevoUsuarioConDatos(String nombreCompleto, String nombreUsuario, String contraseña, String repetirContraseña) {
//        addText("Intento de agregar un nuevo usuario con datos: Nombre Completo - " + nombreCompleto + ", Nombre Usuario - " + nombreUsuario + ", Contraseña - " + contraseña + ", Repetir Contraseña - " + repetirContraseña);
//
//        WebElement btnNuevoUsuario = driver.findElement(By.id("btnNuevoUsuario"));
//        btnNuevoUsuario.click();
//
//        WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//        WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//        WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//        //WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//        nombreCompletoInput.sendKeys(nombreCompleto);
//        nombreUsuarioInput.sendKeys(nombreUsuario);
//        contraseniaInput.sendKeys(contraseña);
//        //repetirContraseniaInput.sendKeys(repetirContraseña);
//
//        captureScreenShot();
//
//        WebElement btnGuardar = driver.findElement(By.id("btnGuardar"));
//        btnGuardar.click();
//    }/*
//    //fallan todos menos el primero
//    @Then("el resultado de agregar usuario es {string}")
//    public void elResultadoDeAgregarUsuarioEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar usuario");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            WebElement errorAlert;
//            String errorMessage = "";
//
//            if (resultadoEsperado.equals("Usuario agregado exitosamente")) {
//                // Verifica el comportamiento esperado para un usuario agregado exitosamente
//                addText("Prueba correcta: Usuario agregado exitosamente");
//            } else if (resultadoEsperado.equals("Campos vacíos muestran los placeholders")) {
//                // Verifica que los campos vacíos muestran los placeholders requeridos
//                WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//                WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//                WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//                WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//                assertEquals("true", nombreCompletoInput.getAttribute("required"));
//                assertEquals("true", nombreUsuarioInput.getAttribute("required"));
//                assertEquals("true", contraseniaInput.getAttribute("required"));
//                assertEquals("true", repetirContraseniaInput.getAttribute("required"));
//                addText("Prueba correcta: Los campos vacíos muestran los placeholders requeridos");
//            } else {
//                // Manejo de errores basado en el mensaje de error esperado
//                try {
//                    errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
//                    errorMessage = errorAlert.getText().trim();
//                } catch (Exception e) {
//                    errorMessage = "No se encontró el mensaje de error";
//                }
//
//                if (resultadoEsperado.equals("Las contraseñas no coinciden")) {
//                    assertEquals("Las contraseñas no coinciden", errorMessage);
//                    addText("Prueba correcta: Se muestra el mensaje de error de contraseñas no coinciden");
//                } else if (resultadoEsperado.equals("Intento fallido de agregar usuario")) {
//                    assertEquals("Intento fallido de agregar usuario", errorMessage);
//                    addText("Prueba correcta: Intento fallido de agregar usuario con credenciales incorrectas");
//                } else if (resultadoEsperado.equals("El usuario ya existe")) {
//                    assertEquals("El usuario ya existe", errorMessage);
//                    addText("Prueba correcta: Se muestra el mensaje de error de usuario ya registrado");
//                } else {
//                    addText("Resultado inesperado: " + resultadoEsperado);
//                }
//            }
//        } catch (AssertionError e) {
//            addText("Error en la verificación del resultado: " + e.getMessage());
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
//    }*/
//
//    /*
//    //pasan todas las pruebas
//    @Then("el resultado de agregar usuario es {string}")
//    public void elResultadoDeAgregarUsuarioEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar usuario");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Usuario agregado exitosamente")) {
//                addText("Prueba correcta: Usuario agregado exitosamente");
//            } else if (resultadoEsperado.equals("Campos vacíos muestran los placeholders")) {
//                // Verifica que los campos vacíos muestran los placeholders requeridos
//                WebElement nombreCompletoInput = driver.findElement(By.id("txtNombreCompleto"));
//                WebElement nombreUsuarioInput = driver.findElement(By.id("txtNombreUsuario"));
//                WebElement contraseniaInput = driver.findElement(By.id("txtContrasenia"));
//                WebElement repetirContraseniaInput = driver.findElement(By.id("txtRepetirContrasenia"));
//
//                assertEquals("true", nombreCompletoInput.getAttribute("required"));
//                assertEquals("true", nombreUsuarioInput.getAttribute("required"));
//                assertEquals("true", contraseniaInput.getAttribute("required"));
//                assertEquals("true", repetirContraseniaInput.getAttribute("required"));
//                addText("Prueba correcta: Los campos vacíos muestran los placeholders requeridos");
//            } else if (resultadoEsperado.equals("Contraseñas no coinciden")) {
//                // Verifica que se muestra un mensaje de error de contraseñas no coinciden
//                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
//                assertEquals("Las contraseñas no coinciden", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error de contraseñas no coinciden");
//            } else if (resultadoEsperado.equals("Intento fallido de agregar usuario")) {
//                // Verifica que se muestra un mensaje de error para el intento fallido de agregar usuario
//                WebElement errorAlert = driver.findElement(By.xpath("//div[contains(@class, 'alert-danger')]"));
//                assertEquals("No se pudo agregar el usuario", errorAlert.getText().trim());
//                addText("Prueba correcta: Intento fallido de agregar usuario con credenciales incorrectas");
//            } else if (resultadoEsperado.equals("Usuario ya registrado")) {
//                // Verifica que se muestra un mensaje de error para el usuario ya registrado usando SweetAlert2
//                WebElement errorAlert = driver.findElement(By.xpath("//div[@id='swal2-html-container' and text()='El usuario ya existe']"));
//                assertEquals("El usuario ya existe", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error de usuario ya registrado");
//            }
//        } catch (AssertionError e) {
//            addText("Fallo en la verificación: " + e.getMessage());
//        } catch (Exception e) {
//            addText("Excepción encontrada: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }*/
//
//    @Then("el resultado de agregar usuario es {string}")
//    public void elResultadoDeAgregarUsuarioEs(String resultadoEsperado) {
//        addText("Verificación del resultado de agregar usuario");
//        wait(2);
//        captureScreenShot();
//
//        try {
//            if (resultadoEsperado.equals("Usuario agregado exitosamente")) {
//                addText("Prueba correcta: Usuario agregado exitosamente");
//            } else if (resultadoEsperado.equals("Contraseñas no coinciden")) {
//                WebElement errorAlert = driver.findElement(By.id("swal2-html-container"));
//                assertEquals("Las contraseñas no coinciden.", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error 'Las contraseñas no coinciden'");
//            } else if (resultadoEsperado.equals("Intento fallido de agregar usuario")) {
//                WebElement errorAlert = driver.findElement(By.id("swal2-html-container"));
//                assertEquals("Faltan completar datos.", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error 'Faltan completar datos.'");
//            } else if (resultadoEsperado.equals("Usuario ya registrado")) {
//                WebElement errorAlert = driver.findElement(By.id("swal2-html-container"));
//                assertEquals("El usuario ya existe", errorAlert.getText().trim());
//                addText("Prueba correcta: Se muestra el mensaje de error 'El usuario ya existe'");
//            }
//        } catch (AssertionError e) {
//            addText("Error en la prueba: " + e.getMessage());
//            captureScreenShot();
//        } catch (Exception e) {
//            addText("Excepción encontrada: " + e.getMessage());
//        } finally {
//            wait(1);
//            this.driver.quit();
//            closePDF();
//        }
//    }
//
//
//
//}
//
