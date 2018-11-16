package io.chris.training.Algorithm;

public class Comparator implements java.util.Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getLastName().equals(o2.getLastName())){
            if(o1.getAge()==o2.getAge()){
                return o1.getFirstName().compareTo(o2.getFirstName());
            }else{
                return o1.getAge()-o2.getAge();
            }
        }else{
            return o1.getLastName().compareTo(o2.getLastName());
        }
//      if (o1.getLastName().charAt(0)==o2.getLastName().charAt(0)){
//          if (o1.getAge()==o2.getAge()){
//              if (o1.getFirstName().charAt(0)==o2.getFirstName().charAt(0)){
//                  return 0;
//              }else if (o1.getFirstName().charAt(0)<o2.getFirstName().charAt(0)){
//                  return -1;
//              }else{
//                  return 1;
//              }
//          }else if (o1.getAge()<o2.getAge()){
//              return -1;
//          }else{
//              return 1;
//          }
//      }else if (o1.getLastName().charAt(0)<o2.getLastName().charAt(0)){
//          return -1;
//      }else{
//          return 1;
//      }

    }
}
