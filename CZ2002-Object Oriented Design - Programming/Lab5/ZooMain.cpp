#include<iostream>
#include "childAnimal.h"

int main(){
	cout <<"Welcome to the Zoo APP!" <<endl;
	cout << "Select the animal to send to Zoo:\n (1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" <<endl;
	int choice;
	Mammal *alist[5];
	cin >> choice;
	switch(choice){
		case 1:
			alist[0] = new Dog();
			alist[0]->speak();
			alist[0]->move();
			alist[0]->eat();
			break;
		case 2:
			alist[0] = new Cat();
			alist[0]->speak();
			alist[0]->move();
			alist[0]->eat();
			break;
		case 3:
			alist[0] = new Lion();
			alist[0]->speak();
			alist[0]->move();
			alist[0]->eat();
			break;
		case 4:
			alist[0] = new Dog();
			alist[1] = new Cat();
			alist[2] = new Lion();
			for(int i = 0; i<3; i++){
				alist[i]->speak();
				alist[i]->move();
				alist[i]->eat();
			}
//			for(int i = 0; i<3; i++){
//				alist[i]->~Mammal();
//			}
			break;
			
		default:
			break;
			
	} 
	return 0;
}
