# Template ve Visitor

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

The Visitor pattern suggests that you place the new behavior into a separate class called visitor, instead of trying to integrate it into existing classes. The original object that had to perform the behavior is now passed to one of the visitor’s methods as an argument, providing the method access to all necessary data contained within the object.

## Visitor Pattern

Car, Wheel, Body, Engine; Visit edilen
Expertise, CarAppraiser Visitor
Galeri, Tamirhane; template method

Car'ımız Wheel, Body, Engine classlarının bir listesini tutuyor. Car dahil, bu classlar Part abstract class'ını inherit ediyor. Bu dört class, working (boolean) ve value (int) fieldına sahip. Bu fieldları constructor ile istediğiniz değerde initialize edebilirsiniz. Part class'ı accept() ve get_working() methodlarına sahip.

Car class'ının constructor'ı diğer partları initialize eder ve listesine ekler.

Expertise, visit methoları ile partların working'i true ise çalışıyor, false ise çalışmıyor yazdırır. Car, listedeki bütün partlar çalışıyor ise çalışıyordur.
CarAppraiser, visit methodları ile eğer part çalışıyorsa valuelarını toplar ve her partın valuesunu yazdırır. En sonunda car da çalışıyorsa (yani bütün partlar çalışıyor demektir) car'ın value'sunu ekler, çalışmıyorsa çıkarır ve yazdırır.

## Template Method Pattern

Yukarıdaki implementationdan devamla template method patternlerinin fieldlarında kendi car objecti ve visitor objectleri (carappraiser ve expertise)  var.

void template(){
	acceptExpertise();    // zorunlu    car.accept(expertise)
	repair();   	 	// hook   	 car.parts listesini gez ve bozuk olan parçaları sağlamıyla değiştir. car.working'i en son true yapmayı unutma    
	acceptAppraiser();    // zorunlu    car.accept(carAppraiser)
lights();   		 // hook    print("Lights are on")
	ride();   		 // hook    print("Ready to ride")
	sell();   		 // hook print("The car is sold")
}
Galeri class'ı; acceptExpertise(), acceptAppraiser(), light(), ride()' ve sell()'i implement eder.
Tamirhane class'ı acceptExpertise(), repair() ve acceptAppraiser()'ı implement eder.



