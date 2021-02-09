package com.Telefonica.Automation.Colombia.Steps;

import com.Telefonica.Automation.Colombia.PageObjects.LoginPageObjects;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPageObjects inicioDeSesionPOM=new LoginPageObjects();
	
	@Step
	public void abrirAplicacionHSEQ() {
		inicioDeSesionPOM.open();
	}
	@Step
	public void clickEnLogIn(String usuario, String clave) throws InterruptedException {
		inicioDeSesionPOM.enviarcredenciales(usuario,clave);
	}
	
	@Step
	public void obtenerTextoDeMensaje() throws InterruptedException {
		inicioDeSesionPOM.obtenerTextoDeAlerta();
	}

	

		
}
