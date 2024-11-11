class Student
{
    constructor(name, rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    presentation()
    {
        return 'Student ' + this.name + 'roll number: ' + this.rollNo + ' has given presenetation';
    }
}
class Department extends Student
{
    constructor(name, stream, rollNo)
    {
        super(name, rollNo);
        this.stream = stream;
    }

    display()
    {
        return this.presentation() + ', and is from ' + this.stream;
    }
}

const student1 = new Department("vijay", "CSE", 101);
document.write(student1.display());
