package vehical;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
class details 
{ 
    int vehicalno;
    String vehicalcol;
    String vehicalname;
    String vehicalprice;
    String displacement;
    String max_power;
    String fuel_capacity;

    String BodyType;
    String TransmissionType;
    String FuelType;
    String CityMileage;

  
}

//-----------------------------------------------two wheeler-----------------------------------------------


class two_wheeler extends details
{
   
   two_wheeler(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity)
   {
       this.vehicalno=vehicalno;
       this.vehicalcol=vehicalcol;
       this.vehicalname=vehicalname;
       this.vehicalprice=vehicalpric;
       this.displacement=displacement;
       this.max_power=max_power;
       this.fuel_capacity=fuel_capacity;

   }
   public static void brand()
    {
	    System.out.println("                                             ");
	    System.out.println("        ==========Popular Brands=========    ");
	    System.out.println("                                             ");
        System.out.println("      1.Yamaha     2.Royal enfield     3.jawa   ");
        System.out.println("      4.Bajaj      5.Honda             6.Tvs    ");
        System.out.println("                   7.Hero Bikes                 ");
   }
   public String toString()
    {
     System.out.println("vehicalname          : "+vehicalname);
     System.out.println("vehical no           : "+vehicalno);
     System.out.println("vehical clolor       : "+vehicalcol);
     System.out.println("vehical price        : "+vehicalprice);
     System.out.println("vehical displacement : "+displacement);
     System.out.println("vehical power        : "+max_power);
     System.out.println("vehical fuel capacity: "+fuel_capacity);
     System.out.println("=====================================");
     return "";

    }
}
class yamaha extends two_wheeler
{
    yamaha(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
        System.out.println();
        System.out.println("================>>>>> yamaha <<<<<================");
        System.out.println();
        System.out.println("          please select which model you want");
        System.out.println();
        System.out.println("                  1:Yamaha FZ-X");
        System.out.println("                  2.Yamaha MT-15 Version 2.0");
        System.out.println("                  3.Yamaha R15s");
        System.out.println("                  4.Yamaha R15 V4");
        System.out.println("                  5.Yamaha FZS-FI V3");
        System.out.println("                  6.Yamaha FZ-FI V3");

    }

}
class re extends two_wheeler
{
    re(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
    
        System.out.println();
        System.out.println("================>>>>> royal enfield <<<<<================");
        System.out.println();
        System.out.println("            please select which model you want");
        System.out.println();
        System.out.println("                 1.Royal Enfield Classic 350");
        System.out.println("                 2.Enfield Continental GT 650");
        System.out.println("                 3.Royal Enfield Bullet 350");
        System.out.println("                 4.Royal Enfield Interceptor 650");
        System.out.println("                 5.Royal Enfield Continental GT 650");
        System.out.println("                 6.Royal Enfield Himalayan");
        System.out.println("                 7.Royal Enfield Meteor 350 Colours");
        System.out.println("                 8.Royal Enfield Hunter 350");

    }
    
}
class jawa extends two_wheeler
{
    jawa(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
        System.out.println();
        System.out.println("================>>>>> jawa <<<<<================");
        System.out.println();
        System.out.println("        please select which model you want");
        System.out.println();
        System.out.println("                   1.Jawa Perak");
        System.out.println("                   2.Jawa 42");
        System.out.println("                   3.Jawa");
        
    }

}
class bajaj extends two_wheeler
{
    bajaj(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }
    public static void name()
    {
    
        System.out.println();
        System.out.println("================>>>>> Bajaj Bikes <<<<<================");
        System.out.println();
        System.out.println("           please select which model you want");
        System.out.println();
        System.out.println("                  1.Bajaj Pulsar NS200");
        System.out.println("                  2.Bajaj Dominar 400");
        System.out.println("                  3.Bajaj Pulsar 125");
        System.out.println("                  4.Bajaj Pulsar RS200");
        System.out.println("                  5.Bajaj Pulsar 150");
        System.out.println("                  6.Bajaj Pulsar NS 125");
        System.out.println("                  7.Bajaj Avenger Cruise 220");

    }

}
class honda2w extends two_wheeler
{
    honda2w(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
    
        System.out.println();
        System.out.println("================>>>>> honda bikes <<<<<================");
        System.out.println();
        System.out.println("            please select which model you want");
        System.out.println();
        System.out.println("               1:Honda CRF1100L Africa Twin");
        System.out.println("               2.Honda CB500X");
        System.out.println("               3.Honda CB300F");
        System.out.println("               4.Honda CBR1000RR-R");
        System.out.println("               5.Honda Activa 6G");
        System.out.println("               6.Honda Unicorn");
        System.out.println("               7.Honda Dio");
        System.out.println("               8.Honda SP 125");
        System.out.println("               9.Honda Gold Wing");

    }

}

class tvs extends two_wheeler
{
    tvs(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
    
        System.out.println();
        System.out.println("================>>>>> tvs bikes <<<<<================"); 
        System.out.println();
        System.out.println("          please select which model you want");
        System.out.println();
        System.out.println("                 1:TVS Apache RTR 160");
        System.out.println("                 2.TVS Apache RTR 180");
        System.out.println("                 3.TVS Jupiter");
        System.out.println("                 4.TVS Star City Plus");
        System.out.println("                 5.TVS Apache RR 310");
        System.out.println("                 6.TVS Apache RTR 200 4V");
        
    }
}
class hero extends two_wheeler
{
    hero(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String displacement,String max_power,String fuel_capacity) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,displacement,max_power,fuel_capacity);
       
    }

    public static void name()
    {
        System.out.println();
        System.out.println("================>>>>> Hero Bikes <<<<<================"); 
        System.out.println();
        System.out.println("           please select which model you want");
        System.out.println();
        System.out.println("                  1.Hero Splendor Plus");
        System.out.println("                  2.Hero HF Deluxe");
        System.out.println("                  3.Hero Passion Pro");
        System.out.println("                  4.Hero XPulse 200");
        System.out.println("                  5.Hero Xtreme 200S");

    }

}


//-----------------------------------------------four wheeler-----------------------------------------------


class four_wheeler extends details
{
       {
        System.out.println("     ..........details for the vehical..........");
       }

    public static void type()
    {                      
    	System.out.println("             what are you looking for?");
    	System.out.println("                                 ");
        System.out.println("                    1.Ice          ");
        System.out.println("                    2.Ev           ");
    }
    public static void brand()
    {
    	System.out.println("        ==========Popular Brands=========    ");
    	System.out.println("");
        System.out.println("               1.Tata motors Cars   ");
        System.out.println("               2.Maruti Suzuki Cars ");
        System.out.println("               3.Kia Cars           ");
        System.out.println("               4.Audi Cars          ");
        System.out.println("               5.BMW Cars           ");
    }
    

