object Main {
  def main(args: Array[String]): Unit = {
    Password.addValidator(Password.minLen(_)(5))
    Password.addValidator(Password.maxLen(_)(10))
    Password.addValidator(Password.upperChar(_))
    Password.addValidator(Password.lowerChar(_))
    Password.addValidator(Password.numberChar(_))
    Password.addValidator(Password.twoNumbers(_))

    val a = Password.validate("Tea21")
    println(a)
  }
}
