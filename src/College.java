abstract class College {
    abstract void department();
}

class Engineering extends College {
    void department() {
        System.out.println("ECE Department");
    }

    public static void main(String[] args) {
        Engineering e = new Engineering();
        e.department();
    }
}
