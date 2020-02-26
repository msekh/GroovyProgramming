package io.mtech.basic

import java.io.File

class FileInputOutput {
    static void main(String[] args){
      fileReading()
        println()
        fileWriting()
        println()
        fileReading()
        fileSize()
    }
    private  static  void fileReading(){
        new File("/home/sekh/Documents/Proverbs").eachLine {line ->
            println "Line : $line"
        }
    }

    private static  void fileWriting(){
        new File("/home/sekh/Documents/Proverbs")
                .withWriter {writer -> writer.writeLine("09. A blind leader of the blind.")}
    }

    private static  void fileSize(){
        File file = new File("/home/sekh/Documents/Proverbs")
        println "The file ${file.absolutePath} has ${file.length()} bytes"
    }
}
