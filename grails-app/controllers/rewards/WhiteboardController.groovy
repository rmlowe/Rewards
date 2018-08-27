package rewards

class WhiteboardController {

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
        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMessage = ""

        switch (totalPoints) {
            case 5:
                welcomeMessage = "Welcome back $firstName, this drink is on us."
                break
            case 4:
                welcomeMessage = "Welcome back $firstName, your next drink is free."
                break
            case 2..3:
                welcomeMessage = "Welcome back $firstName, you now have $totalPoints points."
                break
            default:
                welcomeMessage = "Welcome $firstName. Thanks for registering."
        }

        render welcomeMessage
    }

}
