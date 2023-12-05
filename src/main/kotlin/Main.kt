fun  questionOne(number:Int):Unit{
    val bin = number % 2
    if(bin == 1){
        println("numero impar")
    }
    else if(bin == 0){
        println("numero par")
    }
}






fun calculadora(){

    //primeiro numero
    println("digite um primeiro numero da operação")
    var first = readLine()
    try {
        first?.toInt()
    }
    catch (e:Exception){
        println("esse numero é invalido,digite novamente")
        first = readLine()
    }


    //primeiro numero
    println("digite o segundo numero da operaçao")
    var secund  = readLine()
    try {
        secund?.toInt()
    }
    catch (e:Exception){
        println("esse numero é invalido,digite novamente")
        secund = readLine()
    }


    //operador
    println(" por fim diga qual operaçao quer fazer + - * /")
    var operator = readLine()
    //condicional de operador
if (operator !== "+" || operator !== "-" || operator !== "*" || operator !== "/" ){
    println("operador incorreto, Digite novamente")
    operator = readLine()
}
        var total:Int

             if (operator == "+"){
             total = first!!.toInt() + secund!!.toInt()
             println(total)

         }

         else if (operator == "-"){
             if (operator == "+") {
                 total = first!!.toInt() + secund!!.toInt()
                 println(total)


             }
         }
         else if (operator == "*"){
                 if (operator == "*"){
                     total = first!!.toInt() + secund!!.toInt()
                     println(total)

             }         }
         else if (operator == "/"){
                 if (operator == "/"){
                     total = first!!.toInt() + secund!!.toInt()
                     println(total)

             }         }

}
fun main(){
    calculadora()
}






