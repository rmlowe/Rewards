package rewards

class CustomerController {
    static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.findByPhone(params.id)
        [customerInstanceList: customerInstance]
    }

    //def index() { }

    def checkin() {}

}
