public class PARKINGSol {
    void addVehicle(int type)
    {
        switch (type) {
            case 1:
                Bus newBus=new Bus();
                break;
            case 2:
                Car newCar=new Car();
                break;    
            case 3:
                Bike newBike=new Bike();
                break;
            default:
                //Wrong Choice
                break;
        }
    }
    void addparking(int type)
    {
        space space=new space();
        switch (type) {
            case 1:
                space.addBig();
                break;
            case 2:
                space.addMed();
                break;    
            case 3:
                space.addTiny();
                break;
            default:
                //Wrong Choice
                break;
        }
    }
    void park(int type)
    {
        space space=new space();
        switch (type) {
            case 1:
                Bus bus=new Bus();
                int count[]=bus.getCount();
                if(count[0]==0)
                {
                    //No bus available
                }
                else
                {
                    int scount[]=space.getSpace();
                    if(scount[0]>=5)
                    {
                        for(int i=scount[0];i>4;i=-5)
                        {
                            bus.parked();
                            space.ParkBig(5);
                            count[0]--;
                            if(count[0]<=0)
                                break;
                        }
                    }
                    else{
                        //No space available
                    }
                }
                break;
            case 2:
                space.addMed();
                break;    
            case 3:
                space.addTiny();
                break;
            default:
                //Wrong Choice
                break;
        }
    }
}
class Bus
{
    static int buscount=0,pc=0;
    Bus()
    {
        buscount++;
    }

    void parked()
    {
        pc++;
        buscount--;
    }

    int[] getCount()
    {
        int[] ar=new int[2];
        ar[0]=buscount;
        ar[1]=pc;
        return ar;
    }
}
class Car
{
    static int Carcount=0,pc=0;
    Car()
    {
        Carcount++;
    }

    void parked()
    {
        pc++;
    }

    int[] getCount()
    {
        int[] ar=new int[2];
        ar[0]=Carcount;
        ar[1]=pc;
        return ar;
    }
}
class Bike
{
    static int bikecount=0,pc=0;
    Bike()
    {
        bikecount++;
    }

    void parked()
    {
        pc++;
    }

    int[] getCount()
    {
        int[] ar=new int[2];
        ar[0]=bikecount;
        ar[1]=pc;
        return ar;
    }
}

class space
{
    static int b=0,m=0,t=0;
    void addBig()
    {
        b++;
    }
    void addMed()
    {
        m++;
    }
    void addTiny()
    {
        t++;
    }
    void ParkBig(int s)
    {
        b=-s;
    }
    void ParkMed(int s)
    {
        m=-s;
    }
    void ParkTiny(int s)
    {
        t=-s;
    }
    int[] getSpace()
    {
        int[] ar=new int[3];
        ar[0]=b;
        ar[1]=m;
        ar[2]=t;
        return ar;
    }
}