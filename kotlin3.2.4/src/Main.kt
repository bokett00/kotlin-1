fun main() {
    //Задание 1
    print("Введите сумму перевода в рублях: ")
    val amount = readln().toDouble()
    val minCommission = 35.0
    val procentCommission = amount * 0.0075
    val finalCommission = maxOf(procentCommission, minCommission)
    println("Сумма перевода: $amount руб.")
    println("Коммисия к оплате: $finalCommission руб.")



    //Задание 2
    print("Введите количество отметок 'Понравилось': ")
    val likes: Int = readln().toInt()
    if((likes === 1|| likes%10 === 1) && likes != 11){
        println("Понравилось $likes человеку")
    }else {
        println("Понравилось $likes людям")
    }



    //Задание 3
    print("Введите сумму в рублях: ")
    val sum = readln().toDouble()
    val postoian = true
    val pervSkid: Int = if (sum <= 1_000){
        0
    }else if (sum <= 10_000){
       100
    }else{
        (sum * 0.5).toInt()
    }

    val cenaSoSkidkoy = sum - pervSkid

    val finalSum = if (postoian){
        cenaSoSkidkoy - (cenaSoSkidkoy * 0.01).toInt()
    }else{
        cenaSoSkidkoy
    }

    println("Итоговая цена: $finalSum руб.")



}