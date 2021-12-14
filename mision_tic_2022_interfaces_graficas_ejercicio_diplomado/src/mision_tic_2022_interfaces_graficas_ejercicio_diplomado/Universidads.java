/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mision_tic_2022_interfaces_graficas_ejercicio_diplomado;

/**
 *
 * @author loren
 */
class Universidads {
    private Double estudiante, docencia, plataforma, admin;
    private int grupo;

    public Universidads(Double estudiante, Double docencia, Double plataforma, Double admin, int grupo) {
        this.estudiante = estudiante;
        this.docencia = docencia;
        this.plataforma = plataforma;
        this.admin = admin;
        this.grupo = grupo;
    }

    

    
    
    public double CalcularIngreso(){//Calcular ingreso conrespecto a los estudiantes
        return (estudiante*8)*grupo;
    }
    public double CalcularEgresos(){
        return (docencia+plataforma+admin)*grupo;
    }

    public Double getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Double estudiante) {
        this.estudiante = estudiante;
    }

    public Double getDocencia() {
        return docencia;
    }

    public void setDocencia(Double docencia) {
        this.docencia = docencia;
    }

    public Double getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Double plataforma) {
        this.plataforma = plataforma;
    }

    public Double getAdmin() {
        return admin;
    }

    public void setAdmin(Double admin) {
        this.admin = admin;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    

}
