package rewards

class CustomerController {
    static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.list(sort: "lastName", order: "desc", max: 5, offset: 5)
        [customerInstanceList: customerInstance]
    }

    //def index() { }

    def checkin() {}

}
