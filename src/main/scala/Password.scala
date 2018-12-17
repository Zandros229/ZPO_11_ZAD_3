import scala.collection.mutable.ArrayBuffer

object Password {
  var validators: ArrayBuffer[String => Boolean] = ArrayBuffer[String => Boolean]()

  def minLen(password: String)(len:Int): Boolean ={
    password.length>=len
  }
  def maxLen(password: String)(len:Int): Boolean ={
    password.length<=len
  }
  def upperChar(password: String): Boolean ={
    password.matches(".*[A-Z].*")
  }
  def lowerChar(password: String): Boolean ={
    password.matches(".*[a-z].*")
  }
  def numberChar(password: String): Boolean ={
    password.matches(".*[0-9].*")
  }
  def twoNumbers(password: String): Boolean ={
    password.matches(".*[0-9].*[0-9].*")

  }
  def addValidator(validator: String => Boolean): Unit =
  {
    validators += validator
  }
  def validate(password: String): Boolean =
  {
    var result = true
    for(validator <- validators)
    {
      result = result & validator(password)
    }
    result
  }
}
