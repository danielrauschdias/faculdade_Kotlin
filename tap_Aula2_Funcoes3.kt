fun formatarEndereco(tipo: String? = "Rua", logradouro: String? = "", numero: Int? = 0, complemento: String? = ""): String {
    return "$tipo $logradouro${if (logradouro == "") "" else ", "}$numero${if (complemento == "") "" else ", "}$complemento"
}

fun main() {
    
    //Com a passagem do argumento utilizando-se o nome, não é necessário/possível seguir a ordem deles na função.
    println(formatarEndereco());
    println(formatarEndereco(logradouro = "Marechal Deodoro"));
    println(formatarEndereco("Av.", numero = 300, complemento = "Casa"));
    println(formatarEndereco(logradouro = "Marechal Deodoro", numero = 300, complemento = "Casa 1"));
    println(formatarEndereco("Travessa", "Marechal Deodoro", 350, "Casa 2"));
    println(formatarEndereco(logradouro = "Marechal Deodoro", complemento = "Casa 3", numero = 400, tipo = "Avenida"));
}
