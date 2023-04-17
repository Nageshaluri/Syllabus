package Question2;
class Override {
	public void publicMethod() {
        System.out.println("Public Method");
    }
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    void defaultMethod() {
        System.out.println("Default Method");
    }
    private void privateMethod() {
        System.out.println("Private Method");
    }
}
class SubClass extends Override {
    public void publicMethod() {
        System.out.println("Overridden Public Method");
    }
    protected void protectedMethod() {
        System.out.println("Overridden Protected Method");
    }
    void defaultMethod() {
        System.out.println("Overridden Default Method");
    }
     private void privateMethod() {
     System.out.println("Overridden Private Method");
     }
}
class Main {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.publicMethod();   
        subClass.protectedMethod(); 
        subClass.defaultMethod();
        subClass.privateMethod();
    }
}
