public class LabExer1A
{
	public static void main(String[]args)
	{
		int FaveNum=16;
		String FaveCartoon="Grizzly";
		char MT='T';
		char [] NickName={'e','l','a','i','n','e'};
		
		System.out.println(FaveNum + " is my favorite number.");
		System.out.println("I love " + FaveCartoon + "!");
		System.out.println("My name is Joanna Elaine " + MT + " Chavez.");
		System.out.print("You can call me ");
		
		for (int a=0; NickName.length>a; a++){
		
		System.out.print(NickName[a]);
		}
	}
}