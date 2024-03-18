import java.util.*;
class marks {

    public int englishMarks(int englishMarks) {

        if (englishMarks < 0 && englishMarks>100) {
            System.out.println("invalid marks");
        } else ;
        return englishMarks;
    }

    public int mathMarks(int mathMarks) {

        if (mathMarks < 0 && mathMarks>100) {
            System.out.println("invalid marks");
        } else ;
        return mathMarks;
    }

    public int scienceMarks(int scienceMarks) {

        if (scienceMarks < 0 && scienceMarks>100) {
            System.out.println("invalid marks");
        } else ;
        return scienceMarks;
    }
public int historyMarks(int historyMarks){

    if (historyMarks<0 && historyMarks>100){
        System.out.println("invalid marks");
    }
    else ;return historyMarks;
}
public int geographyMarks(int geographyMarks){

    if (geographyMarks<0 && geographyMarks>100){
        System.out.println("invalid marks");
    }
    else ;return geographyMarks;
}
public int drawingMarks(int drawingMarks){

    if (drawingMarks<0 && drawingMarks>100){
        System.out.println("invalid marks");
    }
    else ;return drawingMarks;
}
}

public class I23Task2fCodsoftInternship {
    //input=take marks obtained out of 100 in each subject
    //calculate total marks:sum of marks obtained in all subject
    //calculate average %:devide total marks by no of subjects
    //grade calculation:assign grade as per the mark
    //show total marks,avg % & corresponding grade

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int ch=sc.nextInt();
    marks m1=new marks();
        System.out.println("enter english marks ");
      int enMarks=m1.englishMarks (sc.nextInt());
        System.out.println("enter math marks");
        int mathMarks=m1.mathMarks(sc.nextInt());
        System.out.println("enter the science marks");
        int scMarks=m1.scienceMarks(sc.nextInt());
        System.out.println("enter history marks");
       int hsMarks= m1.historyMarks(sc.nextInt());
        System.out.println("enter geography marks");
        int geoMarks=m1.geographyMarks(sc.nextInt());
        System.out.println("enter drawing  marks");
        int drawMarks=m1.drawingMarks(sc.nextInt());

        int totalMarks=m1.englishMarks(enMarks)+m1.mathMarks(mathMarks)+m1.scienceMarks(scMarks)+m1.historyMarks(hsMarks)+m1.geographyMarks(geoMarks)+m1.drawingMarks(drawMarks);
        System.out.println("total marks obtained in all subjects out of 600 is "+totalMarks);

        int aggregatePercentage =totalMarks/6;
        System.out.println("aggregate percentage are "+aggregatePercentage +" %");




        if (aggregatePercentage >90){
                System.out.println("the grade is merit");
            }
           else if (aggregatePercentage>=75 && aggregatePercentage<=90){
                System.out.println("the grade is distinction");
            }
            else if (aggregatePercentage>=60 && aggregatePercentage<75){
                System.out.println("the grade is 1st class");
            }
           else if (aggregatePercentage>=50 && aggregatePercentage<60){
                System.out.println("the grade is 2nd class");
            }
         else if (aggregatePercentage>=35 && aggregatePercentage<50){
                System.out.println("the grade is 3rd class");
            }
      else if (aggregatePercentage <35){
                System.out.println("fail");
            }



    }
}
