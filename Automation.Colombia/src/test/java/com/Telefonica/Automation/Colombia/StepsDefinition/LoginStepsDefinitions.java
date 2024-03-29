package com.Telefonica.Automation.Colombia.StepsDefinition;

import java.util.List;
import com.Telefonica.Automation.Colombia.Models.Usuario;
import com.Telefonica.Automation.Colombia.Steps.LoginCrmSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepsDefinitions {

	@Steps
	LoginCrmSteps inicioDeSesionSteps;
	
	//ADMINISTRADOR
	@Given("^que estoy en la pagina de inicio en CRM$")
	public void que_estoy_en_la_pagina_de_inicio_de_HSEQ() {
	    
	    inicioDeSesionSteps.abrirAplicacionCRM();
	   
	}

	@When("^ingreso mis credenciales en el CRM$")
	public void ingreso_mis_credenciales(List<Usuario> listaUsuario) throws InterruptedException {
		   inicioDeSesionSteps.clickEnLogIn(listaUsuario.get(0).getUsuario(), listaUsuario.get(0).getClave());
	       
	}

	@Then("^valido que el login ha sido exitoso$")
	public void valido_que_el_login_ha_sido_exitoso() throws InterruptedException {
		inicioDeSesionSteps.obtenerTextoDeMensaje();
		
	}
	
}