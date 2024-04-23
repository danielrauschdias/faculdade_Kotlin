fun toList(vararg args: String): ArrayList<String> {
    var list = ArrayList<String>();
    for(i in args) {
        list.add(i);
    }
  	
    return list;
}

fun main() {
	var frutas = toList("Banana", "Maçã", "Abacaxi");
    println(frutas);
}
