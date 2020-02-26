package io.mtech.oop

class Person {
    private String fn
    private String ln
    private String email



   def setFn(String fName) {
        fn = fName
    }
    def getFn() {
        println "First Name: $fn"
    }
    def setLn(String lName) {
        ln = lName
    }
  def  getLn() {
       println "Last Name: $ln"
    }



    def getEmail() {
        println "Email address : $email"
    }

    def setEmail(String eMail) {
        email = eMail
    }

    @Override
    public String toString() {
        return "Person{" +
                "fn='" + fn + '\'' +
                ", ln='" + ln + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static  void main(String[] args){
        Person p = new Person();
        p.setFn("Sekh")
        p.setLn("Mahadi")
        p.setEmail("msekh36@gmail.com")

        p.getFn()

    }
}

