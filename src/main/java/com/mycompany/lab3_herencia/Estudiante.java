/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3_herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author zarat
 */
public class Estudiante extends Persona {

    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    private int grado;
    private double[] arr;

    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public Estudiante() {
    }

    public String getCarnet() {
        return this.carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < this.numeroMaterias; i++){
            suma += getArr()[i];
        }
        return suma/this.numeroMaterias;
    }

    public void leerNotasEstudiante() {
        int n = 0;
        n = leerDatoTipoEntero("Digitie numero de materias");
        setNumeroMaterias(n);
        double[] arr = new double[n];
        setNumeroMaterias(n);
        for (int i = 0; i < n; i++){
            arr[i] = leerDatoTipoReal("Digite nota de la materia "+(i+1));
        }
        setArr(arr);
    }
    
    @Override
    public void imprimirDatosPersona(){
        JOptionPane.showMessageDialog(null, "======== DATOS DEL ESTUDIANTE =======\n"+getCarnet());
    }
    public void ingresarDatosEstudiante() {
        String nombre;
        String apellido;
        String carnet;
        int edad;
        int grado;
        nombre = leerDatoTipoCadena("Digite el nombre del Estudiante");
        apellido = leerDatoTipoCadena("Digite el apellido del Estudiante");
        edad = leerDatoTipoEntero("Digite la edad del Estudiante");
        grado = leerDatoTipoEntero("Digite el grado que cursa el Estudiante");
        carnet = "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nGrado: "+grado;
        setCarnet(carnet);
    }

    public void imprimirReporteNotasEstudiante() {
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "El promedio de las notas del estudiante es: "+calcularPromedio());
    }
}