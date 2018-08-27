package rewards

class WhiteboardController {
    def calculationsService

    def index() { }

    def variables() {
        def myTotal = 1
        render("Total: " + myTotal)
        render("</br>" + myTotal.class)
        myTotal = myTotal + 1
        render("</br>New Total: " + myTotal + "</br>")

        def firstName = "Mike"
        render("</br>Name: " + firstName)
        render("</br>" + firstName.class)
        firstName = firstName + 1
        render("</br>New Name: " + firstName + "</br>")

        def today = new Date("2/1/2014")
        render("</br>Today is: " + today)
        render("</br>" + today.class)
        today = today + 1
        render("</br>New Date: " + today + "</br>")
    }
    def strings() {
        def first = "Mike"
        def last = "Kelly"
        def fullName = "Mike Kelly"
        def input = "SHOUTING"
        def state = "ut"
        def points = 4
        render "You live in ${state.toUpperCase()}."
    }

    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)
        render welcomeMessage
    }

}
