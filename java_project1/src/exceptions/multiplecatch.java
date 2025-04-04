package exceptions;

public class multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
        int a=5/0;
        System.out.println("No Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error handled");
		}
        catch(Exception e) {
        	e.printStackTrace();
        }
		
		finally {
			System.out.println("This will executed always..........");
		}
	}

}
