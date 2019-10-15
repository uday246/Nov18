#include <iostream>
using namespace std;
class Payroll {
  public:
	int empid[7] = {5658845 ,4520125 ,7895122 ,8777541 ,8451277 ,1302850 ,7580489};


	double rate[7];
	int hours[7];

	double wages[7];

	void setHoursAt(int i, int hrs) {
		hours[i] = hrs;
	}

	void setRateAt(int i, double rt) {
		rate[i] = rt;
	}

	void setWagesAt(int i, double wg) {
		wages[i] = wg;
	}

	int getEmpidAt(int i) {
		return empid[i];
	}

	double getWagesAt(int i) {
		return wages[i];
	}

	double getGrossPayAt(int i) {
		return hours[i] * rate[i];
	}
};

int main() {
		
		Payroll *p = new Payroll();
		for (int i = 0; i < 7;) {
			cout<<"Enter number of hours for emp - " << p->empid[i] << " : \n";
			int h;
      cin>>h;
      if(h<0){
        cout<<"Invalid input, hours can't negative\n";
        continue;
      }
			p->setHoursAt(i, h);
			cout<<"Enter rate for emp - " << (i + 1) << " : \n";
			double r ;

      cin>>r;
			if(r<15){
        cout<<"Pay rate can't be less than 15\n";
        continue;
      }
      p->setRateAt(i, r);
			p->setWagesAt(i, h * r);
    i++;
		}
		cout<<"Emp Id \t Salary\n";
		for (int i= 0; i < 7; i++)
			cout<<p->empid[i] << " \t " << p->wages[i]<<endl;
	}