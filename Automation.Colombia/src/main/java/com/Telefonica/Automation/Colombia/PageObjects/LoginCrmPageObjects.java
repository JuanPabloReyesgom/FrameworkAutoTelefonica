package com.Telefonica.Automation.Colombia.PageObjects;

import static org.junit.Assert.fail;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import com.ibm.icu.impl.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("")Test
public class LoginCrmPageObjects extends PageObject{
	
	  @FindBy(id = "ipt_name")
	  WebElementFacade    username;
	  @FindBy(id = "ipt_pwd")
	  WebElementFacade    password;
	  @FindBy(id = "loginBtn")
	  WebElementFacade    BotonEntrar;
	  @FindBy(id = "//*[@id=\"rightheadermenu\"]/div[1]/img")
	  WebElementFacade    ImagenLogueado;
	  
	  
	  public void enviarcredenciales(String usuario, String clave) throws InterruptedException {
		     Thread.sleep(10000);
			username.sendKeys(usuario);
			 
			  password.sendKeys(clave);
			 
			  BotonEntrar.click();
			  Thread.sleep(3000);
			  			 
	  					}
	
	public void obtenerTextoDeAlerta() throws InterruptedException {

		ImagenLogueado.isPresent();

		}
	}

