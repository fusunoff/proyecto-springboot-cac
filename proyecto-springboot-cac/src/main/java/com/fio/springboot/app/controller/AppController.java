package com.fio.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fio.springboot.models.Perro;
import com.fio.springboot.models.Persona;

@Controller
public class AppController {

	@RequestMapping("/obtenerOffice")
	@ResponseBody
	String home() {
		return "<h1>Buenas noches, Equipo CaC </h1>" + " <h2>a romperla con Springboot</h2>"
				+ "<iframe src=\"https://giphy.com/embed/5wWf7H89PisM6An8UAU\" width=\"240\" height=\"180\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/editingandlayout-the-office-michael-scott-5wWf7H89PisM6An8UAU\">via GIPHY</a></p>";
	}

	@RequestMapping("/obtenerPersona")
	@ResponseBody

	String persona() {
		Persona persona1 = new Persona("Michael", "Scott", "48");
		return persona1.toString();
	}

	@RequestMapping("/obtenerPerro")
	@ResponseBody

	String perro() {
		Perro perro1 = new Perro("Patrón", "Mestizo", 3);
		return perro1.toString();
	}

}
