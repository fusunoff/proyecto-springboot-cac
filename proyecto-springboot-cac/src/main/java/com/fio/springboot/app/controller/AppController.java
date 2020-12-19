package com.fio.springboot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fio.springboot.models.Perro;
import com.fio.springboot.models.Persona;

import io.swagger.v3.oas.annotations.Operation;
@RestController
public class AppController {
//	PRIMER ENDPOINT O REQUEST ONTIENE  POR STRING TAGS DE HTML
	@Operation(summary = "Obtiene home o Magic",description = ""
			+ "con este servicio obtenemos Magic"
			+ "alumnes codo a codo manijas")
	@RequestMapping(value = "/obtenerMagic", method = RequestMethod.GET)
	String home() {
		return "<h1>Buenas noches Equipo CaC JavaFullStack a romperla</h1> " + "<h2>con Spring Boot</h2>"
				+ "<iframe src=\"https://giphy.com/embed/5wWf7H89PisM6An8UAU\" width=\"240\" height=\"180\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/editingandlayout-the-office-michael-scott-5wWf7H89PisM6An8UAU\">via GIPHY</a></p>";
	}
//	SEGUNDO ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DE LA PERSONA INSTANCIADA
	@Operation(summary = "Obtener Persona",description = ""
			+ "con este servicio se obtiene los datos de una persona "
			+ "alumnes codo a codo manijas")
	@RequestMapping(value = "/obtenerPersona", method = RequestMethod.GET)
	String persona() {
		Persona persona1 = new Persona("Michael", "Scott", 48);
		return persona1.toString();
	}
//	TERCE  ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DEL ONJETO PERRO INSTANCIADO
	@Operation(summary = "Obtener Perro",description = ""
			+ "con este servicio se obtiene los datos de un perrito "
			+ "alumnes codo a codo manijas")
	@RequestMapping(value ="/obtenerPerro", method = RequestMethod.GET)
	@ResponseBody
	String perro() {
		Perro perro1 = new Perro("Lola", "Border Collie", 9);
		return perro1.toString();
	}
}