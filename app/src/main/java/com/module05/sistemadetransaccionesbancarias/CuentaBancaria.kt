package com.module05.sistemadetransaccionesbancarias

class CuentaBancaria(
    private var nombreCuenta: String,
    private var saldoDisponible: Double
) {

    var transacciones: MutableList<String> = mutableListOf();

    fun deposito(monto: Double){
        saldoDisponible += monto
        transacciones.add("$nombreCuenta depositó $$monto")
    }

    fun retiro(monto: Double){
        if(saldoDisponible >= monto){
            saldoDisponible -= monto
            transacciones.add("$nombreCuenta retiró $$monto")
        }else{
            transacciones.add("Transaccion fallida: No tienes saldo suficiente.")
        }
    }

    fun mostrarSaldo(){
        println("Saldo disponible: $saldoDisponible pesos.")
    }

    fun mostrarHistorial(){
        println("------------------------------------------ \nHistorial de Transacciones - $nombreCuenta \n------------------------------------------")

        transacciones.forEach { println(it) }

        println("------------------------------------------ \n$nombreCuenta. Su saldo disponible es de: $$saldoDisponible")
    }
}