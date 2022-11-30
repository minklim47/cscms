package cscms149;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Library {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name){
        this.name = name;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public boolean removeEmployee(int employeeId){
        for (Employee employee : employees){
            if (employee.getEmployeeId() == employeeId){
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }
    public int getNumberOfEmployees(){
        return employees.size();
    }
    public double getTotalSalary(){
        double sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
    public void addBook(Book book){
        books.add(book);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
    public void printInfoOfAllBooks(){
        for(int i=0;i<this.books.size();i++){
            System.out.println("(id: "+this.books.get(i).getId()+", name : "+this.books.get(i).getName()+")");
        }
    }
    public int searchBookByName(String name){
        int count = 0;
        for (Book book : books){
            if (name.equals(book.getName())){
                count++;
            }
        }
        return count;
    }
    public int searchBookById(int id){
        for (Book book : books){
            if (id == book.getId()){
                return books.indexOf(book);
            }
        }
        return -1;
    }
    public Book borrowBook(int id){
        Book temp;
        for (Book book : books){
            if (id == book.getId()){
                books.remove(book);
                return book;
            }
        }
        return null;
    }
    public void returnBook(Book book){
        books.add(book);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
    public int getAmountOfBooks(){
        return books.size();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

