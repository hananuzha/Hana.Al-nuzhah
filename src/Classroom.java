public class Classroom extends Room {
    private int numStudents;

    public Classroom(double arg1, double arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3);
        this.numStudents = arg4;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity = " + numStudents;
    }

    public static Classroom[] isItClassroom(Room[] rooms) {
        int maximumSize=rooms.length;
        Classroom[] classrooms=new Classroom[maximumSize];
        int j=0;
        for(int i=0;i<rooms.length;i++){
            if(rooms[i] instanceof  Classroom) {
                classrooms[j] = (Classroom) rooms[i];
                j++;
            }
        }
        return classrooms;

    }

    public static void main(String[] args) {
        Room r1=new Classroom(3,5,3,12);
        Room r2=new Room(3,19,3);
        Classroom r3=new Classroom(3,43,3,18);
        Room [] rooms={r1,r2,r3};
        Classroom[] c=isItClassroom(rooms);

        for(int i=0;i<c.length;i++){
            if(c[i]!=null)
                System.out.println( c[i].toString());
        }
    }
}


