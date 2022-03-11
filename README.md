# GamersRegistration
 
 Steps to run the project:
 1. Clone the GamersRegistration project from Github to the local directory.
 2. Download and Install the IDE(Eclips/Intellij/STS).
 3. Import the cloned GamersRegistration project as existing Maven project into the IDE.
 4. After loading the project, open the GamersRegistrationApplication main class under com.app.gamers.GamersRegistration package.
 5. Then Right click and run as Java Application. When we see Started GamersRegistrationApplication, It means the application is Up and running.
 
################################

 Steps to Test the Application Using Swagger:
 1. As I have already implemented Swagger for testing API. After running the application, Open Swagger UI using the
 below Url.
 
 2. You can see the API endpoints which are written in the Project controller as shown below. Pass the inputs for each endpoint to hit the service. 
 
 	a) Endpoint: /creategamer       = Input: Pass the name,gender,nickname,geography in the body (It will create 	the gamer to DB).
 	b) Endpoint: /searchAllgamers   = Input: No input required (It will return list Of Gamers from DB).
 	c) Endpoint: /findgamer/{id}    = Input: Gamer id which is Integer (It will return one single Gamer).
 	d) Endpoint: /lookup/games      = Input: No input required (It will return list of Games).
 	e) Endpoint: /update            = Input: Pass the name,gender,nickname,geography in the body that we want to 	change (It will update the gamer information in the DB).
 	
3. Now the service is up and running and tested all the API's in the service.

4. You can also use JUNIT to test the service methods.
 