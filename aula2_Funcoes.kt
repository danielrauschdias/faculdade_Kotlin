//A função pode ser simplificada, conforme abaixo, quando possuir somente uma linha.
fun imprimir(texto: String) = println(texto);

//Função com retorno
//Caso queira expressar que a função não tem retorno de outra forma, pode ser colocado também
//depois do ":" o token "Unit".
//Pode ser colocar a interrogação depois do tipo de um parâmetro para mostrar que ele pode ser "null."
//Exemplo: x: Double?
//fun soma(x: Double, y: Double): Double {
//    return x + y;
//}
//Na versão simplificada não pode ser usado o "return", pois o retorno é implícito.
fun soma(x: Double, y: Double): Double = x + y;

fun main() {
    
    imprimir(soma(4.0, 4.5).toString());
    
}
