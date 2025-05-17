package Assignment1;
abstract class Marks {
	int marksICP;
	int marksDSA;
	double Percentage;
	abstract void getPercentage();
}
class CSE extends Marks{
	int algoDesign;
	CSE(int ICP,int DSA,int algo){
		marksICP=ICP;
		marksDSA=DSA;
		algoDesign=algo;
	}
    void getPercentage() {
		Percentage=(marksICP+marksDSA+algoDesign)/3.0;
		System.out.println("Percentage of CSE student:"+Percentage);
	}
}
class NonCSE extends Marks{
	int enggMechanics;
	NonCSE(int ICP,int DSA,int engg){
		marksICP=ICP;
		marksDSA=DSA;
		enggMechanics=engg;
	}
    void getPercentage() {
		Percentage=(marksICP+marksDSA+enggMechanics)/3.0;
		System.out.println("Percentage of CSE student:"+Percentage);
	}
}
public class Test {

	public static void main(String[] args) {
		CSE obj1=new CSE(80,89,95);
		NonCSE obj2=new NonCSE(80,89,95);
		obj1.getPercentage();
		obj2.getPercentage();
	}

}
