package io.mtech.basic


def number = 0
new File('/home/sekh/Apps/GroovyProgramming/src/main/resources/Proverbs').eachLine { line ->
    number++
    println "$number: $line"
}