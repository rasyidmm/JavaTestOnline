/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.regex.Pattern;

/**
 *
 * @author rasyid
 */
public class HelperValidationPassword {
    
    public static boolean cekPanjangPassword(String password){
        return password.length() >= 8;
    }
    public static boolean isValid(String password) {
//        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");
        
        boolean flag=true;

//        if (passwordhere.length() < 8) {
////            errorList.add("Password lenght must have alleast 8 character !!");
//            flag=false;
//        }
//        if (!specailCharPatten.matcher(password).find()) {
////            errorList.add("Password must have atleast one specail character !!");
//            flag=false;
//        }
        if (!UpperCasePatten.matcher(password).find()) {
//            errorList.add("Password must have atleast one uppercase character !!");
            flag=false;
        }
        if (!lowerCasePatten.matcher(password).find()) {
//            errorList.add("Password must have atleast one lowercase character !!");
            flag=false;
        }
        if (!digitCasePatten.matcher(password).find()) {
//            errorList.add("Password must have atleast one digit character !!");
            flag=false;
        }
        return flag;
    }
}