#include "animal.h"

class Dog: public Mammal{
	string _owner;
	public:
		Dog(): Mammal(){
		}
		Dog(string n, COLOR c, string owner):Mammal(n,c), _owner(owner){
			cout << "Owner: " << _owner << endl;
		};
		~Dog(){
		}
		void speak(){
			cout << "Woof~~~" <<endl;
		}
		void move(){
			cout <<"Dog moves!" << endl;
		}
};	

class Cat: public Mammal{
	public:
		Cat(): Mammal(){
		}
		Cat(string n, COLOR c):Mammal(n,c){
		};
		~Cat(){
			
		}
		void speak(){
			cout << "Cat meoh~~~" << endl;
		}
		void move(){
			cout <<"Cat moves!" <<endl;
		}
		
};

class Lion: public Mammal{
	public:
		Lion(): Mammal(){
		}
		Lion(string n, COLOR c): Mammal(n,c){
		};
		~Lion(){
		}
		void speak(){
			cout << "Lion roar!!" <<endl;
		}
		void move(){
			cout << "Lion moves" <<endl;
		}
};
	
//int main() {
//	
////	Animal *animalPtr  = new Dog("Lassie", White, "Andy"); 
////	Mammal m("Huge Pig", Green);
////	Dog d("Akita", Brown, "JJ");
////	animalPtr->speak();
////	animalPtr->move();
////	animalPtr->~Animal();
////	m.speak();
////	d.speak();
////	d.move();
//	Dog dogi("Lassie", White, "Andy");  
//	Mammal *aniPtr = &dogi ;  
//	Mammal &aniRef = dogi ;  
//	Mammal aniVal = dogi ; 
// 
//    aniPtr->speak() ;   
//	aniRef.speak() ;   
//	 aniVal.speak() ; 
// 	cout << "Program exiting .."<< endl ;
//	return 0;
//}


