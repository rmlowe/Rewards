package rewards

class CustomerController {
    static scaffold = Customer

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
        [customerInstanceList: customerInstance]
    }

    //def index() { }

    def checkin() {}

}
