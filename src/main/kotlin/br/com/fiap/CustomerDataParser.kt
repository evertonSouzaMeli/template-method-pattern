package br.com.fiap

abstract class CustomerDataParser( filePath: String ) {
    protected var filePath: String = ""
    val customerData: List<CustomerData> = mutableListOf()

    protected abstract fun parseDate()
}