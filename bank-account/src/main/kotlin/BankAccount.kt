import java.util.*

class BankAccount {
    private var closed = false

    var balance: Long = 0
        get() {
            check(!closed); return field
        }

    fun adjustBalance(amount: Long) = synchronized(this) { balance += amount }

    fun close() = true.apply { closed = this }
}
