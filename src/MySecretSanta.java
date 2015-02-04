import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class MySecretSanta {
	LinkedList<Name> mylist = new LinkedList<Name>();

	Name chani = new Name("Chani", 1);
	Name hemi = new Name("Hemi", 1);
	Name shruti = new Name("Shruti", 1);
	Name deepan = new Name("Deepan", 2);
	Name jazmine = new Name("Jazmine", 2);
	Name janvi = new Name("Janvi", 3);
	Name nehna = new Name("Nehna", 3);
	Name samir = new Name("Samir", 4);
	Name ankita = new Name("Ankita", 4);
	Name jay = new Name("Jay", 5);
	Name geena = new Name("Geena", 5);
	Name mohini = new Name("Mohini", 5);
	Name jenisha = new Name("Jenisha",6);
	Name neha = new Name("Neha", 6);
	Name sagar = new Name("Sagar", 7);
	Name viresh = new Name("Viresh", 7);
	Name suraj = new Name("Suraj",8);
	Name hardik = new Name("Hardik", 8);
	Name mehal = new Name("Mehal", 9);
	Name viren = new Name("Viren", 10);
	Name smitesh = new Name("Smitesh", 11);
	Name depeeka = new Name("Depeeka", 12);
	Name raina = new Name("Raina", 13);
	Name raj = new Name("Raj", 14);
	Name bhavi = new Name("Bhavi",14);


	public void addFamily(){

		mylist.add(chani);		mylist.add(chani);
		mylist.add(hemi);		mylist.add(hemi);
		mylist.add(shruti);		mylist.add(shruti);
		mylist.add(samir);		mylist.add(samir);
		mylist.add(ankita); 	mylist.add(ankita);
		mylist.add(geena);		mylist.add(geena);
		mylist.add(jenisha); 	mylist.add(jenisha);
		mylist.add(suraj);		mylist.add(suraj);
		mylist.add(mehal);		mylist.add(mehal);
		mylist.add(smitesh);	mylist.add(smitesh);
		mylist.add(depeeka);	mylist.add(depeeka);

		
		mylist.add(deepan);		mylist.add(deepan);		mylist.add(deepan);		mylist.add(deepan);
		mylist.add(jazmine);	mylist.add(jazmine);	mylist.add(jazmine);	mylist.add(jazmine);
		mylist.add(janvi);		mylist.add(janvi);		mylist.add(janvi);		mylist.add(janvi);
		mylist.add(nehna);		mylist.add(nehna);		mylist.add(nehna);		mylist.add(nehna);
		mylist.add(jay);		mylist.add(jay);		mylist.add(jay);		mylist.add(jay);
		mylist.add(mohini);		mylist.add(mohini);		mylist.add(mohini);		mylist.add(mohini);
		mylist.add(neha);		mylist.add(neha);		mylist.add(neha);		mylist.add(neha);
		mylist.add(sagar);		mylist.add(sagar);		mylist.add(sagar);		mylist.add(sagar);
		mylist.add(viresh);		mylist.add(viresh);		mylist.add(viresh);		mylist.add(viresh);
		mylist.add(hardik);		mylist.add(hardik);		mylist.add(hardik);		mylist.add(hardik);
		mylist.add(viren);		mylist.add(viren);		mylist.add(viren);		mylist.add(viren);
		mylist.add(raina);		mylist.add(raina);		mylist.add(raina);		mylist.add(raina);
		mylist.add(raj);		mylist.add(raj);		mylist.add(raj);		mylist.add(raj);
		mylist.add(bhavi);		mylist.add(bhavi);		mylist.add(bhavi);		mylist.add(bhavi);

	}

	public int size(){
		return mylist.size();
	}

	public 	HashSet<Name> select(int number, int familyNumber){

		HashSet<Name> hs=new HashSet<Name>();
		hs.clear();
		Collections.shuffle(mylist);
		Random random = new Random(); //Create random class object

		while(hs.size()<number){
			Collections.shuffle(mylist);
			int randomNumber = random.nextInt(mylist.size());
			Name select =  mylist.get(randomNumber);

			if(select.getFamily() == familyNumber ||hs.contains(select)==true){
				Collections.shuffle(mylist);
				randomNumber = random.nextInt(mylist.size());
				select =  mylist.get(randomNumber);
			}else{
				hs.add(select);
				mylist.remove(randomNumber);

			}
		}

		return hs;
	}


	public static void main(String[] args){

		MySecretSanta secretSantaList = new  MySecretSanta();
		secretSantaList.addFamily();

		System.out.println("Size " +secretSantaList.size());

		HashSet<Name> a5 = secretSantaList.select(10,5);
		System.out.println("Geena/Jay/Mohini has" +a5.toString());

		HashSet<Name> a2 = secretSantaList.select(8,2);
		System.out.println("Deepan/Jazmine has" +a2.toString());

		HashSet<Name> a3 = secretSantaList.select(8,3);
		System.out.println("Janvi/Nehna has" +a3.toString());

		HashSet<Name> a4 = secretSantaList.select(4,4);
		System.out.println("Anki/Sami has" +a4.toString());

		HashSet<Name> a1 = secretSantaList.select(6,1);
		System.out.println("SHCD has" +a1.toString());

		HashSet<Name> a6 = secretSantaList.select(6,6);
		System.out.println("Jenisha/Neha has" +a6.toString());

		HashSet<Name> a7 = secretSantaList.select(8,7);
		System.out.println("Sagar/Viresh has" +a7.toString());

		HashSet<Name> a14 = secretSantaList.select(8,14);
		System.out.println("Raj/Bhavi has" +a14.toString());		

		HashSet<Name> a8 = secretSantaList.select(6,8);
		System.out.println("Suraj/Hardik has" +a8.toString());

		HashSet<Name> a13 = secretSantaList.select(4,13);
		System.out.println("Kalpita/Niraj has" +a13.toString());

		HashSet<Name> a9 = secretSantaList.select(2,9);
		System.out.println("Mehal has" +a9.toString());

		HashSet<Name> a10 = secretSantaList.select(4,10);
		System.out.println("Viren has" +a10.toString());

		HashSet<Name> a11 = secretSantaList.select(2,11);
		System.out.println("Dipesh/Smita has" +a11.toString());

		HashSet<Name> a12 = secretSantaList.select(2,12);
		System.out.println("Depeeka has" +a12.toString());		


		System.out.println("Size " +secretSantaList.size());


	}
}


class Name {
	String Name;
	int Family;

	public Name(String name, int familyNumber)
	{
		this.Name = name;
		this.Family = familyNumber;
	}


	public String getName()
	{
		return this.Name;
	}

	public int getFamily()
	{
		return this.Family;
	}

	@Override
	public String toString()
	{
		return  this.Name;
	}

}