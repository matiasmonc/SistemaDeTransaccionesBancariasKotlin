package com.module05.sistemadetransaccionesbancarias

fun main(){

    //CREACIÓN DE CUENTAS BANCARIAS
    var cuenta1 = CuentaBancaria("Matias", 5000.0)
    var cuenta2 = CuentaBancaria("Gaspar", 10000.0)
    var cuenta3 = CuentaBancaria("Aurora", 8000.0)

    //TRANSACCIONES

    //cuenta 1
    cuenta1.deposito(5000.0)
    cuenta1.retiro(3500.0)
    cuenta1.retiro(5000.0)
    cuenta1.deposito(13600.0)
    cuenta1.deposito(1500.0)
    cuenta1.mostrarHistorial()
    println("\n\n\n")

    //cuenta 2
    cuenta2.retiro(8000.0)
    cuenta2.retiro(1500.0)
    cuenta2.deposito(15000.0)
    cuenta2.retiro(4000.0)
    cuenta2.deposito(2990.0)
    cuenta2.mostrarHistorial()
    println("\n\n\n")

    //cuenta 3
    cuenta3.retiro(4000.0)
    cuenta3.deposito(5000.0)
    cuenta3.retiro(50000.0)
    cuenta3.deposito(14000.0)
    cuenta3.retiro(16000.0)
    cuenta3.mostrarHistorial()

}