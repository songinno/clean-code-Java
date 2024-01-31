package com.example.cleancode.general.general.return_boolean_expression_directly.Solution2;

public class Astronaut {

    String name;
    int missions;

    /*
    * mssions : 음수이면 안됨
    * name : null이거나 빈 문자열이면 안됨
    * */
    boolean isValid() {
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();

        return isValidMissions && isValidName;
    }
}
