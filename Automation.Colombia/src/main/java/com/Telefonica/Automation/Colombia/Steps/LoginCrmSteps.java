package com.Telefonica.Automation.Colombia.Steps;

import com.Telefonica.Automation.Colombia.PageObjects.LoginCrmPageObjects;

public class LoginCrmSteps {
	
	LoginCrmPageObjects inicioDeSesionPOM=new LoginCrmPageObjects();
	

	public void abrirAplicacionCRM() {
		// TODO Auto-generated method stub
		
		inicioDeSesionPOM.open();		
	}

	public void clickEnLogIn(String usuario, String clave) throws InterruptedException {
		// TODO Auto-generated method stub
		inicioDeSesionPOM.enviarcredenciales(usuario,clave);
	}

	
	public void obtenerTextoDeMensaje() throws InterruptedException {
		// TODO Auto-generated method stub
		inicioDeSesionPOM.obtenerTextoDeAlerta();
	}

}
