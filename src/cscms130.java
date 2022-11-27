public class cscms130 {
    public static void main(String[] args) {
        class Student{
            public int id;
            public String name;
            public char gender;
            public int score;

            public Student(int id, String name, char gender, int score){
                this.id = id;
                this.name = name;
                this.gender = gender;
                this.score = score;
            }
            //=====getters====
            public int getId(){
                return id;
            }
            public String getName(){
                return name;
            }
            public char getGender(){
                return gender;
            }
            public int getScore(){
                return score;
            }

            //=====setters=====
            public void setId(int id){
                this.id = id;
            }
            public void setName(String name){
                this.name = name;
            }
            public void setGender(char gender){
                this.gender = gender;
            }
            public void setScore(int score){
                this.score = score;
            }
            //====method===
            public char calGPA(){
                if (score >= 80 && score <= 100)
                    return 'A';
                else if (score >= 70 && score <= 79)
                    return 'B';
                else if (score >= 60 && score <= 69)
                    return 'C';
                else if (score >= 50 && score <= 59)
                    return 'D';
                else
                    return 'F';
            }

        }
    }
}
