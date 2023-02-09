public class Java {
    private  int codeIshtoo ;

    public Java(int students) {
        this.codeIshtoo = students;
    }

    public int getStudents() {
        return codeIshtoo;
    }

    public void setStudents(int students) {
        this.codeIshtoo = students;
    }
    public void  java () {
        System.out.println("""
                'Java'
                Kylagan zhumushu = Cod ishteit
             
                """);
    }

    @Override
    public String toString() {
        return "Java{" +
                "codeIshtoo=" + codeIshtoo +
                '}';
    }
}
