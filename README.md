#include<iostream>
#include<stdlib>

class staff
{
protected:
int code;
string name[];
public:
void get_info(int a, string num[])
{
code=a;
name=num;
}
void display()
{
cout<<"code is :"<<code<<"name is: "<<name;
cout<<"\n";
}
};
class teacher:public staff
{
string subject();
string publication();
void get_info2(string d, string e)
{
subject = d;
publication=e;
}
void display2()
{
cout<<"subject is : "<< subject<<endl;
cout<<"publication : "<< publication<<endl;
}
};
class typist:public staff
{
protected:
int speed ;
public:
void get_speed(int s)
{
speed s;
}
void display3()
{
cout<<"speed of typist :" << speed<<end1;
}
};
class officer:public staff
{
protected:
char grade;
public:
void get_grade(char g)
{
grade=g;
}
void display4()
{
cout<<"grade:"<<grade<<endl;
}
};
class regular:public typist
{
 protected:
 int salary;
 public:
 void get_sal(int s)
 {
 salary s;
 }
void display5()
{
cout<<"salary is : "<<salary<<endl;
}
};
class causual : public typist
{
    int wages;
    public:
    void get_wages(int w)
    {
        wages=w;
    }
    void display6()
    {
        cout<<"Wages per day is:"<<wages<<endl;
    }
    };
int main()
{
    teacher s1;
    officer s2;
    regular s3;
    causual s4;
    s1.get_info(1,"Ashu");
    s1.display1();
    s1.get_info2("English",5);
    s1.display2();
    s3.getspeed(55);
    s3.display3();
    s2.get_grade('A');
    s2.display4();
    s3.get_salary(50000);
    s3.display5();
    s4.get_wages(1500);
    s4.display6();
    return 0;
   
}
