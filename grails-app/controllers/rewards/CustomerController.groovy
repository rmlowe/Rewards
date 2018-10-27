package rewards

class CustomerController {
    static scaffold = Customer

    def calculationsService

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("B%", 3)
        [customerInstanceList: customerInstance]
    }

    def customerLookup(Customer lookupInstance) {
        def (customerInstance, welcomeMessage) = calculationsService.processCheckin(lookupInstance)
        render(view: "checkin", model:[customerInstance: customerInstance, welcomeMessage: welcomeMessage])
        // Query customer by phone #
        // If no result,
        //  Create a new customer
        //  Create welcome message
        //  Add award record
        //  Save customer
        //  Send welcome to kiosk
        // If customer found,
        //  Calculate total points
        //  Create welcome message
        //  Add award record
        //  Save customer
        //  Send welcome to kiosk
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

    def save(Customer customerInstance) {
        customerInstance.save()
        redirect(action: "show", id: customerInstance.id)
    }

    def show(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance = calculationsService.getTotalPoints(customerInstance)
//        [customerInstance: customerInstance]
        [customer: customerInstance]
    }

    def edit(Long id) {
        def customerInstance = Customer.get(id)
//        [customerInstance: customerInstance]
        [customer: customerInstance]
    }

    def update(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.properties = params
        customerInstance.save(flush:true)  // flush:true appears to be necessary, not sure why ...
        redirect(action: "show", id: customerInstance.id)
    }

    def delete(Long id) {
        def customerInstance = Customer.get(id)
        customerInstance.delete(flush:true)  // flush:true appears to be necessary, not sure why ...
        redirect(action:"index")
    }
}
