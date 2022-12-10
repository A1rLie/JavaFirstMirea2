package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IP {
    private Pattern pattern;
    private Matcher matcher;

    private static final String IPPattern
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IP() {
        pattern = Pattern.compile(IPPattern);
    }

    public boolean validate(final String ip) {
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {

        IP ip = new IP();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Введи IP >> ");
            System.out.println(ip.validate(scanner.next()));
        }
    }

}
