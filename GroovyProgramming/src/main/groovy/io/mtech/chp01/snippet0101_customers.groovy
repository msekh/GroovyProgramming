package io.mtech.chp01

def  customers  = new XmlParser().parse(new File('/home/sekh/Apps/GroovyProgramming/src/main/resources/customers.xml'))

customers.corporate.customer.each { customer ->
    println "${customer.@name} works for ${customer.@company}"
}


