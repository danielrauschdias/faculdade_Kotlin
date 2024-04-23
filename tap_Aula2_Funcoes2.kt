//O segundo parâmetro aceita o valor null ou então que não seja passado nada.
//Caso não seja passado nada, é atribuído o valor padrão "Bem-vindo,".
//Caso seja passado "null", a verificação com o operador "Elvis" atribuirá o valor "Olá,".
fun enviarEmail(usuario: String, titulo: String? = "Bem-vindo,"): String {
    var t = titulo?: "Olá,"; //Se for null retorna "Olá,", se não, retorna a própria variável.
    return "$t $usuario!";
}

fun main() {
    
    println(enviarEmail("Steve"));
    println(enviarEmail("Steve", null));
    println(enviarEmail("Steve", "Welcome"));
    
}
