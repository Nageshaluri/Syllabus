package Question4;
class Overide {
	    private void privateMethod() {
	        System.out.println("Printing  private method");
	    }
	    public static void staticMethod() {
	        System.out.println("Printing  static method");
	    }
	}
	class Derived extends Overide {
	    private void privateMethod() {
	        System.out.println("Printing Derived private method");
	    }
	    public static void staticMethod() {
	        System.out.println("Printing Derived static method");
	    }
	}
	class Main {
	    public static void main(String[] args) {
	        Derived d = new Derived();
	        Overide b = new Derived();
	         b.privateMethod();
	         d.staticMethod();
	         Overide.staticMethod();
	    }
	}

