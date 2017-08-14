package com.vkc.c;

import android.support.v7.app.AppCompatActivity;
import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider extends AppCompatActivity {

    public HashMap<Integer, Pair<String,List<String>>> getInfo()
    {
        HashMap<Integer, Pair<String,List<String>>> Topic_details = new HashMap<Integer, Pair<String, List<String>>>();
        List<String> Introduction = new ArrayList<String>();
        Introduction.add("a) History of C++?");
        Introduction.add("b) What is C++?");
        Introduction.add("c) Basic syntax & Theory");
        Introduction.add("d) Comments in C++");
       // Introduction.add("Advantage & Disadvantage of C++");

        List<String> DataType = new ArrayList<String>();
        DataType.add(" a) What is DataType?");
        //DataType.add("Type of DataType");

        List<String> Variables = new ArrayList<String>();
        Variables.add("a) What is variables?");
        Variables.add("b) Types and scope of variables");
        Variables.add("c) Static Members");
        // Variables.add(" Use of variables");

        List<String> Operator = new ArrayList<String>();
        Operator.add("a) What is operator?");
        //Operator.add(" Types of operator in C++");

        List<String> FlowControl = new ArrayList<String>();
        FlowControl.add("a) Statements and  flow control");

        List<String> Function = new ArrayList<String>();
        Function.add("a) Define function & its type?");
        Function.add("b) User defined function with example");

        List<String>Array=new ArrayList<String>();
        Array.add("a) What is array and how its work?");
        Array.add("b) Multidimensinal array");
        Array.add("c) Use of array in Function");

        List<String>Pointer=new ArrayList<String>();
        Pointer.add("a) What is pointer and how its work?");
        Pointer.add("b) Pointers and Arrays");
        Pointer.add("c) Pointers and Functions");

        List<String> OOPS= new ArrayList<String>();
        OOPS.add("a) OOps Principle & Access control in class");
        OOPS.add("b) Acessing data members & Member function in class");
        OOPS.add("c) Inline function ");
        OOPS.add("d) Function Overloading");
        OOPS.add("e) Refrence in C++");
        OOPS.add("f) Constructor and Destructor");

        List<String> Encapsulation = new ArrayList<String>();
        Encapsulation.add("a) What is Data Encapsulation and its use?");

        List<String> Abstaction = new ArrayList<String>();
        Abstaction.add("a) What is Data Abstraction and its use?");

        List<String> Inheritance = new ArrayList<String>();
        Inheritance.add("a) Introduction and Purpose of Inheritance");
        Inheritance.add("b) Types of inheritance with program");
        Inheritance.add("c) Order of Constructor call");
        Inheritance.add("d) Upcasting");

        List<String> Polymorphism = new ArrayList<String>();
        Polymorphism.add("a) Function Overriding");
        Polymorphism.add("b) Virtual Function");
        Polymorphism.add("c) Abstract class and PureVirtual function");
        Polymorphism.add("d) Virtual destructor");

      //  List<String> Files = new ArrayList<String>();
        //Files.add(" File Handling");

        List<String> AdvanceConcepts = new ArrayList<String>();
        AdvanceConcepts.add("Dynamic Memory Allocation");
        AdvanceConcepts.add("File Handling");
        AdvanceConcepts.add("Exception Handling");
        AdvanceConcepts.add("Template");


        Topic_details.put(1, Pair.create("Introduction",Introduction));
        Topic_details.put(2, Pair.create("DataType",DataType));
        Topic_details.put(3, Pair.create("Variables",Variables));
        Topic_details.put(4, Pair.create("Operator",Operator));
        Topic_details.put(5, Pair.create("FlowControl",FlowControl));
        Topic_details.put(6, Pair.create("Function",Function));
        Topic_details.put(7, Pair.create("Array",Array));
        Topic_details.put(8, Pair.create("Pointer",Pointer));

        Topic_details.put(9, Pair.create("OOPS",OOPS));
        Topic_details.put(10, Pair.create("Encapsulation",Encapsulation));
        Topic_details.put(11, Pair.create("Abstaction",Abstaction));
        Topic_details.put(12, Pair.create("Inheritance",Inheritance));
        Topic_details.put(13, Pair.create("Polymorphism",Polymorphism));
        Topic_details.put(14, Pair.create("Advance concept",AdvanceConcepts));
        return Topic_details;
    }

}