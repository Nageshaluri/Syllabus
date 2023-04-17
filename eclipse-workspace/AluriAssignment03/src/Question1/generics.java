package Question1;

public class generics<org> {
    private org value;

    public void setValue(org value) {
        this.value = value;
    }

    public org getValue() {
        return value;
    }

    public static void main(String[] args) {
    	generics<String> var = new generics<>();
        var.setValue("Hello, Nagesh!");
        String stringValue = var.getValue();
        System.out.println(stringValue);

        generics<Integer> val = new generics<>();
        val.setValue(30);
    }
}

