class PhoneNumber(phone: String) {

    val number: String = phone.filter(Char::isDigit).run {
        require(length in 10.rangeTo(11))
        if (length == 11) require(get(1) in ('2'..'9') && get(4) in ('2'..'9') && first() == '1')
        else require(get(0) in ('2'..'9') && get(3) in ('2'..'9'))

        reversed().substring(0, 10).reversed()
    }
}
