package com.Telefonica.Automation.Colombia.StepsDefinition;

import java.util.List;

import com.Telefonica.Automation.Colombia.Models.Usuario;
import com.Telefonica.Automation.Colombia.Steps.LoginCrmSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginCrmStepsDefinition {

	@Steps
	LoginCrmSteps loginCrm; 
	
	
	@Given("^que estoy en la pagina de inicio de CRM$")
	public void que_estoy_en_la_pagina_de_inicio_de_CRM() {
	    
	    loginCrm.abrirAplicacionCRM();
	   
	}

	@When("^ingreso mis credenciales en la plataforma del CRM$")
	public void ingreso_mis_credenciales_en_el_CRM(List<Usuario> listaUsuario) throws InterruptedException {
		loginCrm.clickEnLogIn(listaUsuario.get(0).getUsuario(), listaUsuario.get(0).getClave());
	       
	}

	@Then("^valido que el login ha sido completado$")
	public void valido_que_el_login_ha_sido_completado() throws InterruptedException {
		loginCrm.obtenerTextoDeMensaje();
		
	}
	
}
