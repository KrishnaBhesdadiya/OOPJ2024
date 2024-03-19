class Box extends TestNew{
	int height;
	int width;

	public Box(){
		height = 10;
		width = 5;
	}

	public Box(int height, int width){
		this.height = height;
		this.width = width;
	}

	public void print(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				chaapEJLineMa("* ");
			}
			chaapBijiLineMa("");
		}
		chaapBijiLineMa("==============================");
	}
}
public class AdditionDemo{
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.print();

		Box b2 = new Box(5,10);
		b2.print();
	}
}