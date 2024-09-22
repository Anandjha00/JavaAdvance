/**
 * CourseObjject
 */
 class CourseObjject {

  static int maxcapacity=100;

  String courseName;

  int  enrolledStudents;

  CourseObjject(String courseName,int enrolledStudents){
    this.courseName=courseName;
    this.enrolledStudents=enrolledStudents;
  }


  static void setmaxCapacity(int capacity){
    CourseObjject.maxcapacity =maxcapacity;
  }

  void enrolledStudents(String studentname){

  }
  void  unenrolledStudents(String studentname){

  }



  
}