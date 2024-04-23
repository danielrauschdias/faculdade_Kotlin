//Depois que o tipo é passado na chamada da função, ele substitui todos os
//T's que estão declarados nela.
fun <T> toList(vararg args: T): ArrayList<T> {
    var list = ArrayList<T>();
    for(i in args) {
        list.add(i);
    }
  	
    return list;
}

fun main() {
	var nums = toList<Int>(1, 2, 3, 4, 5);
    println(nums);
}
