package org.etsntesla.it.controllers;

import org.etsntesla.it.models.Emocije;
import org.etsntesla.it.repositories.EmocijeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmocijeController {

    @Autowired
    EmocijeRepository emocijeRepository;

    @RequestMapping(path="/emocije", method = RequestMethod.GET)
    public List<Emocije> getAll() {
    return emocijeRepository.findAll();
    }

    @RequestMapping(path="/emocije/{id}", method = RequestMethod.GET)
    public Emocije get(@PathVariable int id) {
        return emocijeRepository.findById(id).orElse(null);
    }

    @RequestMapping(path="/emocije", method = RequestMethod.POST)
    public Emocije create(@RequestBody Emocije emocije) {
        return emocijeRepository.save(emocije);
    }

    @RequestMapping(path="/emocije", method = RequestMethod.PUT)
    public Emocije update(@RequestBody Emocije emocije) {
        return emocijeRepository.save(emocije);
    }

    @RequestMapping(path="/emocije/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        emocijeRepository.delete(emocijeRepository.findById(id).get());
    }

}
