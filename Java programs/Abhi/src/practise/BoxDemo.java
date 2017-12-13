package practise;

public class BoxDemo {
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
		
		Box mybox1=new Box(10,20,15);
		Box mybox2=new Box(3,6,9);
		//int depth;
		//int height;
		//int width;
		double vol1;
		double vol2;
		vol1=mybox1.volume();
		vol2=mybox2.volume();
		System.out.println("volume of box1 is"+ vol1);
		System.out.println("volume of box2 is"+ vol2);
	}

}
