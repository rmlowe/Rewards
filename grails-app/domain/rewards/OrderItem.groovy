package rewards

class OrderItem {
    Integer qty
    Float total
    static belongsTo = [order:Order, product:Product]

    static constraints = {
    }
}
