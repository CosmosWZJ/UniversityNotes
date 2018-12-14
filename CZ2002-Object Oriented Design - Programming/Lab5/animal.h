#include <iostream>
#include <string>
using namespace std ;
enum COLOR { Green, Blue, White, Black, Brown } ;
const string color[] = {"Green", "Blue", "White", "Black", "Brown"};
class Animal {
  public :
	Animal() : _name("unknown") {
		cout << "constructing Animal object "<< _name << endl ;
	}
	
	Animal(string n, COLOR c): _name(n), _color(c){
		cout << "Name: " << _name << endl;
		cout << "Color: " << color[_color] << endl;
	}
	~Animal() {
		cout << "destructing Animal object "<< _name << endl ;
	}
	virtual void speak() /*const*/ {
	cout << "Animal speaks "<< endl ;
	}
	virtual void move() = 0;

  private :
	string _name;
	COLOR _color ;
	};
	
class Mammal: public Animal{
  public:
  	void eat() const{
	  cout << "Mammal eat "<< endl;
	  }
	Mammal():Animal(){		
	}
	
	Mammal(string n, COLOR c):Animal(n, c){
	};
	~Mammal(){
//		cout << "destructing mammal object" << endl;	
}
    void move(){
    	cout << "mammal move" <<endl;
	}
};	

