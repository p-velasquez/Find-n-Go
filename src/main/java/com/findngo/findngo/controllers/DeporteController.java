package com.findngo.findngo.controllers;

import com.findngo.findngo.dao.DeporteDao;
import com.findngo.findngo.models.Deporte;
import com.findngo.findngo.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeporteController {

    @Autowired
    private DeporteDao deporteDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/deportes", method = RequestMethod.GET)
    public List<Deporte> getDeportes() {
        return deporteDao.getDeportes();
    }

}
