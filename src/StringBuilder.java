class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original String: " + sb);

        sb.append(" Java");
        System.out.println("After Append: " + sb);

        sb.insert(5, " World");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb);

        sb.delete(2, 8);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}