        four_wheeler(int vehicalno,String vehicalcol,String vehicalname,String vehicalpric,String BodyType,String TransmissionType,String FuelType,String CityMileage,String max_power )
        {
            this.vehicalno=vehicalno;
            this.vehicalcol=vehicalcol;
            this.vehicalname=vehicalname;
            this.vehicalprice=vehicalpric;
            this.BodyType=BodyType;
            this.TransmissionType=TransmissionType;
            this.FuelType=FuelType;
            this.CityMileage=CityMileage;
            this.max_power=max_power;

    
        }
        public String toString()
        {
            System.out.println("          vehical name         : "+vehicalname);
            System.out.println("          vehical no           : "+vehicalno);
            System.out.println("          vehical clolor       : "+vehicalcol);
            System.out.println("          vehical price        : "+vehicalprice);
            System.out.println("          vehical Transmission : "+TransmissionType);
            System.out.println("          vehical power        : "+max_power);
            System.out.println("          vehical Body Type    : "+BodyType);
            System.out.println("          vehical Fuel Type    : "+FuelType);
            System.out.println("          vehical City Mileage : "+CityMileage);
            System.out.println("========================================================");
            return"";
        }  
        
    
}
class tata extends four_wheeler
{
    tata(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric,String TransmissionType,String FuelType,String CityMileage,String BodyType,String max_power) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,BodyType,TransmissionType,FuelType,CityMileage,max_power);
        
    }

     public static void name()
        {

            System.out.println();
            System.out.println("================>>>>> Tata Cars <<<<<================"); 
            System.out.println();
            System.out.println("         please select which model you want");
            System.out.println();
            System.out.println("                    1:Tata Punch");
            System.out.println("                    2.Tata Nexon");
            System.out.println("                    3.Tata Harrier");
            System.out.println("                    4.Tata Tiago");
            System.out.println("                    5.Tata Altroz");
            System.out.println("                    6.Tata Tigor");
            System.out.println("                    7.Tata Safari");
            System.out.println("                    8.Tata Tiago NRG");
    
        }
     public static void evname()
     {
         System.out.println();
         System.out.println("================>>>>> Tata Cars <<<<<================");
         System.out.println();
         System.out.println("         please select which model you want");
         System.out.println();
         System.out.println("                    1.Tata Tigor EV");
         System.out.println("                    2.Tata Nexon EV Prime");
         System.out.println("                    3.Tata Nexon EV Max");

     }
     
     
}
class suzuki extends four_wheeler
{
    suzuki(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric,String TransmissionType,String FuelType,String CityMileage,String BodyType,String max_power) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,BodyType,TransmissionType,FuelType,CityMileage,max_power);
        
    }
    public static void name()
        {
            System.out.println();
            System.out.println("================>>>>> Maruti Suzuki Cars <<<<<================");
            System.out.println();
            System.out.println("              please select which model you want");
            System.out.println();
            System.out.println("                    1.Maruti Brezza");
            System.out.println("                    2.Maruti Swift");
            System.out.println("                    3.Maruti Baleno");
            System.out.println("                    4.Maruti Alto 800");
            System.out.println("                    5.Maruti Ertiga");
            System.out.println("                    6.Maruti Wagon R");
            System.out.println("                    7.Maruti S-Cross");
    
        } 
}
class kia extends four_wheeler
{
     kia(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric,String TransmissionType,String FuelType,String CityMileage,String BodyType,String max_power) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,BodyType,TransmissionType,FuelType,CityMileage,max_power);
        
    }
    public static void name()
        {
            System.out.println();
            System.out.println("================>>>>> Kia Cars <<<<<================");
            System.out.println();
            System.out.println("              please select which model you want");
            System.out.println();
            System.out.println("                    1.Kia Seltos");
            System.out.println("                    2.Kia Sonet");
            System.out.println("                    3.Kia Carens");
            System.out.println("                    4.Kia Carnival");
    
        } 
}
class audi extends four_wheeler
{
     audi(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric,String TransmissionType,String FuelType,String CityMileage,String BodyType,String max_power) 
    {
        super(vehicalno, vehicalcol, vehicalname, vehicalpric,BodyType,TransmissionType,FuelType,CityMileage,max_power);
        
    }
    public static void name()
        {
            System.out.println();
            System.out.println("================>>>>> Audi Cars <<<<<================");
            System.out.println();
            System.out.println("              please select which model you want");
            System.out.println();
            System.out.println("                    1.Audi Q7");
            System.out.println("                    2.Audi A6");
            System.out.println("                    3.Audi Q3");
            System.out.println("                    4.Audi RS Q8");
    
        } 
}
class bmw extends four_wheeler
{
	  bmw(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric,String TransmissionType,String FuelType,String CityMileage,String BodyType,String max_power) 
	    {
	        super(vehicalno, vehicalcol, vehicalname, vehicalpric,BodyType,TransmissionType,FuelType,CityMileage,max_power);
	        
	    }
    public static void name()
        {
            System.out.println();
            System.out.println("================>>>>> BMW Cars <<<<<================");
            System.out.println();
            System.out.println("             please select which model you want");
            System.out.println();
            System.out.println("                   1.BMW X7");
            System.out.println("                   2.BMW X1");
            System.out.println("                   3.BMW X5");
            System.out.println("                   4.BMW Z4");
            System.out.println("                   5.BMW 7 Series");
    
        } 
}
class elcveh extends four_wheeler
{

	elcveh(int vehicalno, String vehicalcol, String vehicalname, String vehicalpric, String BodyType,
			String TransmissionType, String FuelType, String CityMileage, String max_power)
    {
		super(vehicalno, vehicalcol, vehicalname, vehicalpric, BodyType, TransmissionType, FuelType, CityMileage, max_power);
		
	}
	 public String toString()
     {
         System.out.println("vehical name         : "+vehicalname);
         System.out.println("vehical no           : "+vehicalno);
         System.out.println("vehical clolor       : "+vehicalcol);
         System.out.println("vehical price        : "+vehicalprice);
         System.out.println("vehical power        : "+TransmissionType);
         System.out.println("vehical Transmission : "+max_power);
         System.out.println("vehical range        : "+BodyType);
         System.out.println("vehical Body Type    : "+FuelType);
         System.out.println("vehical bootSpace(lt): "+CityMileage);
         System.out.println("===============================");
         return"";
     }
	 public static void ev()
	    {   
		    System.out.println("        ==========Popular Brands=========    ");
		    System.out.append("");
	        System.out.println("               1.Tata motors Cars");
	        System.out.println("               2.Hyundai Cars    ");
	        System.out.println("               3.volvo Cars");
	       
	    }
	 public static void name()
     {
         System.out.println();
         System.out.println("================>>>>> Hyundai Cars <<<<<================");
         System.out.println();
         System.out.println("            Please select which model you want");
         System.out.println();
         System.out.println("                   1:Hyundai Kona Electric");
        
     }
	 public static void namev()
     {
         System.out.println();
         System.out.println("=====================>>>>> Volvo Cars <<<<<=====================");
         System.out.println();
         System.out.println("              Please select which model you want");
         System.out.println();
         System.out.println("                    1:Volvo XC40 Recharge");
        
     }
	 
	 
	
	
	
}
class login
{
	public static void log() 
	{
	      Scanner sc1=new Scanner(System.in);	      
	    	System.out.println("             please enter your username         ");
	    	String a=sc1.nextLine();
	    	System.out.println("             please enter your passward        ");
	    	String b=sc1.nextLine();
	    	
	    	if(a.equals("vehicle@123")&& b.equals("kachapicha"))
	    	{
	    		vehical.pa1();
	    	}
	    	else 
	    	{
	    		if(!a.equals("vehicle@123"))
	    		{
	    			System.out.println("                 username is wrong             ");
	    		}
	    		else
	    		{
	    			System.out.println("                 paassword is wrong            ");
	    		}
	    		System.out.println("                                               ");
	    		
	    		System.out.println("          please enter correct login details   ");
	    		System.out.println("                                             ");
	    		
	    		System.out.println("      ------------please try again------------ ");
	    		System.out.println("          press any number key to try again     ");
	    		Scanner sc4=new Scanner(System.in);
	    		int h=sc4.nextInt();
	    		if(h<=9) 
	    		{
	    		login.log();
	    		}
	    	}
		
	}
}
class booking///booking
{
	public static void book()
	{
		System.out.println("");
		System.out.println("       Do you want to book your dream vehical");
		System.out.println("");
		System.out.println("                      1.Yes");
		System.out.println("                      2.NO");
		Scanner ref=new Scanner(System.in);
		int a=ref.nextInt();
		if(a==1)
		{
			System.out.println("          Fill the details to book vehical");
			System.out.println("");
			System.out.println("name:");
			Scanner ref1=new Scanner(System.in);
			String d=ref1.nextLine();
			System.out.println("phone number:");
			long g=ref.nextLong();
			System.out.println("pin code:");
			long j=ref.nextLong();
			System.out.println("               pres 1 to submitt");
			int b=ref.nextInt();
			if(b==1)
			{
	    		System.out.println("       we will get back to you shortly....     ");

				System.out.println("   ==============CONGRATULATIONS===============");
			}
			else
			{
				vehical.pa1();
			}
				
		}
		
		if(a==2)
		{
			vehical.pa1();
				
		}
		
	}
}

 
//all kachapicha class Start...................................................................

