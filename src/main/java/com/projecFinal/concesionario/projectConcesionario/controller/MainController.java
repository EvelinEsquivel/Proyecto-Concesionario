package com.projecFinal.concesionario.projectConcesionario.controller;

import com.projecFinal.concesionario.projectConcesionario.modelo.*;
import com.projecFinal.concesionario.projectConcesionario.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/concesionario/ada")
public class MainController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private SupervisorRepository supervisorRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private DocumentacionRepository documentacionRepository;

    //===================================================

    @GetMapping(path = "/cliente/all")
    public @ResponseBody
    Iterable<Cliente> getAllCliente(){

        return clienteRepository.findAll();
    }

    @GetMapping(path = "/cliente/{idCliente}")
    public @ResponseBody
    Optional<Cliente> getClienteById(@PathVariable("idCliente") int idCliente){

        return clienteRepository.findById(idCliente);
    }

    @GetMapping(path = "/vendedor/all")
    public @ResponseBody
    Iterable<Vendedor> getAlVendedor(){

        return vendedorRepository.findAll();
    }

    @GetMapping(path = "/vendedor/{id_vendedor}")
    public @ResponseBody
    Optional<Vendedor> getVendedorById(@PathVariable("id_vendedor") int id_vendedor){

        return vendedorRepository.findById(id_vendedor);
    }

    @GetMapping(path = "/supervisor/all")
    public @ResponseBody
    Iterable<Supervisor> getAlSupervisor(){

        return supervisorRepository.findAll();
    }

    @GetMapping(path = "/supervisor/{id_supervisor}")
    public @ResponseBody
    Optional<Supervisor> getSupervisorById(@PathVariable("id_supervisor") int id_supervisor){

        return supervisorRepository.findById(id_supervisor);
    }

    @GetMapping(path = "/vehiculo/all")
    public @ResponseBody
    Iterable<Vehiculo> getAlVehiculo(){

        return vehiculoRepository.findAll();
    }

    @GetMapping(path = "/vehiculo/{id_vehiculo}")
    public @ResponseBody
    Optional<Vehiculo> getVehiculoById(@PathVariable("id_vehiculo") int id_vehiculo){

        return vehiculoRepository.findById(id_vehiculo);
    }

    @GetMapping(path = "/documentacion/all")
    public @ResponseBody
    Iterable<Documentacion> getAlDocumentacion(){

        return documentacionRepository.findAll();
    }

    @GetMapping(path = "/documentacion/{id_documentacion}")
    public @ResponseBody
    Optional<Documentacion> getDocumentacionById(@PathVariable("id_documentacion") int id_documentacion){

        return documentacionRepository.findById(id_documentacion);
    }

    //===================================================

    @PostMapping(path = "/cliente/create", consumes = "application/json", produces = "application/json")
    public Cliente createCliente(@RequestBody Cliente newCliente) {
        return clienteRepository.save(newCliente);
    }

    @PostMapping(path = "/vendedor/create", consumes = "application/json", produces = "application/json")
    public Vendedor createVendedor(@RequestBody Vendedor newVendedor) {
        return vendedorRepository.save(newVendedor);
    }

    @PostMapping(path = "/supervisor/create", consumes = "application/json", produces = "application/json")
    public Supervisor createSupervisor(@RequestBody Supervisor newSupervisor) {
        return supervisorRepository.save(newSupervisor);
    }

    @PostMapping(path = "/vehiculo/create", consumes = "application/json", produces = "application/json")
    public Vehiculo createVehiculo(@RequestBody Vehiculo newVehiculo) {
        return vehiculoRepository.save(newVehiculo);
    }

    @PostMapping(path = "/documentacion/create", consumes = "application/json", produces = "application/json")
    public Documentacion createDocumentacion(@RequestBody Documentacion newDocumentacion) {
        return documentacionRepository.save(newDocumentacion);
    }
    //===================================================

    @PutMapping(path = "/cliente/apdate")
    public Cliente apdateCliente(@RequestBody Cliente apdateCliente) {
        return clienteRepository.save(apdateCliente);
    }

    @PutMapping(path = "/vendedor/apdate")
    public Vendedor apdateVendedor(@RequestBody Vendedor apdateVendedor) {
        return vendedorRepository.save(apdateVendedor);
    }

    @PutMapping(path = "/supervisor/apdate")
    public Supervisor apdateSupervisor(@RequestBody Supervisor apdateSupervisor) {
        return supervisorRepository.save(apdateSupervisor);
    }

    @PutMapping(path = "/vehiculo/apdate")
    public Vehiculo apdateVehiculo(@RequestBody Vehiculo apdateVehiculo) {
        return vehiculoRepository.save(apdateVehiculo);
    }

    @PutMapping(path = "/documentacion/apdate")
    public Documentacion apdateDocumentacion(@RequestBody Documentacion apdateDocumentacion) {
        return documentacionRepository.save(apdateDocumentacion);
    }
    //===================================================

    @DeleteMapping(path = "/cliente/delete/{id_cliente}")
    public @ResponseBody
    Iterable<Cliente> deleteClienteById(@PathVariable("id_cliente") int id_cliente) {
        clienteRepository.deleteById(id_cliente);
        return clienteRepository.findAll();
    }

    @DeleteMapping(path = "/vendedor/delete/{id_vendedor}")
    public @ResponseBody
    Iterable<Vendedor> deleteVendedorById(@PathVariable("id_vendedor") int id_vendedor) {
        vendedorRepository.deleteById(id_vendedor);
        return vendedorRepository.findAll();
    }

    @DeleteMapping(path = "/supervisor/delete/{id_supervisor}")
    public @ResponseBody
    Iterable<Supervisor> deleteSupervisorById(@PathVariable("id_supervisor") int id_supervisor) {
        supervisorRepository.deleteById(id_supervisor);
        return supervisorRepository.findAll();
    }

    @DeleteMapping(path = "/vehiculo/delete/{id_vehiculo}")
    public @ResponseBody
    Iterable<Vehiculo> deleteVehiculoById(@PathVariable("id_vehiculo") int id_vehiculo) {
        vehiculoRepository.deleteById(id_vehiculo);
        return vehiculoRepository.findAll();
    }

    @DeleteMapping(path = "/documentacion/delete/{id_documentacion}")
    public @ResponseBody
    Iterable<Documentacion> deleteDocumentacionById(@PathVariable("id_documentacion") int id_documentacion) {
        documentacionRepository.deleteById(id_documentacion);
        return documentacionRepository.findAll();
    }
}
