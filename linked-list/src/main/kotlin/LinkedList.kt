class Deque<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun push(data: T) = tail.also {
        tail = Node(data = data, previous = tail)
        it?.next = tail
        head = head ?: tail
    }

    fun pop(): T? = tail?.run {
        tail = previous
        data
    }

    fun unshift(data: T) = head.also {
        head = Node(data = data, next = head)
        it?.previous = head
        tail = tail ?: head
    }

    fun shift(): T? = head?.run {
        head = next
        data
    }
}

data class Node<T>(var previous: Node<T>? = null, var next: Node<T>? = null, val data: T)
