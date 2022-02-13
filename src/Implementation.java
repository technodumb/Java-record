class CS_implementation implements CharSequence{
    private String s;
    CS_implementation(String s){
        this.s = new String(new StringBuffer(s).reverse());
    }

    public int length(){
        return s.length();
    }

    public CharSequence subSequence(int start, int end){
        return s.subSequence(start, end);
    }

    public char charAt(int i) {
        return s.charAt(i);
    }

    public String toString(){
        return s;
    }
}

public class Implementation {
    public static void main(String[] args) {
        CS_implementation cs = new CS_implementation("Hello");
        System.out.println(cs.charAt(1));
    }
}