package com.example.design_patterns.Aspect;

public class AppContext {
    private static String username = "";
    private static String password = "";
    private static String[] roles = {};

    public static void authenticateUser(String name, String pwd, String[] rolleList) {
        if ((name.equals("ARACHE")) && (pwd.equals("ARACHE123"))) {
            username = name;
            password = pwd;
            roles = rolleList;
        } else throw new RuntimeException(" forbidden , username or password unknown ..");
    }

    public static boolean hasRole(String role) {
        for (String r : roles)
            if (r.equals(role))
                return true;
        return false;
    }
}