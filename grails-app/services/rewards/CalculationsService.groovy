package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def welcome(params) {
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
    }
}
