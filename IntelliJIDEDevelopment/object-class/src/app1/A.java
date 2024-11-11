package app1;

class A
{
    String studentName;
    int studentRollNo;

    public A(String studentName, int studentRollNo)
    {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    @Override
    public String toString()
    {
        return "A{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                '}';
    }

    public static void main(String[] args)
    {
        A a1 = new A("vijay", 101);
        System.out.println(a1);
    }


}
