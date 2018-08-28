package rewards

class CustomerController {
    static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
        [customerInstanceList: customerInstance]
    }

    def checkin() {}

    def index() {
        params.max = 10
//        [customerInstanceList: Customer.list(params), customerInstanceCount: Customer.count()]
        [customerList: Customer.list(params), customerCount: Customer.count()]
    }

    def create() {
//        [customerInstance: new Customer()]
        [customer: new Customer()]
    }
}