class vehical 
{
    public static void pa1()
    {

    	System.out.println("        ---------------------------------    ");
    	System.out.println("                                             ");
    	System.out.println("               |welcome to the hub|          ");
    	System.out.println("                                             ");
        System.out.println("        ---------------------------------    ");
        System.out.println("                                             ");       
        System.out.println("                1.two wheeler                ");
        System.out.println("                2.four wheeler               ");
        System.out.println("                3.three wheeler              ");
        System.out.println("                4.six wheeler                ");

        Scanner sc1=new Scanner(System.in);
        String select=sc1.next();
        if(select.equals("1"))///////////////////////////////two wheeler///////////////////////////////////////
        {
            two_wheeler.brand();
    
            
            {
            
              Scanner sc2=new Scanner(System.in);
              String vname=sc2.next();
              if(vname.equals("1"))
              {
                 yamaha.name();

                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                 case 1:
                 two_wheeler ref1=new two_wheeler(00001,"blue","Yamaha FZ-X","1.34","149 cc","12.4 PS @ 7250 rpm","10 L");
                 System.out.println(ref1);
                 booking.book();
                 break;
                 case 2:
    
                 two_wheeler ref2=new two_wheeler(00002,"black","Yamaha MT-15 Version 2.0","1.65","155 cc","18.4 PS @ 10000 rpm","10 L");
                 System.out.println(ref2);
                 booking.book();
                 break;
                 case 3:
    
                 two_wheeler ref3=new two_wheeler(00003,"blue","Yamaha R15s","1.63","155 cc","18.6 PS @ 10000 rpm","11 L");
                 System.out.println(ref3);
                 booking.book();
                 break;
                 case 4:
    
                 two_wheeler ref4=new two_wheeler(00004,"blue","Yamaha R15 V4","1.80","155 cc","18.4 PS @ 10000 rpm","11 L");
                 System.out.println(ref4);
                 booking.book();
                 break;
                 case 5:
    
                 two_wheeler ref5=new two_wheeler(00005,"black","Yamaha FZS-FI V3","1.22","149 cc","12.4 PS @ 7250 rpm","13 L");
                 System.out.println(ref5);
                 booking.book();
                 break;
                 case 6:
    
                 two_wheeler ref6=new two_wheeler(00006,"black","Yamaha FZ-FI V3","1.18","149 cc","12.4 PS @ 7250 rpm","13 L");
                 System.out.println(ref6);
                 booking.book();
				 break;
                 default:
                 System.out.println("error:invalid input");
                 System.out.println("plese press any number key start again");
                 Scanner b=new Scanner(System.in);
                 int select1=b.nextInt();
                 if(select1<=10)
                 {
                   vehical.pa1();
                 }
                 }
                 
                }
                
        
     
               if(vname.equals("2"))
               {
                 re.name();

                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                   case 1:
                   two_wheeler ref1=new two_wheeler(2201," Halycon Black,Halcyon Green,Chrome Red,Redditch Grey,Redditch Red,Signals Marsh Grey,Halcyon Grey,Halycon Green,Gunmetal Grey","Royal Enfield Classic 350","1.18","349.34 cc","20.21 PS @ 6100 rpm","13L");
                   System.out.println(ref1);
                   booking.book();
                   break;
                   case 2:

                   two_wheeler ref2=new two_wheeler(2202," Ventura Storm,DUX Deluxe,British Racing Green,Rocker Red,Mr Clean","Royal Enfield Continental GT 650","3.06 - 3.32 Lakh","648 cc","47.65 PS @ 7150 rpm","13L");
                   System.out.println(ref2);
                   booking.book();
                   break;
                   case 3:

                   two_wheeler ref9=new two_wheeler(2203," Black,Jet Black,Onyx Black,Royal Blue,Regal Red,Bullet Silver","Royal Enfield Bullet 350","Rs.1.48 - 1.63 Lakh","346 cc","19.36 PS @ 5250 rpm","13.5 L");
                   System.out.println(ref9);
                   booking.book();
                   break;
                   case 4:

                   two_wheeler ref10=new two_wheeler(2204," Orange Crush,Mark Two,Baker Express,Canyon Red,Sunset Strip,Downtown Drag,Ventura Blue","Royal Enfield Interceptor 650","Rs.2.89 - 3.15 Lakh","648 cc","47.65 PS @ 7150 rpm","13.7 L");
                   System.out.println(ref10);
                   booking.book();
                   break;
                   case 5:

                   two_wheeler ref11=new two_wheeler(2205," Ventura Storm,DUX Deluxe,British Racing Green,Rocker Red,Mr Clean","Royal Enfield Continental GT 650","Rs.3.06 - 3.32 Lakh","648 cc","47.65 PS @ 7150 rpm","13.7 L");
                   System.out.println(ref11);
                   booking.book();
                   break;
                   case 6:

                   two_wheeler ref12=new two_wheeler(2206," Granite Black,Mirage Silver,Pine Green,Rock Red,Lake Blue,","Royal Enfield Himalayan","Rs.2.15 - 2.22 Lakh","411 cc","24.31 PS @ 6500 rpm","15+/- 0.5 L");
                   System.out.println(ref12);
                   booking.book();
                   break;
                   case 7:

                   two_wheeler ref13=new two_wheeler(2207," Black Custom,Silver Custom,Fireball Red,Supernova Red,Fireball Blue,Stellar Red,Fireball Matt Green,White Custom,Stellar Black","Royal Enfield Meteor 350 Colours","Rs.2.01 - 2.19 Lakh","349 cc","20.4 PS @ 6100 rpm","15 L");
                   System.out.println(ref13);
                   booking.book();
                   break;
                   case 8:

                   two_wheeler ref14=new two_wheeler(2208," Factory Black,Rebel Black,Factory Silver,Rebel Red,Dapper Grey,Rebel Blue,Dapper White,Dapper Ash","Royal Enfield Hunter 350","Rs.1.50 - 1.68 Lakh","349.34 cc","20.4 PS @ 6100 rpm","13 L");
                   System.out.println(ref14);
                   booking.book();
				   break;
                   default:
                   System.out.println("error:invalid input");
                   System.out.println("plese press any number key start again");
                   Scanner b=new Scanner(System.in);
                   int select1=b.nextInt();
                   if(select1<=10)
                   {
                     vehical.pa1();
                   }

                 }
                }
                if(vname.equals("3"))
                {
                 jawa.name();
                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                 case 1:
                 two_wheeler ref15=new two_wheeler(2212,"Black","Jawa Perak","Rs.2.10 Lakh","334 cc","30. 64 PS","14 L");
                 System.out.println(ref15);
                 booking.book();
                 break;

                 case 2:
                 two_wheeler ref16=new two_wheeler(2213,"Allstar Black,Orion Red,Nebula Blue,Starlight Blue,Sirius White,Galactic Green,Lumos Lime,Halley’s Teal","Jawa 42","Rs.1.68 - 1.95 Lakh","293 cc","27. 33 PS","14 L");
                 System.out.println(ref16);
                 booking.book();
                 break;

                 case 3:
                 two_wheeler ref17=new two_wheeler(2214,"Black,Maroon,Grey","Jawa","Rs.1.81 - 1.97 Lakh","293 cc","27.33 PS","14 L");
                 System.out.println(ref17);
                 booking.book();
				 break;
                 default:
                 System.out.println("error:invalid input");
                 System.out.println("plese press any number key start again");
                 Scanner b=new Scanner(System.in);
                 int select1=b.nextInt();
                 if(select1<=10)
                 {
                   vehical.pa1();
                 }
                 }
                }
                
