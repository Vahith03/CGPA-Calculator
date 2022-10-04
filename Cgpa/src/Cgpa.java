import java.util.*;
public class Cgpa {
    // Sem 1
    public static float sem1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 1 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7;
        System.out.println("50 EN 001 : Communication Skills I : ");
        s1=in.next();
        System.out.println("50 MA 001 : Calculus and Differential Equations : ");
        s2=in.next();
        System.out.println("50 CH 001 : Applied Chemistry : ");
        s3=in.next();
        System.out.println("50 ME 003 : Engineering Mechanics : ");
        s4=in.next();
        System.out.println("50 CS 001 : Programming for Problem Solving : ");
        s5=in.next();
        System.out.println("50 CH 0P1 : Chemistry Laboratory : ");
        s6=in.next();
        System.out.println("50 CS 0P1 : Programming for Problem Solving Laboratory : ");
        s7=in.next();
        int v1,v2,v3,v4,v5,v6,v7;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*2;

        // Subject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *4;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *3;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*4;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*3;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*2;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7;
        sgpa=total/20;

        return sgpa;

    }
    // Sem 2
    public static float sem2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 2 Marks :");
        String s1,s2,s3,s4,s5,s6,s7;
        System.out.println("50 EN 002 : Communication Skills II : ");
        s1=in.next();
        System.out.println("50 MA 002 : Laplace Transform and Complex Variables : ");
        s2=in.next();
        System.out.println("50 PH 003 : Semiconductor Optoelectronics : ");
        s3=in.next();
        System.out.println("50 EE 001 : Basic Electrical Engineering : ");
        s4=in.next();
        System.out.println("50 ME 002 : Engineering Graphics : ");
        s5=in.next();
        System.out.println("50 PH 0P2 : Applied Physics Laboratory : ");
        s6=in.next();
        System.out.println("50 ME 0P1 : Engineering Practices Laboratory : ");
        s7=in.next();
        int v1,v2,v3,v4,v5,v6,v7;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= 2*v1;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *4;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *3;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*3;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*4;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*2;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7;
        sgpa=total/20;

        return sgpa;

    }
    // Sem 3
    public static float sem3()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 3 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7;
        System.out.println("50 MA 005 : Probability and Statistics : ");
        s1=in.next();
        System.out.println("50 CS 002 : Data Structures : ");
        s2=in.next();
        System.out.println("50 CS 003 : Object Oriented Programming : ");
        s3=in.next();
        System.out.println("50 EC 002 : Digital Logic Circuits : ");
        s4=in.next();
        System.out.println("50 IT 301 : Software Engineering: ");
        s5=in.next();
        System.out.println("50 CS 0P2 : Data Structures Laboratory : ");
        s6=in.next();
        System.out.println("50 CS 0P3 : Object Oriented Programming Laboratory : ");
        s7=in.next();
        int v1,v2,v3,v4,v5,v6,v7;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*4;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *3;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*5;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*4;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*2;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7;
        sgpa=total/23;

        return sgpa;

    }
    // Sem 4
    public static float sem4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 4 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7;
        System.out.println("50 MA 011 : Discrete Mathematics : ");
        s1=in.next();
        System.out.println("50 IT 001 : Design and Analysis of Algorithms : ");
        s2=in.next();
        System.out.println("50 IT 401 : Java Programming : ");
        s3=in.next();
        System.out.println("50 IT 402 : Computer Organization and Architecture : ");
        s4=in.next();
        System.out.println("50 IT 403 : Operating Systems : ");
        s5=in.next();
        System.out.println("50 IT L** : Open Elective I : ");
        s6=in.next();
        System.out.println("50 IT 4P1 : Java Programming Laboratory : ");
        s7=in.next();
        System.out.println("50 IT 4P2 Operating Systems and Open Source Laboratory : ");
        String s8 = in.next();
        int v1,v2,v3,v4,v5,v6,v7,v8;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*4;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *3;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*3;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*3;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*3;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        // Subject 8
        v8 = switch (s8) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v8 = v8*2;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7+v8;
        sgpa=total/23;

        return sgpa;

    }
    // Sem 5
    public static float sem5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 5 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7;
        System.out.println("50 IT 501 : Computer Networks : ");
        s1=in.next();
        System.out.println("50 IT 502 : Database Management Systems : ");
        s2=in.next();
        System.out.println("50 IT 503 : Programming using Python : ");
        s3=in.next();
        System.out.println("50 IT E1* : Elective – I : ");
        s4=in.next();
        System.out.println("50 IT L** Open Elective – II : ");
        s5=in.next();
        System.out.println("50 IT 5P1 : Networking Laboratory : ");
        s6=in.next();
        System.out.println("50 IT 5P2 : Database Management Systems Laboratory : ");
        s7=in.next();
        System.out.println("You have any other subject enter the Y or N : ");
        String s8 ;
        int credit ;
        String ans=in.next();
        if(ans.equals("y")||ans.equals("Y")){
            System.out.println("Enter that subject credit :");
            credit = in.nextInt();
            System.out.println("Enter your mark :");
            s8=in.next();
        }
        else{
            s8="AB";
            credit=0;
        }
        int v1,v2,v3,v4,v5,v6,v7,v8;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*3;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *4;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*3;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*3;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*2;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        // Subject 8
        v8 = switch (s8) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v8 = v8*credit;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7+v8;
        int c = 20+credit;
        sgpa=total/c;

        return sgpa;

    }
    // Sem 6
    public static float sem6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 6 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7,s8;
        System.out.println("50 IT 601 : Data Science : ");
        s1=in.next();
        System.out.println("50 IT 602 : Web Technology : ");
        s2=in.next();
        System.out.println("50 IT 603 : Machine Learning : ");
        s3=in.next();
        System.out.println("50 IT 604 : Software Testing : ");
        s4=in.next();
        System.out.println("50 IT E2* : Elective  II : ");
        s5=in.next();
        System.out.println("50 IT L** : Open Elective  III : ");
        s6=in.next();
        System.out.println("50 IT 6P1 : Data Science Laboratory : ");
        s7=in.next();
        System.out.println("50 IT 6P2 : Design Project");
        s8=in.next();
        System.out.println("You have any other subject enter the Y or N : ");
        String s9 ;
        int credit ;
        String ans=in.next();
        if(ans.equals("y")||ans.equals("Y")){
            System.out.println("Enter that subject credit :");
            credit = in.nextInt();
            System.out.println("Enter your mark :");
            s9=in.next();
        }
        else{
            s9="AB";
            credit=0;
        }
        int v1,v2,v3,v4,v5,v6,v7,v8,v9;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*3;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *4;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*3;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*3;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*2;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        // Subject 8
        v8 = switch (s8) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v8 = v8*2;

        // Subject 9
        v9 = switch (s9) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v9 = v9*credit;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7+v8+v9;
        int c = 23+credit;
        sgpa=total/c;

        return sgpa;

    }
    // Sem 7
    public static float sem7(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 7 Marks : ");
        String s1,s2,s3,s4,s5,s6,s7,s8;
        System.out.println("50 HS 001 : Engineering Economics and Financial Accounting : ");
        s1=in.next();
        System.out.println("50 IT 701 : Mobile Communication : ");
        s2=in.next();
        System.out.println("50 IT 702 : Cloud Computing : ");
        s3=in.next();
        System.out.println("50 IT 703 : Cryptography and Network Security : ");
        s4=in.next();
        System.out.println("50 IT E3* : Elective – III : ");
        s5=in.next();
        System.out.println("50 IT L** : Open Elective – IV : ");
        s6=in.next();
        System.out.println("50 IT 7P1 : Cloud Computing Laboratory : ");
        s7=in.next();
        System.out.println("50 IT 7P2 : Project Work - Phase I : ");
        s8=in.next();
        System.out.println("You have any other subject enter the Y or N : ");
        String s9 ;
        int credit ;
        String ans=in.next();
        if(ans.equals("y")||ans.equals("Y")){
            System.out.println("Enter that subject credit :");
            credit = in.nextInt();
            System.out.println("Enter your mark :");
            s9=in.next();
        }
        else{
            s9="AB";
            credit=0;
        }
        int v1,v2,v3,v4,v5,v6,v7,v8,v9;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*3;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *3;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*4;

        // subject 5
        v5 = switch (s5) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v5 = v5*3;

        // subject 6
        v6 = switch (s6) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v6 = v6*3;

        // Subject 7
        v7 = switch (s7) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v7 = v7*2;

        // Subject 8
        v8 = switch (s8) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v8 = v8*2;

        // Subject 9
        v9 = switch (s9) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v9 = v9*credit;

        float sgpa,total;
        total= v1+v2+v3+v4+v5+v6+v7+v8+v9;
        int c = 23+credit;
        sgpa=total/c;

        return sgpa;

    }
    // Sem 8
    public static float sem8(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sem 8 Marks : ");
        String s1,s2,s3,s4;
        System.out.println("50 IT E4* : Elective  IV : ");
        s1=in.next();
        System.out.println("50 IT E5* : Elective – V : ");
        s2=in.next();
        System.out.println("50 IT 8P1 : Project Work - Phase II : ");
        s3=in.next();
        System.out.println("You have any other subject enter the Y or N : ");
        int credit ;
        String ans=in.next();
        if(ans.equals("y")||ans.equals("Y")){
            System.out.println("Enter that subject credit :");
            credit = in.nextInt();
            System.out.println("Enter your mark :");
            s4=in.next();
        }
        else{
            s4="AB";
            credit=0;
        }
        int v1,v2,v3,v4;

        // Subject 1
        v1 = switch (s1) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v1= v1*3;

        // SUbject 2
        v2 = switch (s2) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v2 = v2 *3;

        // Subject 3
        v3 = switch (s3) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v3 = v3 *8;

        // subject 4
        v4 = switch (s4) {
            case "o", "O" -> 10;
            case "a+", "A+" -> 9;
            case "a", "A" -> 8;
            case "b+", "B+" -> 7;
            case "b", "B" -> 6;
            default -> 0;
        };
        v4 = v4*credit;

        float sgpa,total;
        total= v1+v2+v3+v4;
        int c = 14+credit;
        sgpa=total/c;

        return sgpa;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to 'K S Rangasamy College Of Technology' CGPA Calculator");
        System.out.println("\nIt will perform only 'IT' Department in 18th Regulation ");
        System.out.println("\nGrades : O = 10 , A+ = 9 , A = 8 , B+ = 7 , B = 6 and You enter fail or absent or any other grade it will be 'ZERO' ");
        System.out.println("\nHow many Semester you want to Enter : ");
        int upto = in.nextInt();
        switch (upto)
        {
            case 1 -> {
                float t = sem1();
                System.out.printf("Your SGPA was : %.2f\n", t);
                System.out.printf("Your CGPA was : %.2f", t);
            }
            case 2 -> {
                float t1 = sem1();
                float t2 = sem2();
                float cgpa = (t1 + t2) / 2;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 3 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float cgpa = (t1 + t2 + t3) / 3;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 4 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float t4 = sem4();
                float cgpa = (t1 + t2 + t3 + t4) / 4;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your sem4 SGPA was : %.2f\n", t4);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 5 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float t4 = sem4();
                float t5 = sem5();
                float cgpa = (t1 + t2 + t3 + t4 + t5) / 5;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your sem4 SGPA was : %.2f\n", t4);
                System.out.printf("Your sem5 SGPA was : %.2f\n", t5);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 6 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float t4 = sem4();
                float t5 = sem5();
                float t6 = sem6();
                float cgpa = (t1 + t2 + t3 + t4 + t5 + t6) / 6;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your sem4 SGPA was : %.2f\n", t4);
                System.out.printf("Your sem5 SGPA was : %.2f\n", t5);
                System.out.printf("your sem6 SGPA was : %.2f\n", t6);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 7 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float t4 = sem4();
                float t5 = sem5();
                float t6 = sem6();
                float t7 = sem7();
                float cgpa = (t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your sem4 SGPA was : %.2f\n", t4);
                System.out.printf("Your sem5 SGPA was : %.2f\n", t5);
                System.out.printf("your sem6 SGPA was : %.2f\n", t6);
                System.out.printf("Your CGPA SGPA was : %.2f\n", t7);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            case 8 -> {
                float t1 = sem1();
                float t2 = sem2();
                float t3 = sem3();
                float t4 = sem4();
                float t5 = sem5();
                float t6 = sem6();
                float t7 = sem7();
                float t8 = sem8();
                float cgpa = (t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8) / 8;
                System.out.printf("YOur sem1 SGPA was : %.2f\n", t1);
                System.out.printf("YOur sem2 SGPA was : %.2f\n", t2);
                System.out.printf("your sem3 SGPA was : %.2f\n", t3);
                System.out.printf("Your sem4 SGPA was : %.2f\n", t4);
                System.out.printf("Your sem5 SGPA was : %.2f\n", t5);
                System.out.printf("your sem6 SGPA was : %.2f\n", t6);
                System.out.printf("Your CGPA SGPA was : %.2f\n", t7);
                System.out.printf("Your CGPA SGPA was : %.2f\n", t8);
                System.out.printf("Your CGPA was : %.2f", cgpa);
            }
            default -> System.out.println("Wrong Choice :(  ");
        }
    }
}
