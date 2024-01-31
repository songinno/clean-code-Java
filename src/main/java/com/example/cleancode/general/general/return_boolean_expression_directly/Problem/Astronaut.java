package com.example.cleancode.general.general.return_boolean_expression_directly.Problem;

public class Astronaut {

    String name;
    int missions;

    /*
    * mssions : 음수이면 안됨
    * name : null이거나 빈 문자열이면 안됨
    * */
    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            // trim() : 문자열의 앞 뒤 공백 제거
            return false;
        } else  {
            return true;
        }
    }
}
