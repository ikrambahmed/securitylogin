package application.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Missionaire;



@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class MissionnaireController extends CrudController<Missionaire, String>{

}