                if(vname.equals("4"))
                {
                  bajaj.name();
                  Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                    case 1:
                    two_wheeler ref18=new two_wheeler(2215,"Brunt Red,Pewter Grey,Metallic Pearl White,Satin Blue","Bajaj Pulsar NS200","Rs.1.38 Lakh","199.5 cc","24.5 PS @ 9750 rpm","12 L");
                  System.out.println(ref18);
                  booking.book();
                  break;

                 case 2:
                 two_wheeler ref19=new two_wheeler(2216,"Charcoal Black,Aurora Green","Bajaj Dominar 400","Rs.2.24 Lakh","373.3 cc","40 PS @ 8800 rpm","13 L");
                 System.out.println(ref19);
                 booking.book();
                 break;
                 
                 case 3:
                 two_wheeler ref20=new two_wheeler(2218,"Neon Green,Solar Red,Neon Silver,","Bajaj Pulsar 125","Rs.82,477 - 89,971","124.4 cc","11.8 PS @ 8500 rpm","11.5 L");
                 System.out.println(ref20);
                 booking.book();
                 break;

                 case 4:
                 two_wheeler ref21=new two_wheeler(2219,"Burnt Red,Pewter Grey,White,","Bajaj Pulsar RS200","Rs.1.69 Lakh","199.5 cc","24.5 PS @ 9750 rpm","13 L");
                 System.out.println(ref21);
                 booking.book();
                 break;

                 case 5:
                 two_wheeler ref22=new two_wheeler(2220,"Sparkle Black Red,Sparkle Black Silver,Red,Sapphire Black Blue,Silver,Lime Green","Bajaj Pulsar 150","Rs.1.05 - 1.15 Lakh","149.5 cc","14 PS @ 8500 rpm","15 L");
                 System.out.println(ref22);
                 booking.book();
                 break;

                 case 6:
                 two_wheeler ref23=new two_wheeler(2222,"Fiery Orange,Brunt Red,Pewter Grey,Beach Blue","Bajaj Pulsar NS 125","Rs.1.05 Lakh","124.4 cc","11.99 PS @ 8500 rpm","12 L");
                 System.out.println(ref23);
                 booking.book();
                 break;

                 case 7:
                 two_wheeler ref25=new two_wheeler(2224,"Moon White,Auburn Black","Bajaj Avenger Cruise 220","Rs.1.37 Lakh","220 cc","19.03 PS @ 8500 rpm","13 L");
                 System.out.println(ref25);
                 booking.book();
				 break;
                 default:
                 System.out.println("error:invalid input");
                 System.out.println("plese press any number key start again");
                 Scanner b=new Scanner(System.in);
                 int select1=b.nextInt();
                 if(select1<=10)
                 {
                   vehical.pa1();
                 }
                 
                 }

                }
                if(vname.equals("5"))
                {
                 honda2w.name();
                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                 case 1:
                 two_wheeler ref26=new two_wheeler(2225,"Mat Ballistic Black Metallic,Pearl Glare White Tricolour","Honda CRF1100L Africa Twin","Rs.16.02 - 17.56 Lakh","1082.96 cc","99.2 PS @ 7500 rpm","24.5 L");
                 System.out.println(ref26);
                 booking.book();
                 break;

                 case 2:
                 two_wheeler ref27=new two_wheeler(2226,"Matt Gunpowder Black Metallic,Grand Prix Red","Honda CB500X","Rs.5.80 Lakh","471.03 cc","47.5 PS @ 8500 rpm","17.7 L");
                 System.out.println(ref27);
                 booking.book();
                 break;

                 case 3:
                 two_wheeler ref28=new two_wheeler(2227,"Sports Red,Mat Axis Grey Metallic,Mat Marvel Blue Metallic","Honda CB300F","Rs.2.26 - 2.29 Lakh","293.52 cc","24.4 PS @ 7500 rpm","14.1 L");
                 System.out.println(ref28);
                 booking.book();
                 break;

                 case 4:
                 two_wheeler ref29=new two_wheeler(2227,"Matte Pearl Morion Black,Grand Prix Red","Honda CBR1000RR-R","Rs.23.56 - 24.07 Lakh","1000 cc","217.5 PS @ 14500 rpm","16.1 L");
                 System.out.println(ref29);
                 booking.book();
                 break;

                 case 5:
                 two_wheeler ref30=new two_wheeler(2228,"Black,Matte Axis Grey Metallic,Pearl Precious White,Mat Sangria Red Metallic,Mat Marshal Green Metallic,Rebel Red Metallic,Matte Magnificent Copper Metallic,Decent Blue,Pearl Siren Blue","Honda Activa 6G","Rs.73,519 - 76,519","109.51 cc","8.84 Nm @ 5500 rpm","5.3 L");
                 System.out.println(ref30);
                 booking.book();
                 break;

                 case 6:
                 two_wheeler ref31=new two_wheeler(2229,"Imperial Red Metallic,Pearl Igneous,Mat Axis Gray Metallic","Honda Unicorn","Rs.1.05 Lakh","162.7 cc","12.91 PS @ 7500 rpm","13 L");
                 System.out.println(ref31);
                 booking.book();
                 break;
                 case 7:
                 two_wheeler ref32=new two_wheeler(2230,"Mat Sangria Red Metallic,Sports Red,Mat Axis Grey Metallic,Strontium Silver Metallic With Black,Matte Marvel Blue Metallic,Vibrant Orange,Dazzie Yellow Metallic,Mat Axis Grey Metallic","Honda Dio","Rs.71,502 - 79,099","109.51 cc","7.76 PS @ 8000 rpm","5.3 L");
                 System.out.println(ref32);
                 booking.book();
                 break;

                 case 8:
                 two_wheeler ref33=new two_wheeler(2231,"Pearl Igneous Black,Matte Sangria Red Metallic,Matte Marvel Blue Metallic,Matte Axis Grey Metallic"," Honda SP 125","Rs.83,088 - 87,088","123.94 cc","10.8 PS @ 7500 rpm","11 L");
                 System.out.println(ref33);
                 booking.book();
                 break;

                 case 9:
                 two_wheeler ref34=new two_wheeler(2235,"Gunmetal Black Metallic Mat Morion Black"," Honda Gold Wing","Rs.39.72 Lakh","1833 cc","126.4 PS @ 5500 rpm","21.1 L");
                 System.out.println(ref34);
                 booking.book();
				 break;
                 default:
                 System.out.println("error:invalid input");
                 System.out.println("plese press any number key start again");
                 Scanner b=new Scanner(System.in);
                 int select1=b.nextInt();
                 if(select1<=10)
                 {
                   vehical.pa1();
                 }
                 }
                }
                if(vname.equals("6"))
                {
                 tvs.name();
                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                 case 1:
                 two_wheeler ref36=new two_wheeler(2237,"blue"," TVS Apache RTR 160","Rs.1.18 - 1.25 Lakh","159.7 cc","13.85 Nm @ 7000 rpm","12 L");
                 System.out.println(ref36);
                 booking.book();
                 break;

                 case 2:
                 two_wheeler ref37=new two_wheeler(2237,"black"," TVS Apache RTR 180","Rs.1.31 Lakh","177.4 cc","15.5 Nm @ 7000 rpm","12 L");
                 System.out.println(ref37);
                 booking.book();
                 break;

                 case 3:
                 two_wheeler ref38=new two_wheeler(2238,"Royal Wine,Midnight Black,Titanium Grey,Pristine White,Metallic Titanium Grey,Walnut Brown,New Metallic Red,Indiblue,Starlight Blue"," TVS Jupiter","Rs.70,959 - 84,609","109.7 cc","7.88 PS @ 7500 rpm","6 L");
                 System.out.println(ref38);
                 booking.book();
                 break;

                 case 4:
                 two_wheeler ref39=new two_wheeler(2239,"Black Red,Red Black,Grey Black,Blue Silver"," TVS Star City Plus","Rs.70,705 - 73,455","109.7 cc","8.19 PS @ 7350 rpm","10 L");
                 System.out.println(ref39);
                 booking.book();
                 break;

                 case 5:
                 two_wheeler ref40=new two_wheeler(2240,"Titanium Black,Racing Red"," TVS Apache RR 310","Rs.2.65 Lakh","312.2 cc","34 PS @ 9700 rpm","11 L");
                 System.out.println(ref40);
                 booking.book();
                 break;

                 case 6:
                 two_wheeler ref41=new two_wheeler(2242,"Blue"," TVS Apache RTR 200 4V","Rs.1.36 - 1.41 Lakh","197.75 cc","20.82 PS @ 8500 rpm","12 L");
                 System.out.println(ref41);
                 booking.book();
				 break;
                 default:
                 System.out.println("error:invalid input");
                 System.out.println("plese press any number key start again");
                 Scanner b=new Scanner(System.in);
                 int select1=b.nextInt();
                 if(select1<=10)
                 {
                   vehical.pa1();
                 }
                 }
                }
                if(vname.equals("7"))
               {
                 hero.name();

                 Scanner a=new Scanner(System.in);
                 int slect=a.nextInt();
                 switch(slect)
                 {
                     case 1:
                     two_wheeler ref1=new two_wheeler(2201," Beetle Red,Pearl White,Black With Silver,Black With Sports Red,Tornado Grey,Sparkling Beta Blue,Bumble Bee Yellow,Heavy Grey With Green,Firefly Golden","Hero Splendor Plus","Rs.70,708 - 74,928","97.2 cc","8 PS @ 8000 rpm","9.8 L");
                     System.out.println(ref1);
                     booking.book();
                     break;
                     case 2:

                     two_wheeler ref2=new two_wheeler(2202," Black With Sports Red,Candy Blazing Red,Heavy Grey With Black,Nexus Blue,Techno Blue","Hero HF Deluxe","Rs.60,020 - 66,470","97.2 cc","8.02 PS @ 8000 rpm","9.6 L");
                     System.out.println(ref2);
                     booking.book();
                     break;
                     case 3:

                     two_wheeler ref9=new two_wheeler(2203," Black With Force Silver,Sports Red,Candy Blazing Red,Heavy Grey Metallic,Black With Polestar Blue","Hero Passion Pro","Rs.71,820 - 79,065","113.2 cc","9.15 PS @ 7500 rpm","10 L");
                     System.out.println(ref9);
                     booking.book();
                     break;
                     case 4:

                     two_wheeler ref10=new two_wheeler(2204," Sports Red,White,Panther Black,Matte Green,Polestar Blue,Matt Nexus Blue","Hero XPulse 200","Rs.1.27 - 1.52 Lakh","199.6 cc","19.17 PS @ 8500 rpm","13 L");
                     System.out.println(ref10);
                     booking.book();
                     break;
                     case 5:

                     two_wheeler ref11=new two_wheeler(2205," Sports Red,Panther Black,Pearl Silver White","Hero Xtreme 200S","Rs.1.35 Lakh","199.6 cc","18.08 PS @ 8500 rpm","12.8 L");
                     System.out.println(ref11);
                     booking.book();
                     break;
                     case 6:

                     two_wheeler ref12=new two_wheeler(2206," Granite Black,Mirage Silver,Pine Green,Rock Red,Lake Blue,","Royal Enfield Himalayan","Rs.2.15 - 2.22 Lakh","411 cc","24.31 PS @ 6500 rpm","15+/- 0.5 L");
                     System.out.println(ref12);
                     booking.book();
					 break;
                     default:
                     System.out.println("error:invalid input");
                     System.out.println("plese press any number key start again");
                     Scanner b=new Scanner(System.in);
                     int select1=b.nextInt();
                     if(select1<=10)
                      {
                         vehical.pa1();
                      }

                    }
                }
            }
        }
    
        
        if(select.equals("2"))///////////////////////////////four wheeler///////////////////////////////////////
        {
            four_wheeler.type();  //ice or ev
            Scanner a=new Scanner(System.in);
            String select2=a.next();


            if(select2.equals("1")) //ice block
            {
                four_wheeler.brand();

                Scanner b=new Scanner(System.in);
                String select3=b.next();
                if(select3.equals("1"))//tata motors
                {
                    tata.name();

                    Scanner sc = new Scanner(System.in);
                    int slect = sc.nextInt();
                    switch (slect)
                    {
                      case 1:
                      four_wheeler ref1=new four_wheeler(2211, "Atomic Orange,Grassland Beige,Tropical Mist,Meteor Bronze,Tornado Blue,Calypso Red,Orcus White,", "Tata Punch", "Rs.5.93 - 9.49 Lakh", "SUV", "Automatic", "Petrol", "14.42 kmpl","113Nm@3300+/-100rpm");
                      System.out.println(ref1);
                      booking.book();
                      break;
                      case 2:
                      four_wheeler ref2=new four_wheeler(2212, "Grassland Beige,Starlight,Flame Red,Calgary White,Foliage Green,Royal Blue,Daytona Grey,Atlas Black", "Tata Nexon", "Rs.7.60 - 14.08 Lakh", "Automatic", "Diesel", "18.5 kmpl", "SUV","108.49bhp@4000rpm");
                      System.out.println(ref2);
                      booking.book();
                      break;
                      case 3:
                      four_wheeler ref3=new four_wheeler(2213, "Grassland Beige,Tropical Mist,Starlight,Calypso Red,Royale Blue,Orcus White,Daytona Grey,Oberon Black", "Tata Harrier", "Rs.14.70 - 22.20 Lakh", "Automatic", "Diesel", "14.6 kmpl", "SUV","167.67bhp@3750rpm");
                      System.out.println(ref3);
                      booking.book();
                      break;
                      case 4:
                      four_wheeler ref4=new four_wheeler(2214, "Midnight Plum,Flame Red,Opal White,Arizona Blue,Daytona Grey", "Tata Tiago", "Rs.5.40 - 7.82 Lakh", "Manual", "Petrol", "14.6 kmpl", "SUV","95nm@3500rpm");
                      System.out.println(ref4);
                      booking.book();
                      break;
                      case 5:
                      four_wheeler ref5=new four_wheeler(2215, "Arcade Grey,High Street Gold,Opera Blue,Downtown Red,Avenue White,Harbour Blue,Cosmo Dark", "Tata Altroz", "Rs.6.30 - 10.25 Lakh", "Manual", "Diesel", "23.03 kmpl", "Hatchback","88.77bhp@4000rpm");
                      System.out.println(ref5);
                      booking.book();
                      break;
                      case 6:
                      four_wheeler ref6=new four_wheeler(2216, "Deep Red,Opal White,Magnetic Red,Arizona Blue,Daytona Grey", "Tata Tigor", "Rs.6.00 - 8.59 Lakh", "Manual", "Petrol", "26.93 km/kg", "Sedan","72.40bhp@6000rpm");
                      System.out.println(ref6);
                      booking.book();
                      break;
                      case 7:
                      four_wheeler ref7=new four_wheeler(2217, "Grassland Beige,Tropical Mist,Magnetic Red,Starlight,Black Gold,White Gold,Royal Blue,Tropocal Mist Adventure,", "Tata Safari", "Rs.15.35 - 23.56 Lakh", "Automatic", "Diesel", "14.0 kmpl", "SUV","167.67bhp@3750rpm");
                      System.out.println(ref7);
                      booking.book();
                      break;
                      case 8:
                      four_wheeler ref8=new four_wheeler(2218, "Foresta Green,Cloudy Gray,Snow White,Fire Red", "Tata Tiago NRG", "Rs.6.42 - 7.38 Lakh", "Automatic", "Petrol", "18.0 kmpl", "Hatchback","84.48bhp@6000rpm");
                      System.out.println(ref8);
                      booking.book();
					  break;
                      default:
                      System.out.println("error:invalid input");
                      System.out.println("plese press any number key start again");
                      Scanner c=new Scanner(System.in);
                      int select1=c.nextInt();
                      if(select1<=10)
                      { 
                         vehical.pa1();
                      }
                    }
                   
 
                }
                
                if(select3.equals("2"))//Maruti Suzuki Cars
                {
                      suzuki.name();

                      Scanner w = new Scanner(System.in);
                      int slect2 = w.nextInt();
                      switch (slect2) 
                      {
                         case 1:
                         four_wheeler ref1=new four_wheeler(2219, "Pearl Arctic White,Esxuberant Blue,Brave Khaki With Pearl Arctic White,Magma Grey,Sizzling Red With Midnight Black Roof,Sizzling Red,Splendid Silver,Splendid Silver With Midnight Black Roof", "Maruti Brezza", "Rs.7.99 - 13.96 Lakh", "Automatic", "Petrol", "19.8 kmpl", "SUV","101.65bhp@6000rpm");
                         System.out.println(ref1);
                         booking.book();
                         break;
                         case 2:
                         four_wheeler ref2=new four_wheeler(2220, "Solid Fire Red,Pearl Arctic White,Pearl Arctic White Pearl Metallic Midnight Blue", "Maruti Swift", "Rs.5.92 - 8.85 Lakh", "Automatic", "Petrol", "21.0 kmpl", "Hatchback","88.50bhp@6000rpm");
                         System.out.println(ref2);
                         booking.book();
                         break;
                         case 3:
                         four_wheeler ref3=new four_wheeler(2221, "Arctic White,Opulent Red,Luxe Beige,Grandeur Grey,Luxe Beige,Nexa Blue,Splendid Silver", "Maruti Baleno", "Rs.6.49 - 9.71 Lakh", "Automatic", "Petrol", "19.0 kmpl", "Hatchback","88.50bhp@6000rpm");
                         System.out.println(ref3);
                         booking.book();
                         break;
                         case 4:
                         four_wheeler ref4=new four_wheeler(2222, "Silky Silver,Uptown Red,Mojito Green,Granite Grey,Solid White,Cerulean Blue", "Maruti Alto 800", "Rs.3.39 - 5.03 Lakh", "Manual", "Petrol", "25.0 km/kg", "Hatchback","40.36bhp@6000rpm");
                         System.out.println(ref4);
                         booking.book();
                         break;
                         case 5:
                         four_wheeler ref5=new four_wheeler(2223, "Pearl Metallic Dignity Brown,Pearl Metallic Arctic White,Prime Oxford Blue,Magma Grey,Auburn Red,Splendid Silver", "Maruti Ertiga", "Rs.8.41 - 12.79 Lakh", "Automatic", "Petrol", "20.3 kmpl", "MUV","101.65bhp@6000rpm");
                         System.out.println(ref5);
                         booking.book();
                         break;
                         case 6:
                         four_wheeler ref6=new four_wheeler(2224, "Silky Silver,PRIME-GALLANT-RED,POOLSIDE BLUE,NUTMEG BROWN,PRime-Gallant Red Plus Black,Solid White", "Maruti Wagon R", "Rs.5.47 - 7.20 Lakh", "Manual/Automatic", "Petrol", "34.05 km/kg", "Hatchback","88.50bhp@6000rpm");
                         System.out.println(ref6);
                         booking.book();
                         break;
                         case 7:
                         four_wheeler ref7=new four_wheeler(2225, "Silky Silver,PRIME-GALLANT-RED,POOLSIDE BLUE,NUTMEG BROWN,PRime-Gallant Red Plus Black,Solid White", "Maruti S-Cross", "Rs.8.95 - 12.92 Lakh", "Manual/Automatic", "Petrol", "16.0 kmpl", "SUV","103.25bhp@6000rpm");
                         System.out.println(ref7);
                         booking.book();
						 break;
                         default:
                         System.out.println("error:invalid input");
                         System.out.println("plese press any number key start again");
                         Scanner e = new Scanner(System.in);
                         int select1 = e.nextInt();
                         if (select1 <= 10)
                          {
                             vehical.pa1();
                          }
                       }

                }
                if(select3.equals("3"))//Kia Cars
                {
                       kia.name();

                      Scanner e = new Scanner(System.in);
                      int slect3 = e.nextInt();
                      switch (slect3) 
                      {
                          case 1:
                          four_wheeler ref1=new four_wheeler(2226, "Intense Red,Punchy Orange,Glacier White Pear,Clear White,Aurora Black Pearl,Red With Black", "Kia Seltos", "Rs.10.49 - 18.65 Lakh", "Automatic", "Diesel", "18.0 kmpl", "SUV","113.43bhp@4000rpm");
                          System.out.println(ref1);
                          booking.book();
                          break;
                          case 2:
                         four_wheeler ref2=new four_wheeler(2227, "Intense Red,Beige Gold With Aurora Black Pearl,Aurora Black Pearl,Intelligence BlueGravity Gray", "Kia Sonet", "Rs.7.49 - 13.99 Lakh", "Automatic", "Diesel", "18.4 kmpl", "suv","113.43bhp@4000rpm");
                         System.out.println(ref2);
                         booking.book();
                         break;
                         case 3:
                         four_wheeler ref3=new four_wheeler(2228, "Intense Red,Glacier White Pearl,Moss Brown,Clear White,Aurora Black Pearl,Gravity Gray,Imperial Blue", "Kia Carens", "Rs.9.60 - 17.70 Lakh", "Automatic", "Diesel", "18.4 kmpl", "MUV","113.42bhp@4000rpm");
                         System.out.println(ref3);
                         booking.book();
                         break;
                         case 4:
                         four_wheeler ref4=new four_wheeler(2229, "Glacier White Pearl,Steel Silver,Aurora Black Pearl", "Kia Carnival", "Rs.30.99 - 35.49 Lakh", "Automatic", "Diesel", "14.11 kmpl", "MUV","197.26bhp@3800rpm");
                         System.out.println(ref4);
                         booking.book();
						 break;
                         default:
                         System.out.println("error:invalid input");
                         System.out.println("plese press any number key start again");
                         Scanner g=new Scanner(System.in);
                         int select1=g.nextInt();
                         if(select1<=10)
                         { 
                             vehical.pa1();
                         }
                        }
                    

                }
                if(select3.equals("4"))//Audi Car
                {
                     audi.name();

                     Scanner f = new Scanner(System.in);
                     int slect4 = f.nextInt();
                     switch (slect4) 
                       {
                         case 1:
                         four_wheeler ref1=new four_wheeler(22130, "Carrara White Solid,Floret Silver Metallic,Mythos Black Metallic,Samurai-Gray-Metallic,Navarra Blue Metallic", "Audi Q7", "Rs.82.49 - 89.90 Lakh", "Automatic", "Petrol", "11.21 kmpl", "SUV","335.25bhp@5200-6400rpm");
                         System.out.println(ref1);
                         booking.book();
                         break;
                         case 2:
                         four_wheeler ref2=new four_wheeler(2231, "Firmament Blue Metallic,Typhoon Gray Metallic,Myth Black Metallic,Ibis White,Seville Red Metallic", "Audi A6", "Rs.59.99 - 65.99 Lakh", "Automatic", "Petrol", "14.11 kmpl", "Sedan","241.3bhp@5000-6500rpm");
                         System.out.println(ref2);
                         booking.book();
                         break;
                         case 3:
                         four_wheeler ref3=new four_wheeler(2232, "Glacier White Metallic,Pulse Orange Solid,Chronos Grey Metallic,Navarra Blue Metallic,Mythos Black Metallic", "Audi Q3", "Rs.44.89 - 50.39 Lakh", "Automatic", "Petrol", "18.4 kmpl", "suv","187.74bhp@1500-4100rpm");
                         System.out.println(ref3);
                         booking.book();
                         break;
                         case 4:
                         four_wheeler ref4=new four_wheeler(2233, "Glacier White Pearl,Steel Silver,Aurora Black Pearl", "Audi RS Q8", "Rs.2.17 Cr", "Automatic", "Petrol", "8.26 kmpl", "suv","591.39bhp@6000rpm");
                         System.out.println(ref4);
                         booking.book();
						 break;
                         default:
                         System.out.println("error:invalid input");
                         System.out.println("plese press any number key start again");
                         Scanner m=new Scanner(System.in);
                         int select1=m.nextInt();
                         if(select1<=10)
                          { 
                             vehical.pa1();
                          }
                    

                        }
                }
                if(select3.equals("5"))//BMW Cars
                {
                     bmw.name();

                     Scanner g = new Scanner(System.in);
                     int slect5 = g.nextInt();
                     switch (slect5) 
                     {
                       case 1:
                       four_wheeler ref1=new four_wheeler(2234, "Storm Bay Metallic,Alpine White,Sunset Orange,Mediterranean Blue,Sparking Brown Metallic,Black Sapphire", "BMW X7", "Rs.1.18 - 1.78 Cr", "Automatic", "Diesel", "19.62 kmpl", "SUV","187.74bhp@5000-6000rpm");
                       System.out.println(ref1);
                       booking.book();
                       break;
                       case 2:
                       four_wheeler ref2=new four_wheeler(2235, "Firmament Blue Metallic,Typhoon Gray Metallic,Myth Black Metallic,Ibis White,Seville Red Metallic", "BMW X1", "Rs.41.50 - 44.50 Lakh", "Automatic", "Diesel", "14.11 kmpl", "Sedan","241.3bhp@5000-6500rpm");
                       System.out.println(ref2);
                       booking.book();
                       break;
                       case 3:
                       four_wheeler ref3=new four_wheeler(226, "Phytonic Blue,Mineral White,Black Sapphire", "BMW X5", "Rs.79.90 - 97.90 Lakh", "Automatic", "Diesel", "13.38 kmpl", "suv","261.50bhp@4000rpm");
                       System.out.println(ref3);
                       booking.book();
                       break;
                       case 4:
                       four_wheeler ref4=new four_wheeler(2237, "Alpine White,Mineral White,Mediterranean Blue,San Francisco Red Metallic,Glacier Silver,Black Sapphire Metallic", "BMW Z4", "Rs.71.90 - 84.90 Lakh", "Automatic", "Petrol", "11.29 kmpl", "Convertible","335bhp@5000-6500rpm");
                       System.out.println(ref4);
                       booking.book();
                       break;
                       case 5:
                       four_wheeler ref5=new four_wheeler(2238, "Cashmere Silver,Brilliant White Metallic,Azurite Black Metallic,Tanzanite Blue,Black,Dravit Grey Metallic,Red Metacllic", "BMW 7 Series", "Rs.1.42 - 1.76 Cr", "Automatic", "Petrol", "39.53 kmpl", "Sedan","281.6bhp@5000-6000rpm");
                       System.out.println(ref5);
                       booking.book();
					   break;
                       default:
                       System.out.println("error:invalid input");
                       System.out.println("plese press any number key start again");
                       Scanner h=new Scanner(System.in);
                       int select1=h.nextInt();
                       if(select1<=10)
                       { 
                         vehical.pa1();
                       }
                    }
                }
            }
            if(select2.equals("2")) //ev block
            {
            	elcveh.ev();
            	Scanner ref=new Scanner(System.in);
            	int g=ref.nextInt();
            	///////////////////////////
            	if(g==1)
            	{
            		tata.evname();
            		Scanner ref2=new Scanner(System.in);
            		int k=ref2.nextInt();
            		switch(k)
            		{
            		case 1:
                    elcveh ref1=new elcveh(22130, "Signature Teal Blue,Teal Blue Dual Tone,Daytona Grey Dual Tone,Daytona Grey ", "Tata Tigor EV", "Rs.12.49 - 13.64 Lakh", "306km", "73.75bhp", "SUV", "316","Automatic");
                    System.out.println(ref1);
                    booking.book();
                    break;
            		case 2:
                        elcveh ref3=new elcveh(22130, "Glacier White,Signature Teal Blue,Midnight Black,Bronze With Platinum Silver ", "Tata Nexon EV Prime", "Rs.14.99 - 17.50 Lakh", "312km", "127bhp", "SUV", "350","Automatic");
                        System.out.println(ref3);
                        booking.book();
                        break; 
            		case 3:
                        elcveh ref5=new elcveh(22130, "Pristine White,Intensi Teal,Daytona Grey,Bronze With Platinum Silver ", "Tata Nexon EV Max", "Rs.18.34 - 20.04 Lakh", "437km", "141.04bhp", "SUV", "350","Automatic");
                        System.out.println(ref5);
                        booking.book();
                        break;
                    default:
                    System.out.println("error:invalid input");
                    System.out.println("plese press any number key start again");
                    Scanner m=new Scanner(System.in);
                    int select1=m.nextInt();
                    if(select1<=10)
                     { 
                        vehical.pa1();
                     }
            	
            		}
        	    }
            	if(g==2)
            	{
            		elcveh.name();
            		Scanner ref2=new Scanner(System.in);
            		int k=ref.nextInt();
            		switch(k)
            		{
            		case 1:
                    elcveh ref1=new elcveh(22130, "Titan Grey With Phantom Black Roof,Polar White With Phantom Black,Fiery Red With Phantom Black ", "Hyundai Kona Electric", "Rs.23.84 - 24.03 Lakh", "306km", "134.10bhp", "SUV", "316","Automatic");
                    System.out.println(ref1);
                    booking.book();
                    break;                  
                    default:
                    System.out.println("error:invalid input");
                    System.out.println("plese press any number key start again");
                    Scanner m=new Scanner(System.in);
                    int select1=m.nextInt();
                    if(select1<=10)
                     { 
                        vehical.pa1();
                     }
            	
            		}
        	    }
        	
        		if(g==3)
            	{
        			elcveh.namev();
            		Scanner ref2=new Scanner(System.in);
            		int k=ref.nextInt();
            		switch(k)
            		{
            		case 1:
                    elcveh ref1=new elcveh(22130, "Onyx Black,Fjord Blue,Crystal White,Thunder Gray ", "Volvo XC40 Recharge", "Rs.55.90 Lakh", "418km", "402.30bhp", "SUV", "414l","Automatic");
                    System.out.println(ref1);
                    booking.book();
                    break;                  
                    default:
                    System.out.println("error:invalid input");
                    System.out.println("plese press any number key start again");
                    Scanner m=new Scanner(System.in);
                    int select1=m.nextInt();
                    if(select1<=10)
                     { 
                        vehical.pa1();
                     }
            	
            		}
            		
        	    }

            } 
             
        }
                  
        if(select.equals("3"))////////////////////three wheeler
        {
        	System.out.println("         ");
        	System.out.println("      oops...page not foud!!!!     ");
        	System.out.println("   Check your internet connection     ");

        	System.out.println("         ");
        	System.out.println("   plese press any number key start again");
        	Scanner m=new Scanner(System.in);
            int select1=m.nextInt();
            if(select1<=10)
             { 
                vehical.pa1();
             }
        }
        if(select.equals("4"))////////////////////six wheeler
        {
        	System.out.println("         ");
        	System.out.println("          oops...page not foud!!!!    ");
        	System.out.println("      Check your internet connection     ");
        	System.out.println("         ");
        	System.out.println("   plese press any number key start again");
        	Scanner m=new Scanner(System.in);
            int select1=m.nextInt();
            if(select1<=10)
             { 
                vehical.pa1();
             }
        }
   
    }
}
           
        
    

         
class vehical1
{
    public static void login()////log in 
    {
    	
    	System.out.println("        ---------------------------------    ");
    	System.out.println("                    AUTO HUB                 ");
    	System.out.println("        ---------------------------------    ");
    
    	
    	System.out.println("                     1.login                  ");
        System.out.println("                2.create new account           ");
        Scanner sc=new Scanner(System.in);
        int select=sc.nextInt();
        if(select==1)
        {	
        	login.log();
        
      
        }
        if(select==2)/////////create new account
        {
        Scanner ge=new Scanner(System.in);
        
        System.out.println("               please enter your name                      ");
        String name=ge.next();
        Scanner gf=new Scanner(System.in);
        
    	System.out.println("             please create your username        ");
    	String username=gf.next();
    	

    	System.out.println("             please create your passward        ");
    	String pass=gf.next();
    	
    	System.out.println("   congratulations your account is created succsesfully   ");
    	
    	System.out.println("                        hey "+name                  );
    	System.out.println("             ==> your user name is:"+username     );
    	System.out.println("             ==> your password is :"+pass         );
    	System.out.println("                                                  ");
    	
    	System.out.println("      ");
    	System.out.println("                try with new login details                ");
    	System.out.println("      ");
    	Scanner sc5=new Scanner(System.in);
    	System.out.println("          press any number key to try again     ");
    	int t=sc5.nextInt();
    	if(t<=9)
    	{
    		
    	System.out.println("        ---------------------------------    ");
        System.out.println("                    AUTO HUB                 ");
        System.out.println("        ---------------------------------    ");
        System.out.println("                     login                  ");
    	Scanner sc1=new Scanner(System.in);
    	
    	System.out.println("            please enter your username         ");
    	String a=sc1.next();
    	
    	System.out.println("            please enter your passward         ");
    	String b=sc1.next();
    	
    	
    	if(a.equals(username)&& b.equals(pass))
    	{
    		vehical.pa1();
    	}
    	else
    	{
    		System.out.println("     please enter correct login details     ");
    		vehical1.login();
    	}
    	
    	}

        }
        
    }

}

class v1
{
	public static void main(String[]args)
	{
		vehical1.login();
		System.out.println("     press any number key to go back");
		Scanner ref=new Scanner(System.in);
		int a=ref.nextInt();
		if(a<=9)
		{
			vehical.pa1();
		}
			
		
		
	}
	
}

